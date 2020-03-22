package com.app.QueryParameter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/query")
public class Employee {

	@GET
	@Path("/emp")
	public String showMsg(@QueryParam("empId")Integer id,
							@QueryParam("empName")String name,
							@QueryParam("empSal")Double sal) {
		
		
		return "hello:empId="+id+","+"empName:"+name+","+"empSal"+sal;
	}
}
