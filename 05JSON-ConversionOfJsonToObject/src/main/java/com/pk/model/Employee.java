package com.pk.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class Employee {
	Integer eid;
	String ename;
	List<String> modules;
	Set<String>projects;
	String eadd;
	
	
	
	
	
}
