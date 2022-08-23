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
    private String address;
    private Integer estimatedValue;
    private LocalDate dateOfClaim;
    private String reason;

    //Constructor for None
    public ClaimsTransaction() {
    }

    //Constructor for setting everything
    public ClaimsTransaction(Integer id, String policyNumber, String customer, String status, String type, String address, Integer estimatedValue, LocalDate dateOfClaim, String reason) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.customer = customer;
        this.status = status;
        this.type = type;
        this.address = address;
        this.estimatedValue = estimatedValue;
        this.dateOfClaim = dateOfClaim;
        this.reason = reason;
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



}
