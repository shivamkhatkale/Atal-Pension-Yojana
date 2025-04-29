package com.ubi.app.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ApplyAPY {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer aId;

	public Date dob;

	public String KYC;

	public Integer Aadhar;

	public String accountOpen = "F";

}
