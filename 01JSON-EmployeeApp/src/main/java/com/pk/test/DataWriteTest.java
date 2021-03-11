package com.pk.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.Employee;

public class DataWriteTest {

	public static void main(String[] args) {
		try {
		Employee emp=new Employee();
		emp.setEno(101);
		emp.setEname("Pankaj Palai");
		emp.setEsal(20000.0);
		ObjectMapper omp=new ObjectMapper();
		omp.writeValue(new File("src/main/java/com/pk/helper/employeeData.json"), emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
