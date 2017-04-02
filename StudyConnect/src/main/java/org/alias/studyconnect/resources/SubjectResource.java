package org.alias.studyconnect.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public class SubjectResource {
	
	@GET
	public String message(@PathParam("userId") int Id){
		return "fetch details of student id " + Id + " and send back the list of subject as reponse";
	}
	
	@POST
	public String message2(){
		return "Call the service to add the course and send the response";
	}
	
	@DELETE
	public String message3(){
		return "Call the service to delete the subject and send the appropriate response  ";
	}
	
	@Path("/{subjectId}/")
	public ModuleResource message4(){
		return new ModuleResource();
	}
}
