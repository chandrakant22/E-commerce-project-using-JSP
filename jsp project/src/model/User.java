package model;

public class User {

	private int uid;
	private String fname;
	private String lname;
	private String email;
	private String mob;
	private String web;
	private String pass;
	private String terms;
	
	public User(int uid, String fname, String lname, String email, String mob, String web, String pass, String terms) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mob = mob;
		this.web = web;
		this.pass = pass;
		this.terms = terms;
	}
	
	public User(String fname, String lname, String email, String mob, String web, String pass, String terms) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mob = mob;
		this.web = web;
		this.pass = pass;
		this.terms = terms;
	}

	public User() { }

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	
	
	
	
	
	
}
