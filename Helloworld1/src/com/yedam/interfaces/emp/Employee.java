package com.yedam.interfaces.emp;

/*
 * 사원번호(1001, 1002)
 * 사원이름(홍길동, 김민수)
 * 전화번호(654-1123, 654-3434)
 * 입사일자(2020-02-04)
 * 급여(300, 350)
 */

public class Employee {
	private int empNo;
	private String empName;
	private String telNo;
	private Date hireDate;
	private int salary;
	
	//생성자
	public Employee() {
	
	}
	
	public Employee(int emNo, String empName, String telNo) {
		this.empNo = empNo;
		this.empName = empName;
		this.telNo = telNo;
		this.hireDate = new Date();
		this.salary = 250;
	}
	
}
