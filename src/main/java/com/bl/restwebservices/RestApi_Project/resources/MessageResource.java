package com.bl.restwebservices.RestApi_Project.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bl.restwebservices.mesgmodel.Message;
import com.bl.restwebservices.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message>getMessages() {
		return  messageService.getAllMessages();
		 //return Response.status(Status.OK).entity( messageService.getAllMessages().toString()).build();
	}
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long id) {
		//return messageService.getMessage(id);
		return null;
		
	}

}
