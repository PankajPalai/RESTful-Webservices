package com.pk.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.pk.model.Employee;


public class ConversionTest {

	public static void main(String[] args) {
		try {
		//1.create model class object
		Employee emp =new Employee();
		emp.setEId(101);
		emp.setEName("Pankaj Palai");
		emp.setEmailId("pankajpalai405@gmail.com");
		emp.setMobNum(8339097596l);
		//create JAXBContext object using JAXB class(or by passing jaxb class)
			JAXBContext jxb= JAXBContext.newInstance(Employee.class);
			//using jaxb object call method to create marshaller or unmarshaller
			Marshaller mar=jxb.createMarshaller();
			//call method  to perform operation that you want to perform
			mar.marshal(emp, new File("G:/webServices/web.xml"));
			System.out.println("done");
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
