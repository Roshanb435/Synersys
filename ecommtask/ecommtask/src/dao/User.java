package dao;

import java.util.Objects;

public class User {
	private String uname;
	private String email;
	private long contact;
	private String pwd;
	private String cnfm_pwd;
	private char gender;
	public User(String uname, String email, long contact, String pwd, String cnfm_pwd, char gender) {
		super();
		this.uname = uname;
		this.email = email;
		this.contact = contact;
		this.pwd = pwd;
		this.cnfm_pwd = cnfm_pwd;
		this.gender = gender;
	}
	public User() {
		super();
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCnfm_pwd() {
		return cnfm_pwd;
	}
	public void setCnfm_pwd(String cnfm_pwd) {
		this.cnfm_pwd = cnfm_pwd;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(cnfm_pwd, other.cnfm_pwd) && contact == other.contact
				&& Objects.equals(email, other.email) && gender == other.gender && Objects.equals(pwd, other.pwd)
				&& Objects.equals(uname, other.uname);
	}
	
	

}
