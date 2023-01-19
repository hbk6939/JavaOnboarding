package vo;

import java.sql.Date;

public class User {
	private Integer id;
	private String name;
	private String email;
	private String address;
	private Date joindate;
	private String tel;

	public User() {
	}

	public User(Integer id, String name, String email, String address,
			Date joindate, String tel) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.joindate = joindate;
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public Date getJoindate() {
		return joindate;
	}

	public String getTel() {
		return tel;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email
				+ ", address=" + address + ", joindate=" + joindate + ", tel="
				+ tel + "]";
	}
	
	

}
