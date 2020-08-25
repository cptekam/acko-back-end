package com.acko.apiservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class CustomerHistory implements Serializable {

    private static final long serialVersionUID = -2343243243242432341L;
     private @Id @GeneratedValue Long id;
     private  Long phoneNumber;
    private String insuranceTye;
    private Integer numberOfPolicies;
    private Double totalAmount;
    private Integer totalClaimInitiated;
    private Integer numberOfClaimsPaid;
    private Double claimsPaidAmount;

    public CustomerHistory() {
    }

    public CustomerHistory(Long phoneNumber, String insuranceTye, Integer numberOfPolicies, Double totalAmount, Integer totalClaimInitiated, Integer numberOfClaimsPaid, Double claimsPaidAmount) {
        this.phoneNumber = phoneNumber;
        this.insuranceTye = insuranceTye;
        this.numberOfPolicies = numberOfPolicies;
        this.totalAmount = totalAmount;
        this.totalClaimInitiated = totalClaimInitiated;
        this.numberOfClaimsPaid = numberOfClaimsPaid;
        this.claimsPaidAmount = claimsPaidAmount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getInsuranceTye() {
        return insuranceTye;
    }

    public Integer getNumberOfPolicies() {
        return numberOfPolicies;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Integer getTotalClaimInitiated() {
        return totalClaimInitiated;
    }

    public Integer getNumberOfClaimsPaid() {
        return numberOfClaimsPaid;
    }

    public Double getClaimsPaidAmount() {
        return claimsPaidAmount;
    }
}
