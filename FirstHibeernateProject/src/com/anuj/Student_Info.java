package com.anuj;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="StudentInfo")
public class Student_Info implements Serializable
{
	@Id @GeneratedValue (strategy = GenerationType.AUTO)
	private int rollNo;
	
	@Column(name="FULL_NAME", nullable=false)
	private String name;
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Student_Info() {
		System.out.println("object created");
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
