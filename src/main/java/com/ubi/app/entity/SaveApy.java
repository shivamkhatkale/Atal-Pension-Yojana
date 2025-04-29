package com.ubi.app.entity;

import java.util.Date;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SaveApy {

    @Id
    private Integer referenceId;

    @NotBlank(message = "Income Tax is required field")
    private String incomeTax;

    @NotBlank(message = "Account Number is required field.")
    @Pattern(regexp = "\\d{15}", message = "Account number must be exactly 15 digits")
    public Integer accountNo;

    @NotBlank(message = "Title is required field.")
    public String title;

    // Pension Details
    @NotBlank(message = "Monthly Pension is required field.")
    public String monthlyPension;

    @NotBlank(message = "Contribution Frequency is required field.")
    public String contriFreq; 

    // Marital and Nominee Details
    @NotBlank(message = "Marital Status field is required")
    public String maritalStatus;

    @NotBlank(message = "Relationship is required field")
    public String relationship;

    public Integer spouseAadhaar;

    @NotBlank(message = "Nominee Name is required field")
    public String nomineeName;

    @NotBlank(message = "Nominee Name is required field")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date nomineeDOB;

    // Nominee Address
    @Pattern(regexp = "^[0-9]{6}$", message = "Pin code must be exactly 6 digits")
    public Integer pinCode;

    public String city = ""; // Autopopulate
    public String state; // Autopopulate

    public boolean nomineeCheckbox = false; 

    public String addressLine1;
    public String addressLine2;
    public String addressLine3;

    public String percentage = "100%"; 

    // Guardian Details
    public String guardianName;
    public Date guardianDob; // Must be 18 or older
    public String relationshipNominee;

    public boolean guardianCheckbox = false;
    public String guardianAddress1; // From CBS
    public String guardianAddress2;
    public String guardianAddress3;

    @CurrentTimestamp
    public Date createdOn;

    @UpdateTimestamp
    public Date updatedOn;

    // One-to-One relationship with ApplicationDetails
    @OneToOne
    @JoinColumn(name = "application_id")  // FK column to map to ApplicationDetails
    private ApplicationDetails applicationDetails;

}
