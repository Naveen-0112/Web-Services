package com.app.MatrixParameter;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("msg")
public class Student {
	@Path("std")
	@GET
	public String showStd(
				@MatrixParam("stdId")Integer id,
				@MatrixParam("stdName")String name,
				@MatrixParam("stdSal")Double sal
			) {
		
		return "Hello:stdId="+id+"stdName="+name+"sfee="+sal;
	}
}
