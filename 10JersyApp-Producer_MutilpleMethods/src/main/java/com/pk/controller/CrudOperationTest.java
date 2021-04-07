package com.pk.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/edb")
public class CrudOperationTest {
	@POST
	@Path("/insert")
	public String insertEmp() {
		return "Employee data inserted successfully";
	}
	
	@GET
	@Path("/fetch")
	public String SelectEmp() {
		return "Employee data retrieved successfully";
	}
	@GET
	@Path("/remove")
	public String DeleteEmp() {
		return "Employee data deleted successfully";
	}
	@PUT
	@Path("/fetch")
	public String UpdateEmp() {
		return "Employee data altered successfully";
	}
	
	

}
