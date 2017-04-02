package org.alias.studyconnect.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

public class RequestResource {
	
	@Path("received")
	@GET
	public String message(){
		return "look at the hashSet of the requesting user and send the details";
	}
	
	@Path("sent")
	@GET
	public String message2(){
		return "look at the sentRequest hashSet and send the details";
	}
	
	@POST
	public String message3 (){
		return "1. Create a new request in the request table with the request object recieved"
				+ "2. Add the request to the corresponding sent user hashtable"
				+ "3. add the request to the corresponding received user hashtable"
				+ "Throw incomplete if any of the steps fails";
	}
	
	//Completing or rejecting a request
	@DELETE
	public String message4(){
		return "1.Delete the request with this primary key from the module table"
				+ "2. Delete it from both the th requesting and the sent user hash set"
				+ "3.Close the chat room"
				+ "4. Remove users from each others request list";
	}
	
	//Accepting a request
	@Path("accept")
	@POST
	public String message5(){
		return "1.Set the corresponding request flag to 1."
				+ "Change accept to complete in mobile"
				+ "2. Add the user to the chat list of both the users. "
				+ "Remove the requests from the request list of both the users";
	}
	

}
