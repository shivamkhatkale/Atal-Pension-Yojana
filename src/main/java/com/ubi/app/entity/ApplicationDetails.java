package com.ubi.app.entity;

import java.util.Date;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
public class ApplicationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aId;

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

    public Integer monthlyPremi;

    public Integer totalYearContr; 
    
    @CurrentTimestamp
    public Date createdOn;

    @UpdateTimestamp
    public Date updatedOn;

    // One-to-One relationship with SaveApy
    @OneToOne(mappedBy = "applicationDetails")  // mappedBy means SaveApy has the reference
    private SaveApy saveApy;
}
