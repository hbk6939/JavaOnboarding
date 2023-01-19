package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import vo.User;

public class DBConnent {
	Connection conn = null;

	public void connect() {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("db.properties");
			Properties dbprop = new Properties();
			dbprop.load(fis);

			String driver = dbprop.getProperty("driver");
			String url = dbprop.getProperty("url");
			String user = dbprop.getProperty("user");
			String password = dbprop.getProperty("password");

			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("DB Connected");

		} catch (IOException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}

	public void connClose() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(User user) {
		String sql = String.format(
				"insert into user values(%d,'%s','%s','%s','%s','%s')",
				user.getId(), user.getName(), user.getEmail(),
				user.getAddress(), user.getJoindate(), user.getTel());
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql); // SQL 문 실행에 영향을 받는 행 수를 반환
			if (cnt > 0) {
				System.out.println(cnt + "개 데이터가 삽입 되었습니다");
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (stmt != null) {
					System.out.println("Statement close");
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void insert2(User user) {
		String sql = "INSERT INTO user VALUES(?, ?, ?, ?, ?, ?);";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getAddress());
			pstmt.setDate(5, user.getJoindate());
			pstmt.setString(6, user.getTel());

			int cnt = pstmt.executeUpdate(sql);
			if (cnt > 0)
				System.out.println(cnt + "개 데이터가 삽입 되었습니다");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 미완
	public void select(Integer id) {
		String sql = "SELECT * FROM user WHERE id=?";
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<User> selectAll() {
		String sql = "SELECT * FROM user";
		List<User> users = new ArrayList<User>();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Integer id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				Date joindate = rs.getDate("joindate");
				String tel = rs.getString("tel");
				users.add(new User(id, name, email, address, joindate, tel));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt!=null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return users;
	}

}
