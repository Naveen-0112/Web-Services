package com.app.FormParameter;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/form")
public class Employee {
	@POST
	@Path("/pay")
	public String empPya(
				@FormParam("clientId")Integer cid,
				@FormParam("accNo") Integer accno,
				@FormParam("consumer")String cnd,
				@FormParam("amt")Double amt) {
		
		String msg=null;
		if(cid==123 && accno!=0) {
			
			msg="Welcome to "+cnd+",amt paid is:"+amt;
		}
		else
		{
			msg="Invalid details:Client Id"+cid
					+",acc no:"+accno
					+",consumer:"+cnd
					+",amt is:"+amt;
		}
		return msg;
	}
}
