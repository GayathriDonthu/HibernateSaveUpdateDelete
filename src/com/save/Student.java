package com.save;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "STUDENT")
public class Student {
	private int id;
	private String name;
	private String course;
	
	@Id
	@Column( name  = "ID", length = 34, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column( name = "NAME", length = 23, nullable = true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "COURSE", length = 54, nullable = true, updatable = true)
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
