package com.bilibili.entity;

	// default package

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * BankBaisicInformation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankbasicinformation"
    ,catalog="BILIBILI"
)

public class BankBaisicInformation  implements java.io.Serializable {


    // Fields    

     private Integer bankId;
     private String bankName;
     private String bankLogoPath;
     private String bankBasicInformation;
     private String openCloseTimeAndDay;
     private String openAccountReturn;
     private String yearlyFee;
     private String internationalTransferFee;
     private String spendingLimitPerMonth;
     private String cashWithdrawLimitPerMonth;
     private String overspendLimit;
     private String interestRateYouth;
     private String interestRateGeneral;
     private String interestRateOverspend;
     private String hasOnlineBank;
     private BankAccountMgmt bankAccountMgmt;


    // Constructors

    /** default constructor */
    public BankBaisicInformation() {
    }

	/** minimal constructor */
    public BankBaisicInformation(String bankName, String bankLogoPath, String openCloseTimeAndDay, String openAccountReturn, String yearlyFee, String internationalTransferFee, String spendingLimitPerMonth, String cashWithdrawLimitPerMonth, String overspendLimit, String interestRateYouth, String interestRateGeneral, String interestRateOverspend, String hasOnlineBank) {
        this.bankName = bankName;
        this.bankLogoPath = bankLogoPath;
        this.openCloseTimeAndDay = openCloseTimeAndDay;
        this.openAccountReturn = openAccountReturn;
        this.yearlyFee = yearlyFee;
        this.internationalTransferFee = internationalTransferFee;
        this.spendingLimitPerMonth = spendingLimitPerMonth;
        this.cashWithdrawLimitPerMonth = cashWithdrawLimitPerMonth;
        this.overspendLimit = overspendLimit;
        this.interestRateYouth = interestRateYouth;
        this.interestRateGeneral = interestRateGeneral;
        this.interestRateOverspend = interestRateOverspend;
        this.hasOnlineBank = hasOnlineBank;
    }
    
    /** full constructor */
    public BankBaisicInformation(String bankName, String bankLogoPath, 
    		String bankBasicInformation, String openCloseTimeAndDay, 
    		String openAccountReturn, String yearlyFee,
    		String internationalTransferFee, String spendingLimitPerMonth, 
    		String cashWithdrawLimitPerMonth, String overspendLimit, 
    		String interestRateYouth, String interestRateGeneral,
    		String interestRateOverspend, String hasOnlineBank, 
    		BankAccountMgmt bankAccountMgmt) {
        this.bankName = bankName;
        this.bankLogoPath = bankLogoPath;
        this.bankBasicInformation = bankBasicInformation;
        this.openCloseTimeAndDay = openCloseTimeAndDay;
        this.openAccountReturn = openAccountReturn;
        this.yearlyFee = yearlyFee;
        this.internationalTransferFee = internationalTransferFee;
        this.spendingLimitPerMonth = spendingLimitPerMonth;
        this.cashWithdrawLimitPerMonth = cashWithdrawLimitPerMonth;
        this.overspendLimit = overspendLimit;
        this.interestRateYouth = interestRateYouth;
        this.interestRateGeneral = interestRateGeneral;
        this.interestRateOverspend = interestRateOverspend;
        this.hasOnlineBank = hasOnlineBank;
        this.bankAccountMgmt = bankAccountMgmt;
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
    
    @Column(name="bankName", nullable=false, length=30)

    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    
    @Column(name="bankLogoPath", nullable=false, length=100)

    public String getBankLogoPath() {
        return this.bankLogoPath;
    }
    
    public void setBankLogoPath(String bankLogoPath) {
        this.bankLogoPath = bankLogoPath;
    }
    
    @Column(name="bankBasicInformation", length=200)

    public String getBankBasicInformation() {
        return this.bankBasicInformation;
    }
    
    public void setBankBasicInformation(String bankBasicInformation) {
        this.bankBasicInformation = bankBasicInformation;
    }
    
    @Column(name="openCloseTimeAndDay", nullable=false)

    public String getOpenCloseTimeAndDay() {
        return this.openCloseTimeAndDay;
    }
    
    public void setOpenCloseTimeAndDay(String openCloseTimeAndDay) {
        this.openCloseTimeAndDay = openCloseTimeAndDay;
    }
    
    @Column(name="openAccountReturn", nullable=false)

    public String getOpenAccountReturn() {
        return this.openAccountReturn;
    }
    
    public void setOpenAccountReturn(String openAccountReturn) {
        this.openAccountReturn = openAccountReturn;
    }
    
    @Column(name="yearlyFee", nullable=false)

    public String getYearlyFee() {
        return this.yearlyFee;
    }
    
    public void setYearlyFee(String yearlyFee) {
        this.yearlyFee = yearlyFee;
    }
    
    @Column(name="internationalTransferFee", nullable=false)

    public String getInternationalTransferFee() {
        return this.internationalTransferFee;
    }
    
    public void setInternationalTransferFee(String internationalTransferFee) {
        this.internationalTransferFee = internationalTransferFee;
    }
    
    @Column(name="spendingLimitPerMonth", nullable=false)

    public String getSpendingLimitPerMonth() {
        return this.spendingLimitPerMonth;
    }
    
    public void setSpendingLimitPerMonth(String spendingLimitPerMonth) {
        this.spendingLimitPerMonth = spendingLimitPerMonth;
    }
    
    @Column(name="cashWithdrawLimitPerMonth", nullable=false)

    public String getCashWithdrawLimitPerMonth() {
        return this.cashWithdrawLimitPerMonth;
    }
    
    public void setCashWithdrawLimitPerMonth(String cashWithdrawLimitPerMonth) {
        this.cashWithdrawLimitPerMonth = cashWithdrawLimitPerMonth;
    }
    
    @Column(name="overspendLimit", nullable=false)

    public String getOverspendLimit() {
        return this.overspendLimit;
    }
    
    public void setOverspendLimit(String overspendLimit) {
        this.overspendLimit = overspendLimit;
    }
    
    @Column(name="interestRateYouth", nullable=false)

    public String getInterestRateYouth() {
        return this.interestRateYouth;
    }
    
    public void setInterestRateYouth(String interestRateYouth) {
        this.interestRateYouth = interestRateYouth;
    }
    
    @Column(name="interestRateGeneral", nullable=false)

    public String getInterestRateGeneral() {
        return this.interestRateGeneral;
    }
    
    public void setInterestRateGeneral(String interestRateGeneral) {
        this.interestRateGeneral = interestRateGeneral;
    }
    
    @Column(name="interestRateOverspend", nullable=false)

    public String getInterestRateOverspend() {
        return this.interestRateOverspend;
    }
    
    public void setInterestRateOverspend(String interestRateOverspend) {
        this.interestRateOverspend = interestRateOverspend;
    }
    
    @Column(name="hasOnlineBank", nullable=false)

    public String getHasOnlineBank() {
        return this.hasOnlineBank;
    }
    
    public void setHasOnlineBank(String hasOnlineBank) {
        this.hasOnlineBank = hasOnlineBank;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="bankBaisicInformation")

    public BankAccountMgmt getBankAccountMgmt() {
        return this.bankAccountMgmt;
    }
    
    public void setBankAccountMgmt(BankAccountMgmt bankAccountMgmt) {
        this.bankAccountMgmt = bankAccountMgmt;
    }
   








}