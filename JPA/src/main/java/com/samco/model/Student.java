package com.samco.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT") 
public class Student{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "STDID")
private int stuId;
@Column(name = "NAME")
private String stuName;
@Column(name = "DEPT")
private String stuDep;
@Column(name = "COLLEGEYEAR")
private String stuYear;
public Student(String stuName, String stuDep, String stuYear) {
super();
			
			this.stuName = stuName;
			this.stuDep = stuDep;
			this.stuYear = stuYear;
}
		
		public Student() {
			super();
		}
		
		public int getStuId() {
			return stuId;
		}
		public void setStuId(int stuId) {
			this.stuId = stuId;
		}
		public String getStuName() {
			return stuName;
		}
		public void setStuName(String stuName) {
			this.stuName = stuName;
		}
		public String getStuDep() {
			return stuDep;
		}
		public void setStuDep(String stuDep) {
			this.stuDep = stuDep;
		}
		public String getStuYear() {
			return stuYear;
		}
		public void setStuYear(String stuYear) {
			this.stuYear = stuYear;
		}

	}
