package com.pk.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pk.model.UserDetails;

public class DataConversionTest {

	public static void main(String[] args) throws IOException {
		
		//create model class object that you want to convert into json
		UserDetails ud=new UserDetails();
		
		ud.setCity("hyd");
		ud.setUid(101);
		ud.setUname("pankajpalai405");
		ud.setPswd("Qwerty#12");
		ObjectMapper omp=new ObjectMapper();
		String json=omp.writeValueAsString(ud);
		System.out.println(json);
		omp.writeValue(new File("src/main/java/com/pk/helper/objectFiles/userInfo.txt"), ud);
		omp.writeValue(new File("src/main/java/com/pk/helper/objectFiles/userInfo.json"), ud);

		System.out.println("hello");

	}

}
