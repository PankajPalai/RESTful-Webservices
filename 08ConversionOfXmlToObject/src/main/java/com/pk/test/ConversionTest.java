package com.pk.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlTransient;

import com.pk.model.Address;
import com.pk.model.Employee;

public class ConversionTest {
	public static void main(String[] args) {

		// create model class object 
		Employee emp = new Employee();
		try {
			JAXBContext jc=JAXBContext.newInstance(Employee.class);
			Unmarshaller ums=jc.createUnmarshaller();
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		


	}

}
