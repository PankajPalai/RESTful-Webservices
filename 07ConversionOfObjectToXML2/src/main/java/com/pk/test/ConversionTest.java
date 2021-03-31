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
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import com.pk.model.Address;
import com.pk.model.Employee;

public class ConversionTest {
	public static void main(String[] args) {

		// create model class object and asign values to all properties
		Employee emp = new Employee();
		emp.setEId(101);
		
		emp.setAge(24);
		emp.setEName("Pankaj");
		
		String[] s1 = new String[3];
		s1[0] = "java proj";
		s1[1] = "dotNet proj";
		s1[2] = "python proj";
		emp.setProjNames(s1);

		List<String> projModules = new ArrayList<>();
		projModules.add("m3");
		projModules.add("m2");
		projModules.add("m4");
		projModules.add("m1");
		emp.setProjModules(projModules);

		Set<Integer> TeamNos = new LinkedHashSet<Integer>();
		TeamNos.add(2);
		TeamNos.add(3);
		TeamNos.add(4);
		TeamNos.add(1);
		emp.setTeamNos(TeamNos);
		Map<String, Date> joinDate = new LinkedHashMap<String, Date>();
		joinDate.put("Pankaj Palai", new Date());
		joinDate.put("Soumya Palai", new Date());
		emp.setJoinDate(joinDate);
		Map<String, Float> salary = new LinkedHashMap<>();
		salary.put("pankaj", 55000f);
		salary.put("jay", 25000f);
		emp.setSalary(salary);

		// HAS-A-Property initalization

		Address addrs = new Address();
		
		addrs.setCity("kendrapara");
		addrs.setHouseNo(2635);
		addrs.setLandMark("Patrapur ");
		emp.setAddrs(addrs);
		String[] products = new String[3];//initializing values to array properties
		products[0] = "veg cutter";
		products[1] ="tshirt";
		products[2] = "glucon-D";
		emp.setProducts(products);
		
		
		try {
		JAXBContext jc =JAXBContext.newInstance(Employee.class);
		
		Marshaller mar=jc.createMarshaller();
		
		mar.marshal(emp,new File("g:/webServices/empnew.xml"));
		
		System.out.println("java object is converted into xml and stored in emps.xml");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}
