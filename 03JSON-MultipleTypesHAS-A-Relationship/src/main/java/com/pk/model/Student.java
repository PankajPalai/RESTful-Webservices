package com.pk.model;

import java.util.List;
import java.util.Set;

import lombok.Data;
//generating getters,setters,default const,toString,hashCode and equals method via lombok api
@Data
public class Student {
	//declaring private data
	private Integer sno;
	private String sname;
	private String email;
	private int age;
	private List<String> academicsList;
	private Set<String> subject;
	private Address addr;
	private ExamData edata;
	
	

}
