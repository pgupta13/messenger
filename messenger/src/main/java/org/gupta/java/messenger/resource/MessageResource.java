package org.gupta.java.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.gupta.java.messenger.model.*;

import org.gupta.java.messenger.service.MessageService;

@Path("messages")
public class MessageResource {
	
	MessageService mesServ = new MessageService();
	
	 @GET
	    @Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		return mesServ.getAllMessage();
		
	}

}
