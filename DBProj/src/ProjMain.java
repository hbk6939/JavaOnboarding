import java.sql.Date;
import java.util.Calendar;

import dao.DBConnent;
import vo.User;

public class ProjMain {

	public static void insert(User user) {
		DBConnent db = new DBConnent();
		db.connect();
		// db.insert(user);
		db.insert2(user);
		db.connClose();
	}

	public static void main(String[] args) {
		insert(new User(103, "차길동", "cha@kt.com", "경기도 과천시",
				new Date((Calendar.getInstance().getTime()).getTime()),
				"010-1212-2323"));
	}

}
