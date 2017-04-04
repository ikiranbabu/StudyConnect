package org.alias.studyconnect.resources;


import javax.net.ssl.SSLEngineResult.Status;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.alias.studyconnect.model.UserDetails;
import org.alias.studyconnect.services.userservices.LoginService;
import org.alias.studyconnect.services.userservices.RegistrationService;
import org.alias.studyconnect.services.userservices.UserService;;

@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UserResource {
	
	private UserService us;
	
	@GET
	public String messageWelcome(){
		return "Welcome to StudyConnect";
	}
	
	@Path("/myregistration")
	@POST
	public UserDetails register(UserDetails user){
		RegistrationService rs = new RegistrationService();
		UserDetails userNew = rs.registerUser(user);
		return userNew;
//		This request needs to register a new user to the database and send back the response as ok
//		or not ok with redirection to the add courses page
	}
	
	@GET
	@Path("/{userId}")
	public Response profile(@PathParam("userId") int id){
		us = new UserService();
		UserDetails user = us.fetchProfile(id);
		return Response.status(javax.ws.rs.core.Response.Status.OK)
					   .entity(user)
					   .build();
		
		//This response will fetch the user details and send user details - for the settings/profile page
	}
	
	@Path("/login")
	@GET
	public Response login(@PathParam("email") String email , @PathParam("password") String password){
			LoginService loginService = new LoginService();
			loginService.login(email, password);
		return null;
		
//		"This methhod will attempt validating login and return the response with all the"
//		 "subject that a student has enrolled and redirect to the dashboard";
	}
	
	
	@Path("/{userId}/subject")
	public SubjectResource message3(){
		return new SubjectResource();
	}
	
	@Path("/search/")
	public SearchSubjectResource message4(){
		return new SearchSubjectResource();
	}
	
	@Path("/request/")
	public RequestResource message5(){
		return new RequestResource();
	}
	
}
