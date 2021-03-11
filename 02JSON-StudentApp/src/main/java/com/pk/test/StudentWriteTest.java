package com.pk.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.Student;

public class StudentWriteTest {

	public static void main(String[] args) {
		int stCount=0;
		{
			++stCount;
		}

		try {
		Student st=new Student();
		st.setSno(stCount);
		st.setSname("Soumya Ranjan Palai");
		st.setSadd("bbsr");
		st.setMobile(9438561);
		

		Student st2=new Student();
		st2.setSno(stCount);
		st2.setSname("Pankaj Palai");
		st2.setSadd("hyd");
		st2.setMobile(96583026);
		
		ObjectMapper omp= new ObjectMapper();
		ObjectMapper omp2= new ObjectMapper();
		
		omp.writeValue(new File("C:Users/personal/Desktop/Raghu sir notes on webservices/studentData.json"), st);
		omp2.writeValue(new File("C:Users/personal/Desktop/Raghu sir notes on webservices/studentData.json"), st2);
		System.out.println(omp);
		System.out.println(st);
		System.out.println(st2);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
