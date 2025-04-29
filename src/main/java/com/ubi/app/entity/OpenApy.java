package com.ubi.app.entity;

import java.util.Date;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OpenApy {

	// Account Information
	@Id
	private Integer referenceId;

	@NotBlank(message = "Account Number is required field.")
	@Pattern(regexp = "\\d{15}", message = "Account number must be exactly 15 digits")
	public Integer accountNo;

	@NotBlank(message = "Title is required field.")
	public String title;

	// Pension Details
	@NotBlank(message = "Monthly Pension is required field.")
	public String monthlyPension;

	@NotBlank(message = "Contribution Frequency is required field.")
	public String contriFreq; // Contribution Frequency

//		@NotBlank(message = "Monthly Premium Frequency is required field.")
//		public Integer monthlyPremi; // Monthly Premium (from GBM API)
//
//		public Integer totalYearContr; // Total Year of Contribution (60 - age at joining)

	// Marital and Nominee Details
	@NotBlank(message = "Marital Status field is required")
	public String maritalStatus;

	@NotBlank(message = "Relationship is required field")
	public String relationship;

	public Integer spouseAadhaar; // Required if marital status is 'Married'

	@NotBlank(message = "Nominee Name is required field")
	public String nomineeName; // No numbers allowed in name

	@NotBlank(message = "Nominee Name is required field")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date nomineeDOB;

	// Nominee Address
	@Pattern(regexp = "^[0-9]{6}$", message = "Pin code must be exactly 6 digits")
	public Integer pinCode;

	public String city = ""; // Autopopulate

	public String state; // Autopopulate

	public boolean nomineeCheckbox = false; // If selected, address auto-fetches from CBS

	public String addressLine1;
	public String addressLine2;
	public String addressLine3; // Optional

	public String percentage = "100%"; // Default nomination percentage

	// Guardian Details (if nominee is a minor)
	public String guardianName;
	public Date guardianDob; // Must be 18 or older
	public String relationshipNominee;

	public boolean guardianCheckbox = false; // If selected, auto-fetch address
	public String guardianAddress1; // From CBS
	public String guardianAddress2;
	public String guardianAddress3; // Optional

	public String accountOpen = "F";
	
	
	@CurrentTimestamp
	public Date createdOn;

	@UpdateTimestamp
	public Date updatedOn;
}
