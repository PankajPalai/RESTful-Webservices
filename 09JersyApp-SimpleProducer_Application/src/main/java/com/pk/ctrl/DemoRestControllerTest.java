package com.pk.ctrl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/demo")
public class DemoRestControllerTest {
	@GET
	@Path("/show")
	public String  m1() {
		return "congrats ...executed successfully";
	}

}
