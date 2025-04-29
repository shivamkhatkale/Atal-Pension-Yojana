package com.ubi.app.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CbsData {
	
	public String name;
	public LocalDate dob;
	private String gender;
	public Long mobileNo;
	public Long adhaarNo;
	public String addressLine1;
	public String addressLine2;
	public String addressLine3; // optional
	public String branchDetails;

}
