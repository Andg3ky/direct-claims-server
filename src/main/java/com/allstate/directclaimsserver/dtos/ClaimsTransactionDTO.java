package com.allstate.directclaimsserver.dtos;

import com.allstate.directclaimsserver.domain.ClaimsTransaction;

import java.time.LocalDate;

public class ClaimsTransactionDTO {

    private Integer id;

    private String policyNumber;
    private String customer;
    private String status;
    private String type;
    private String address;
    private Integer estimatedValue;
    private LocalDate dateOfClaim;
    private String reason;
    private String incidentDescription;

    //PROPERTY INSURANCE SPECIFIC
    private String addressImpacted;

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
    public ClaimsTransactionDTO(ClaimsTransaction ct) {
        this.id = ct.getId();
        this.type = ct.getType();
        this.policyNumber = ct.getPolicyNumber();
        this.customer = ct.getCustomer();
        this.dateOfClaim = ct.getDateOfClaim();
        this.estimatedValue = ct.getEstimatedValue();
        this.reason = ct.getReason();
        this.incidentDescription = ct.getIncidentDescription();
        this.addressImpacted = ct.getAddressImpacted();
        this.status = ct.getStatus();
        this.address = ct.getAddress();
        this.motorMake = ct.getMotorMake();
        this.motorModel = ct.getMotorModel();
        this.motorYear = ct.getMotorYear();
        this.petType = ct.getPetType();
        this.petBreed = ct.getPetBreed();
    }

    //Set in ClaimsServiceImpl
    public ClaimsTransaction toClaimsTransaction() {
        ClaimsTransaction ct = new ClaimsTransaction(null, policyNumber,customer, status , type, address,
                estimatedValue, LocalDate.now(),reason, incidentDescription, addressImpacted, motorMake, motorModel, motorYear, petType, petBreed);
        if (status.toLowerCase().equals("property")) {
            ct.setMotorModel("n/a");
            ct.setMotorMake("n/a");
            ct.setMotorYear(0);
            ct.setPetType("n/a");
            ct.setPetBreed("n/a");
        }
        if (status.toLowerCase().equals("motor")) {
            ct.setAddressImpacted("n/a");
            ct.setPetType("n/a");
            ct.setPetBreed("n/a");
        }
        if (status.toLowerCase().equals("pet")) {
            ct.setAddressImpacted("n/a");
            ct.setMotorModel("n/a");
            ct.setMotorMake("n/a");
            ct.setMotorYear(0);
        }
        if (estimatedValue > 499) {
            ct.setStatus("Transferred to main claims");
        }
        if (estimatedValue < 500) {
            ct.setStatus("Awaiting Assessment");
        }

        return ct;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
