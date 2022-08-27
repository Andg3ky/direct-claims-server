package com.allstate.directclaimsserver.dtos;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;

import java.time.LocalDate;

public class ClaimsTransactionDTO {

    //NEW CLAIM FIELDS
    private String id;
    private String type;
    private String policyNumber;
    private String customer;
    private LocalDate dateOfClaim;
    private Integer estimatedValue;
    private String reason;
    private String incidentDescription;

    private String status;

    //PROPERTY INSURANCE SPECIFIC
    private String address;

    //MOTOR INSURANCE SPECIFIC
    private String motorMake;
    private String motorModel;
    private Integer motorYear;

    //PET INSURANCE SPECIFIC
    private String petType;
    private String petBreed;

    //Constructor for None
    public ClaimsTransactionDTO() {
    }

    //Constructor for setting everything
    public ClaimsTransactionDTO(String id, String type, String policyNumber, String customer, LocalDate dateOfClaim, Integer estimatedValue, String reason, String incidentDescription, String status, String address, String motorMake, String motorModel, Integer motorYear, String petType, String petBreed) {
        this.id = id;
        this.type = type;
        this.policyNumber = policyNumber;
        this.customer = customer;
        this.dateOfClaim = dateOfClaim;
        this.estimatedValue = estimatedValue;
        this.reason = reason;
        this.incidentDescription = incidentDescription;
        this.status = status;
        this.address = address;
        this.motorMake = motorMake;
        this.motorModel = motorModel;
        this.motorYear = motorYear;
        this.petType = petType;
        this.petBreed = petBreed;
    }

    //Set in ClaimsServiceImpl
    public ClaimsTransaction toClaimsTransaction() {
        ClaimsTransaction ct = new ClaimsTransaction(null, policyNumber,customer,status, type, address,estimatedValue,LocalDate.now(),reason);
        return ct;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDate dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public Integer getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Integer estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIncidentDescription() {
        return incidentDescription;
    }

    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    public java.lang.String getStatus() {
        return status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMotorMake() {
        return motorMake;
    }

    public void setMotorMake(String motorMake) {
        this.motorMake = motorMake;
    }

    public String getMotorModel() {
        return motorModel;
    }

    public void setMotorModel(String motorModel) {
        this.motorModel = motorModel;
    }

    public Integer getMotorYear() {
        return motorYear;
    }

    public void setMotorYear(Integer motorYear) {
        this.motorYear = motorYear;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }
}
