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
 * BankTransferServies entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="banktransferservices"
    ,catalog="BILIBILI"
)

public class BankTransferServies  implements java.io.Serializable {


    // Fields    

     private Integer banktransferservicesId;
     private BankBasicInformation bankBaisicInformation;
     private String internalTransfer;
     private String occaSepaemission;
     private String occaSepareception;
     private String permanentSepaemission;
     private String tipsepapaymentFee;
     private String checkBookSentAtHomeFee;
     private String bankChequeEmissionFee;
     private String chequePhotocopy;
     private String chequeOrChequeBookOppositionBySender;
     private String issueChequePayableInOtherCountries;
     private String chequePaymentIssuedInForeignCountries;


    // Constructors

    /** default constructor */
    public BankTransferServies() {
    }

    
    /** full constructor */
    public BankTransferServies(BankBasicInformation bankBaisicInformation, String internalTransfer, String occaSepaemission, String occaSepareception, String permanentSepaemission, String tipsepapaymentFee, String checkBookSentAtHomeFee, String bankChequeEmissionFee, String chequePhotocopy, String chequeOrChequeBookOppositionBySender, String issueChequePayableInOtherCountries, String chequePaymentIssuedInForeignCountries) {
        this.bankBaisicInformation = bankBaisicInformation;
        this.internalTransfer = internalTransfer;
        this.occaSepaemission = occaSepaemission;
        this.occaSepareception = occaSepareception;
        this.permanentSepaemission = permanentSepaemission;
        this.tipsepapaymentFee = tipsepapaymentFee;
        this.checkBookSentAtHomeFee = checkBookSentAtHomeFee;
        this.bankChequeEmissionFee = bankChequeEmissionFee;
        this.chequePhotocopy = chequePhotocopy;
        this.chequeOrChequeBookOppositionBySender = chequeOrChequeBookOppositionBySender;
        this.issueChequePayableInOtherCountries = issueChequePayableInOtherCountries;
        this.chequePaymentIssuedInForeignCountries = chequePaymentIssuedInForeignCountries;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="banktransferservicesId", unique=true, nullable=false)

    public Integer getBanktransferservicesId() {
        return this.banktransferservicesId;
    }
    
    public void setBanktransferservicesId(Integer banktransferservicesId) {
        this.banktransferservicesId = banktransferservicesId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankId", nullable=false)

    public BankBasicInformation getBankBaisicInformation() {
        return this.bankBaisicInformation;
    }
    
    public void setBankBaisicInformation(BankBasicInformation bankBaisicInformation) {
        this.bankBaisicInformation = bankBaisicInformation;
    }
    
    @Column(name="InternalTransfer", nullable=false)

    public String getInternalTransfer() {
        return this.internalTransfer;
    }
    
    public void setInternalTransfer(String internalTransfer) {
        this.internalTransfer = internalTransfer;
    }
    
    @Column(name="OccaSEPAEmission", nullable=false)

    public String getOccaSepaemission() {
        return this.occaSepaemission;
    }
    
    public void setOccaSepaemission(String occaSepaemission) {
        this.occaSepaemission = occaSepaemission;
    }
    
    @Column(name="OccaSEPAReception", nullable=false)

    public String getOccaSepareception() {
        return this.occaSepareception;
    }
    
    public void setOccaSepareception(String occaSepareception) {
        this.occaSepareception = occaSepareception;
    }
    
    @Column(name="PermanentSEPAEmission", nullable=false)

    public String getPermanentSepaemission() {
        return this.permanentSepaemission;
    }
    
    public void setPermanentSepaemission(String permanentSepaemission) {
        this.permanentSepaemission = permanentSepaemission;
    }
    
    @Column(name="TIPSEPAPaymentFee", nullable=false)

    public String getTipsepapaymentFee() {
        return this.tipsepapaymentFee;
    }
    
    public void setTipsepapaymentFee(String tipsepapaymentFee) {
        this.tipsepapaymentFee = tipsepapaymentFee;
    }
    
    @Column(name="CheckBookSentAtHomeFee", nullable=false)

    public String getCheckBookSentAtHomeFee() {
        return this.checkBookSentAtHomeFee;
    }
    
    public void setCheckBookSentAtHomeFee(String checkBookSentAtHomeFee) {
        this.checkBookSentAtHomeFee = checkBookSentAtHomeFee;
    }
    
    @Column(name="BankChequeEmissionFee", nullable=false)

    public String getBankChequeEmissionFee() {
        return this.bankChequeEmissionFee;
    }
    
    public void setBankChequeEmissionFee(String bankChequeEmissionFee) {
        this.bankChequeEmissionFee = bankChequeEmissionFee;
    }
    
    @Column(name="ChequePhotocopy", nullable=false)

    public String getChequePhotocopy() {
        return this.chequePhotocopy;
    }
    
    public void setChequePhotocopy(String chequePhotocopy) {
        this.chequePhotocopy = chequePhotocopy;
    }
    
    @Column(name="ChequeOrChequeBookOppositionBySender", nullable=false)

    public String getChequeOrChequeBookOppositionBySender() {
        return this.chequeOrChequeBookOppositionBySender;
    }
    
    public void setChequeOrChequeBookOppositionBySender(String chequeOrChequeBookOppositionBySender) {
        this.chequeOrChequeBookOppositionBySender = chequeOrChequeBookOppositionBySender;
    }
    
    @Column(name="IssueChequePayableInOtherCountries", nullable=false)

    public String getIssueChequePayableInOtherCountries() {
        return this.issueChequePayableInOtherCountries;
    }
    
    public void setIssueChequePayableInOtherCountries(String issueChequePayableInOtherCountries) {
        this.issueChequePayableInOtherCountries = issueChequePayableInOtherCountries;
    }
    
    @Column(name="ChequePaymentIssuedInForeignCountries", nullable=false)

    public String getChequePaymentIssuedInForeignCountries() {
        return this.chequePaymentIssuedInForeignCountries;
    }
    
    public void setChequePaymentIssuedInForeignCountries(String chequePaymentIssuedInForeignCountries) {
        this.chequePaymentIssuedInForeignCountries = chequePaymentIssuedInForeignCountries;
    }
   








}