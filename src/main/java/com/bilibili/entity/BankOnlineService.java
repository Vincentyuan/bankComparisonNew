package com.bilibili.entity;

// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * BankOlineService entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankonlineservice"
    ,catalog="BILIBILI"
)

public class BankOnlineService  implements java.io.Serializable {


    // Fields    

     private Integer bankOnlineServiceId;
     private BankBasicInformation bankBaisicInformation;
     private String onlineBankServFee;
     private String smsalert;


    // Constructors

    /** default constructor */
    public BankOnlineService() {
    }

    
    /** full constructor */
    public BankOnlineService(BankBasicInformation bankBaisicInformation, String onlineBankServFee, String smsalert) {
        this.bankBaisicInformation = bankBaisicInformation;
        this.onlineBankServFee = onlineBankServFee;
        this.smsalert = smsalert;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="bankOnlineServiceId", unique=true, nullable=false)

    public Integer getBankOnlineServiceId() {
        return this.bankOnlineServiceId;
    }
    
    public void setBankOnlineServiceId(Integer bankOnlineServiceId) {
        this.bankOnlineServiceId = bankOnlineServiceId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankId", nullable=false)

    public BankBasicInformation getBankBaisicInformation() {
        return this.bankBaisicInformation;
    }
    
    public void setBankBaisicInformation(BankBasicInformation bankBaisicInformation) {
        this.bankBaisicInformation = bankBaisicInformation;
    }
    
    @Column(name="onlineBankServFee", nullable=false)

    public String getOnlineBankServFee() {
        return this.onlineBankServFee;
    }
    
    public void setOnlineBankServFee(String onlineBankServFee) {
        this.onlineBankServFee = onlineBankServFee;
    }
    
    @Column(name="SMSAlert", nullable=false)

    public String getSmsalert() {
        return this.smsalert;
    }
    
    public void setSmsalert(String smsalert) {
        this.smsalert = smsalert;
    }
   








}