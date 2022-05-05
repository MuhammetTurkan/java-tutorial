package AbstractInterfaces.Entities;

import java.time.*;
import AbstractInterfaces.Abstract.IEntity;

public class Customer implements IEntity{
	public int id;
	public String firstName;
	public String lastName;
	public LocalDate dateOfBirth;
	public String natipnalityId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNatipnalityId() {
		return natipnalityId;
	}
	public void setNatipnalityId(String natipnalityId) {
		this.natipnalityId = natipnalityId;
	}
	
	
	
	
	
	


	
	
	
}
