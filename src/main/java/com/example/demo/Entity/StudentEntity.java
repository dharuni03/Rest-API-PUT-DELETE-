package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {
	@Id
    private int id;
	private String studentname;
    private String departmentname;
    private String section;
    private long mobile;
    private String mailid;
    private String address;

           public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentEntity(int id, String studentname, String departmentname, String section, long mobile, String mailid,
			String address) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.departmentname = departmentname;
		this.section = section;
		this.mobile = mobile;
		this.mailid = mailid;
		this.address = address;
	}
	public StudentEntity()
	{
		
	}
		



	
}