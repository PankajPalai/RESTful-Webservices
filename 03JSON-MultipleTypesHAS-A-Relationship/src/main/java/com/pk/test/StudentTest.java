package com.pk.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.Address;
import com.pk.model.ExamData;
import com.pk.model.Student;

public class StudentTest {

	public static void main(String[] args) {

		try {
			// creating model class object which will be convert to json further
			Student st = new Student();
			// adding list of values to List collection type properties
			List<String> academicsList = new ArrayList();
			academicsList.add("BSE-2011");
			academicsList.add("CHSE-2013");
			academicsList.add("BSC-2017");
			academicsList.add("MCA-2020");

			// adding list of values to Set collection type properties
			Set<String> subjectSet = new HashSet();
			subjectSet.add("JAVA SE");
			subjectSet.add("JAVA EE");
			subjectSet.add("SPRING");
			subjectSet.add("WEBSERVICES");
			subjectSet.add("SQL");
			subjectSet.add("HTML & CSS ");

			// setting values for HAS-A-RELATIONSHIP objects addr

			Address addr = new Address();
			addr.setLoc("Narendrapur");
			addr.setStritNum(36);
			addr.setLandmark("Patamundai");

			// setting values for HAS-A-RELATIONSHIP objects edata

			ExamData exData = new ExamData();
			List<Float> marks = new ArrayList<Float>();
			Float avg = 0.0f;
			marks.add(60.0f);
			marks.add(82.0f);
			marks.add(60.0f);
			marks.add(37.0f);
			Float sum = 0.0f;
			for (float f : marks) {
				sum = sum + f;
			}
			avg = sum / 4;

			exData.setStudentName("Pankaj Palai");
			exData.setAcademicYear(2017);
			exData.setMarks(marks);
			exData.setAvg(avg);

			// setting values to the student object
			st.setSno(101);
			st.setSname("Pankaj Palai");
			st.setAge(24);
			st.setEmail("pankajpalai405@gmail.com");
			st.setAcademicsList(academicsList);
			st.setSubject(subjectSet);
			st.setAddr(addr);
			st.setEdata(exData);

			// creating ObjectMapper class object given by JACKSON API having read and write
			// method
			// write method to convert java object to json and read method to convert json
			// to required object type

			ObjectMapper omp = new ObjectMapper();

			String json = omp.writeValueAsString(st);

			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
