package org.gupta.java.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
	
	private Integer id;
	private String profileName;
	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	private String firstName;
	private String lastName;
	private Date created;
	
	Profile(){}
	
	Profile(Integer id, String profileName, String firstName, String lastName){
		this.id = id;
		this.profileName=profileName;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	
	

}
