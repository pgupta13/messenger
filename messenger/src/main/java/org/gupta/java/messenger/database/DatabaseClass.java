package org.gupta.java.messenger.database;
import java.util.HashMap;
import java.util.Map;

import org.gupta.java.messenger.model.*;

public class DatabaseClass {
	
	private static Map<Integer, Message> messages = new HashMap();
	private static Map<Integer , Profile> profiles = new HashMap();
	
	public static Map<Integer, Message> getMessage(){
		 return messages;
	}

	public static Map<Integer, Profile> getProfiles() {
		return profiles;
	}
}
