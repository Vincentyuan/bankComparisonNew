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
 * BankBasicServices entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankbasicservices"
    ,catalog="BILIBILI"
)

public class BankBasicServices  implements java.io.Serializable {


    // Fields    

     private Integer bankbasicServiceId;
     private BankBaisicInformation bankBaisicInformation;
     private String internetService;
     private String smsalert;
     private String immediateDebitCard;
     private String deferredDebitCard;
     private String systAutorisationDebitCard;
     private String otherBankAtm;
     private String sepaoccTransf;
     private String sepapayment;
     private String interventionCommission;
     private String insurance;
     private String managementFee;


    // Constructors

    /** default constructor */
    public BankBasicServices() {
    }

    
    /** full constructor */
    public BankBasicServices(BankBaisicInformation bankBaisicInformation, String internetService, String smsalert, String immediateDebitCard, String deferredDebitCard, String systAutorisationDebitCard, String otherBankAtm, String sepaoccTransf, String sepapayment, String interventionCommission, String insurance, String managementFee) {
        this.bankBaisicInformation = bankBaisicInformation;
        this.internetService = internetService;
        this.smsalert = smsalert;
        this.immediateDebitCard = immediateDebitCard;
        this.deferredDebitCard = deferredDebitCard;
        this.systAutorisationDebitCard = systAutorisationDebitCard;
        this.otherBankAtm = otherBankAtm;
        this.sepaoccTransf = sepaoccTransf;
        this.sepapayment = sepapayment;
        this.interventionCommission = interventionCommission;
        this.insurance = insurance;
        this.managementFee = managementFee;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="bankbasicServiceId", unique=true, nullable=false)

    public Integer getBankbasicServiceId() {
        return this.bankbasicServiceId;
    }
    
    public void setBankbasicServiceId(Integer bankbasicServiceId) {
        this.bankbasicServiceId = bankbasicServiceId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankId", nullable=false)

    public BankBaisicInformation getBankBaisicInformation() {
        return this.bankBaisicInformation;
    }
    
    public void setBankBaisicInformation(BankBaisicInformation bankBaisicInformation) {
        this.bankBaisicInformation = bankBaisicInformation;
    }
    
    @Column(name="internetService", nullable=false)

    public String getInternetService() {
        return this.internetService;
    }
    
    public void setInternetService(String internetService) {
        this.internetService = internetService;
    }
    
    @Column(name="SMSAlert", nullable=false)

    public String getSmsalert() {
        return this.smsalert;
    }
    
    public void setSmsalert(String smsalert) {
        this.smsalert = smsalert;
    }
    
    @Column(name="immediateDebitCard", nullable=false)

    public String getImmediateDebitCard() {
        return this.immediateDebitCard;
    }
    
    public void setImmediateDebitCard(String immediateDebitCard) {
        this.immediateDebitCard = immediateDebitCard;
    }
    
    @Column(name="deferredDebitCard", nullable=false)

    public String getDeferredDebitCard() {
        return this.deferredDebitCard;
    }
    
    public void setDeferredDebitCard(String deferredDebitCard) {
        this.deferredDebitCard = deferredDebitCard;
    }
    
    @Column(name="systAutorisationDebitCard", nullable=false)

    public String getSystAutorisationDebitCard() {
        return this.systAutorisationDebitCard;
    }
    
    public void setSystAutorisationDebitCard(String systAutorisationDebitCard) {
        this.systAutorisationDebitCard = systAutorisationDebitCard;
    }
    
    @Column(name="otherBankATM", nullable=false)

    public String getOtherBankAtm() {
        return this.otherBankAtm;
    }
    
    public void setOtherBankAtm(String otherBankAtm) {
        this.otherBankAtm = otherBankAtm;
    }
    
    @Column(name="SEPAOccTransf", nullable=false)

    public String getSepaoccTransf() {
        return this.sepaoccTransf;
    }
    
    public void setSepaoccTransf(String sepaoccTransf) {
        this.sepaoccTransf = sepaoccTransf;
    }
    
    @Column(name="SEPAPayment", nullable=false)

    public String getSepapayment() {
        return this.sepapayment;
    }
    
    public void setSepapayment(String sepapayment) {
        this.sepapayment = sepapayment;
    }
    
    @Column(name="interventionCommission", nullable=false)

    public String getInterventionCommission() {
        return this.interventionCommission;
    }
    
    public void setInterventionCommission(String interventionCommission) {
        this.interventionCommission = interventionCommission;
    }
    
    @Column(name="insurance", nullable=false)

    public String getInsurance() {
        return this.insurance;
    }
    
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }
    
    @Column(name="managementFee", nullable=false)

    public String getManagementFee() {
        return this.managementFee;
    }
    
    public void setManagementFee(String managementFee) {
        this.managementFee = managementFee;
    }
   








}