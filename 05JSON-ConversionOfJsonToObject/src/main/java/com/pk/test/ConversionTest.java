package com.pk.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.Employee;

public class ConversionTest {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee();
		emp.setEname("Pankaj Palai");
		emp.setEid(101);

		Set<String> projects = new HashSet();
		projects.add("erp");
		projects.add("crm");
		projects.add("Banking application");

		List<String> moduleList = new ArrayList();
		moduleList.add("m1");
		moduleList.add("m2");
		moduleList.add("m3");
		emp.setModules(moduleList);
		emp.setProjects(projects);
		emp.setEadd("hyd");
		// convert the employee object data to global format (json) that will be
		// understood by all application
		ObjectMapper omp = new ObjectMapper();

	//	String json = omp.writeValueAsString(emp);
	//	System.out.println(json);

	//omp.writeValue(new File("src/main/java/com/pk/helper/objectFiles/userinfo.json"), emp);
		
	Employee emp2=omp.readValue(new File("src/main/java/com/pk/helper/objectFiles/userinfo.json"),Employee.class);
	System.out.println(emp2);
	
	String json="{\"eid\":10,\"ename\":\"A\",\"eadd\":\"bbsr\",\"modules\":[\"m1\",\"m2\",\"m3\"],\"projects\":[\"erp\",\"Banking application\",\"crm\"],\"eadd\":\"bnglr\"}";
	//Employee emp3=omp.readValue(json,Employee.class);
	//System.out.println(emp3);
	//System.out.println(emp);
	
	}

}
