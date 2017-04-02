package org.alias.studyconnect.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public class SearchSubjectResource {
	
	@GET
	public String message1(){
		return "Return all the subject at USF";
	}
	
	@GET
	@Path("college/{collegeId}")
	public String message2(){
		return "Return all the subject with the given college id";
	}
	
	@GET
	@Path("college/{collegeId}/dept/{deptId}")
	public String message3(){
		return "Return all the subject with the given college id and department id";
	}
	
	@GET
	@Path("{subjectCRN}")
	public String message4(){
		return "return the subject with a valid CRN";
	}

}
