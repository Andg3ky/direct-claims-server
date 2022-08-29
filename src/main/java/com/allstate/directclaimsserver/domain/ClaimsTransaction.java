package com.allstate.directclaimsserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class ClaimsTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String policyNumber;
    private String customer;
    private String status;
    private String type;
    //PROPERTY INSURANCE SPECIFIC
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
    public ClaimsTransaction() {
    }

    //Constructor for setting everything
    public ClaimsTransaction(Integer id, String policyNumber, String customer, String status, String type, String address, Integer estimatedValue, LocalDate dateOfClaim, String reason,
                             String incidentDescription, String addressImpacted, String motorMake, String motorModel,Integer motorYear,String petType,String petBreed ) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.customer = customer;
        this.status = status;
        this.type = type;
        this.address = address;
        this.estimatedValue = estimatedValue;
        this.dateOfClaim = dateOfClaim;
        this.reason = reason;
        this.incidentDescription = incidentDescription;
        this.addressImpacted = addressImpacted;
        this.motorMake = motorMake;
        this.motorModel = motorModel;
        this.motorYear = motorYear;
        this.petType = petType;
        this.petBreed = petBreed;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Integer estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDate dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
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

    public String getAddressImpacted() {
        return addressImpacted;
    }

    public void setAddressImpacted(String addressImpacted) {
        this.addressImpacted = addressImpacted;
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
