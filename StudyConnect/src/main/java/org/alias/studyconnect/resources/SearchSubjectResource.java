package org.alias.studyconnect.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.alias.studyconnect.model.Subject;
import org.alias.studyconnect.services.userservices.SubjectService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jersey.repackaged.com.google.common.collect.Lists;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class SearchSubjectResource {
	
	private SubjectService ss;
	private ObjectMapper objectMapper;
	
	// Return all the subject at USF
	@GET
	public Response getSubjects() throws JsonProcessingException{
		ss = new SubjectService();	
		List<Subject> subList = ss.getAllSubjects();

//		GenericEntity<List<Subject>> entity = 
//	            new GenericEntity<List<Subject>>(new ArrayList<Subject>(subList)) {};
//		subList.toArray(new Subject[subList.size()])
		objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	String arrayToJson = objectMapper.writeValueAsString(subList);
//    	System.out.println(arrayToJson);
		return Response.status(Status.OK)
					   .entity(arrayToJson)
					   .build();

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
