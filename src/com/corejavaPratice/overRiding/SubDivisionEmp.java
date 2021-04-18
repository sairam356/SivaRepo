package com.corejavaPratice.overRiding;

public class SubDivisionEmp  extends Employee{

	public SubDivisionEmp() {
		// TODO Auto-generated constructor stub
	}
	
	public void getMyBranch(String  branchName) {
		 System.out.println("I am SubDvision employee "+branchName);
	}
	 public static void main(String[] args) {
			SubDivisionEmp sub = new  SubDivisionEmp();
			sub.getMyBranch("KOndapur");
		}

}
