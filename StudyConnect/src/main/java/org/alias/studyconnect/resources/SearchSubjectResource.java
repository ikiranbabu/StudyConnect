package org.alias.studyconnect.resources;

import java.util.List;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.alias.studyconnect.model.Subject;
import org.alias.studyconnect.services.SubjectService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class SearchSubjectResource {
	
	private SubjectService subjectService;
	private ObjectMapper objectMapper;
	
	
	@GET	// Return all the subject at USF
	public Response getSubjects() throws JsonProcessingException{
		subjectService = new SubjectService();	
		List<Subject> subList = subjectService.getAllSubjects();
		objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	String arrayToJson = objectMapper.writeValueAsString(subList);
		return Response.status(Status.OK)
					   .entity(arrayToJson)
					   .build();
	}
	
	
	
	@GET	//Return all the subject with the given college id
	@Path("college/{collegeId}")
	public Response subjectByCollege(@PathParam("collegeId") int collegeId) throws JsonProcessingException{
		subjectService = new SubjectService();
		List<Subject> subjects = subjectService.getSubjectByCollege(collegeId);
		objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String subInCollege = objectMapper.writeValueAsString(subjects);
		return Response.status(Status.OK)
					  .entity(subInCollege)
					  .build();
	}
	
	
	
	@GET	// Return all the subject with the given college id and department id
	@Path("college/{collegeId}/dept/{deptId}")
	public Response subjectByCollegeDept(@PathParam("collegeId") int collegeId, 
										 @PathParam("deptId") int deptId) throws JsonProcessingException{
		subjectService = new SubjectService();
		List<Subject> subjects = subjectService.getSubjectsByCollegeDept(collegeId, deptId);
		objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String subjectList = objectMapper.writeValueAsString(subjects);
		return Response.status(Status.OK)
					  .entity(subjectList)
					  .build();
	}
	
	
	
	@GET // return the subject with a valid CRN
	@Path("{subjectCRN}")
	public Response subjectByCRN(@PathParam("subjectCRN") int CRN) throws JsonProcessingException{
		subjectService = new SubjectService();
		Subject subject = subjectService.getSubjectsByCRN(CRN);
		objectMapper = new ObjectMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String result = objectMapper.writeValueAsString(subject);
		return Response.status(Status.OK)
						.entity(result)
						.build();
	}

}


//GenericEntity<List<Subject>> entity = new GenericEntity<List<Subject>>
//(new ArrayList<Subject>(subList)) {};
//subList.toArray(new Subject[subList.size()])
