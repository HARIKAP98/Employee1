package com.example.demo.model;

public class EmplyoeeDetails {
	private int empid;
	private String empname;
	private int salary;
	private int experience;
	
	public EmplyoeeDetails(int empid, String empname, int salary, int experience) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.experience = experience;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmplyoeeDetails [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", experience="
				+ experience + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmplyoeeDetails other = (EmplyoeeDetails) obj;
		if (empid != other.empid)
			return false;
		return true;
	}

	
}
