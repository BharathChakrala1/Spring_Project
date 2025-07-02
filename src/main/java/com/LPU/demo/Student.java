package com.LPU.demo;

public class Student {
	private String sName;
	private long sRollNo;
	private String sEmail;
	
	
	public Student(String sName, long sRollNo, String sEmail) {
		this.sName = sName;
		this.sRollNo = sRollNo;
		this.sEmail = sEmail;
	}
	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}
	/**
	 * @param sName the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}
	/**
	 * @return the sRollNo
	 */
	public long getsRollNo() {
		return sRollNo;
	}
	/**
	 * @param sRollNo the sRollNo to set
	 */
	public void setsRollNo(long sRollNo) {
		this.sRollNo = sRollNo;
	}
	/**
	 * @return the sEmail
	 */
	public String getsEmail() {
		return sEmail;
	}
	/**
	 * @param sEmail the sEmail to set
	 */
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}	
	
}