package org.gupta.java.messenger.service;
import java.util.ArrayList;
import java.util.List;

import org.gupta.java.messenger.model.*;

public class MessageService {
	
	public List<Message> getAllMessage(){
		Message m1= new Message(1L,"First message", "Prachi");
		Message m2= new Message(1L,"2nd message", "Prachi");
		Message m3= new Message(1L,"3rd message", "Prachi");
		Message m4= new Message(1L,"4th message", "Prax");
		Message m5= new Message(1L,"5th message", "Prax");
		List<Message> L1 = new ArrayList();
		L1.add(m1); L1.add(m2); L1.add(m3); L1.add(m4); L1.add(m5);
		return L1;
		
	}

}
