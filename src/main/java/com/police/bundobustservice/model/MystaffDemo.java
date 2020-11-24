package com.police.bundobustservice.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mystaff")
public class MystaffDemo {
	

	private List<MyStaff> mystaff;

	public List<MyStaff> getMystaff() {
		return mystaff;
	}

	public void setMystaff(List<MyStaff> mystaff) {
		this.mystaff = mystaff;
	}

	@Override
	public String toString() {
		return "MystaffDemo [mystaff=" + mystaff + "]";
	}
	
	
}


