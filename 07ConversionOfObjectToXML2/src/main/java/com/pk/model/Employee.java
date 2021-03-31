package com.pk.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee{
	@XmlAttribute
	/*
	 * @XmlAttribute : By default every variable behaves like tag/element
    To convert one variable as attribute use this
    */
	private Integer eId;
	@XmlTransient
	private Integer age;
	/*
	@XmlTransient : To avoid any variable using in Object--XML Conversion
    apply this annotation.
    */
	@XmlElement(name = "employee-name")//used as alias name for convinient purpose
	private String eName;
	private String [] projNames;
	private List <String> projModules;
	private Set<Integer> TeamNos;
	private String[] products;
	@XmlElementWrapper(name="employee-salary")
	private Map<String,Float> salary;
	private Map<String,Date> joinDate;
	private Address addrs;
	
	
	public Employee() {
		System.out.println("employee 0 param constructor");
	}
}