package com.example.Student_Detail1.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="student")
public class PathModel1 {
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	    @Override
	public String toString() {
		return "PathModel1 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
		public PathModel1(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
		public int getId() {
		return id;
	}
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getGrade() {
		 return grade;
	 }
	 public void setGrade(String grade) {
		 this.grade = grade;
	 }
	 @Column
		private String name;
	    private String grade;
	    public PathModel1() {}

}
