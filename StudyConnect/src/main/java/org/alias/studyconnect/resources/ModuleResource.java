package org.alias.studyconnect.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

public class ModuleResource {
	
	@GET
	public String message4(){
		return "Fetch all the modules from a subject and send response ";
	}
	
	@POST
	@Path("module")
	public String message5(){
		return "Add the module to module list of a student subject ";
	}
	@DELETE
	@Path("module")
	public String message6(){
		return "Delete the module ";
	}
	@PUT
	@Path("module")
	public String message7(){
		return "Edit the module name ";
	}
	
	@GET
	@Path("module/{moduleId}/")
	public String message8(){
		return "1. Fetch all the students who completed a module"
				+ "Check the student set in the module class";
	}
	
	@POST
	@Path("module/{moduleId}/")
	public String message9(){
		return "1. Add to the completed module list in the user details"
				+ "2. add the student to the list completed student to the particular module";
	}
	
	
	
	
}
