package com.pk.model;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement     //this makes our java class as JAXB class
public class Employee {
	
public Employee(){
	System.out.println(" Employee 0-param constructor ");	
}
	private Integer eId;
	private String eName;
	private Long mobNum;
	private String emailId;
	

}
