package com.bilibili.entity;

// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * BankAccountMgmt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankaccountmgmt"
    ,catalog="BILIBILI"
)

public class BankAccountMgmt  implements java.io.Serializable {


    // Fields    

     private Integer bankId;
     
     private String openingFee;
     private String bankChangingFee;
     private String agenceTransfertFee;
     private String closureFee;
     private String accountStatement;
     private String activeAccountMgmt;
     private String inactiveAccountMgmt;


    // Constructors

    /** default constructor */
    public BankAccountMgmt() {
    }

    
    /** full constructor */
    public BankAccountMgmt(String openingFee, String bankChangingFee, String agenceTransfertFee, String closureFee, String accountStatement, String activeAccountMgmt, String inactiveAccountMgmt) {
        this.openingFee = openingFee;
        this.bankChangingFee = bankChangingFee;
        this.agenceTransfertFee = agenceTransfertFee;
        this.closureFee = closureFee;
        this.accountStatement = accountStatement;
        this.activeAccountMgmt = activeAccountMgmt;
        this.inactiveAccountMgmt = inactiveAccountMgmt;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="bankId", unique=true, nullable=false)

    public Integer getBankId() {
        return this.bankId;
    }
    
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
	
    
    @Column(name="openingFee", nullable=false)

    public String getOpeningFee() {
        return this.openingFee;
    }
    
    public void setOpeningFee(String openingFee) {
        this.openingFee = openingFee;
    }
    
    @Column(name="bankChangingFee", nullable=false)

    public String getBankChangingFee() {
        return this.bankChangingFee;
    }
    
    public void setBankChangingFee(String bankChangingFee) {
        this.bankChangingFee = bankChangingFee;
    }
    
    @Column(name="agenceTransfertFee", nullable=false)

    public String getAgenceTransfertFee() {
        return this.agenceTransfertFee;
    }
    
    public void setAgenceTransfertFee(String agenceTransfertFee) {
        this.agenceTransfertFee = agenceTransfertFee;
    }
    
    @Column(name="closureFee", nullable=false)

    public String getClosureFee() {
        return this.closureFee;
    }
    
    public void setClosureFee(String closureFee) {
        this.closureFee = closureFee;
    }
    
    @Column(name="accountStatement", nullable=false)

    public String getAccountStatement() {
        return this.accountStatement;
    }
    
    public void setAccountStatement(String accountStatement) {
        this.accountStatement = accountStatement;
    }
    
    @Column(name="activeAccountMgmt", nullable=false)

    public String getActiveAccountMgmt() {
        return this.activeAccountMgmt;
    }
    
    public void setActiveAccountMgmt(String activeAccountMgmt) {
        this.activeAccountMgmt = activeAccountMgmt;
    }
    
    @Column(name="inactiveAccountMgmt", nullable=false)

    public String getInactiveAccountMgmt() {
        return this.inactiveAccountMgmt;
    }
    
    public void setInactiveAccountMgmt(String inactiveAccountMgmt) {
        this.inactiveAccountMgmt = inactiveAccountMgmt;
    }
   








}