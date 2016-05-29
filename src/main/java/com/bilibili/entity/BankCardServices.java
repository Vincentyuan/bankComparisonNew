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
 * BankCardServices entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankcardservices"
    ,catalog="BILIBILI"
)

public class BankCardServices  implements java.io.Serializable {


    // Fields    

     private Integer bankcardservicesId;
     private BankBaisicInformation bankBaisicInformation;
     private String visainfiniteCard;
     private String visagoldPremierCard;
     private String visamasterCard;
     private String collectorCardFee;
     private String cardRenewalToAdress;
     private String cashWithdrawalAnotherBankCounter;
     private String cashWithdrawalAnotherBankAtm;
     private String nonEuzonePayment;
     private String nonEuzoneWithdrawal;
     private String codeEditing;
     private String oppositionFee;


    // Constructors

    /** default constructor */
    public BankCardServices() {
    }

    
    /** full constructor */
    public BankCardServices(BankBaisicInformation bankBaisicInformation, String visainfiniteCard, String visagoldPremierCard, String visamasterCard, String collectorCardFee, String cardRenewalToAdress, String cashWithdrawalAnotherBankCounter, String cashWithdrawalAnotherBankAtm, String nonEuzonePayment, String nonEuzoneWithdrawal, String codeEditing, String oppositionFee) {
        this.bankBaisicInformation = bankBaisicInformation;
        this.visainfiniteCard = visainfiniteCard;
        this.visagoldPremierCard = visagoldPremierCard;
        this.visamasterCard = visamasterCard;
        this.collectorCardFee = collectorCardFee;
        this.cardRenewalToAdress = cardRenewalToAdress;
        this.cashWithdrawalAnotherBankCounter = cashWithdrawalAnotherBankCounter;
        this.cashWithdrawalAnotherBankAtm = cashWithdrawalAnotherBankAtm;
        this.nonEuzonePayment = nonEuzonePayment;
        this.nonEuzoneWithdrawal = nonEuzoneWithdrawal;
        this.codeEditing = codeEditing;
        this.oppositionFee = oppositionFee;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="bankcardservicesId", unique=true, nullable=false)

    public Integer getBankcardservicesId() {
        return this.bankcardservicesId;
    }
    
    public void setBankcardservicesId(Integer bankcardservicesId) {
        this.bankcardservicesId = bankcardservicesId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankId", nullable=false)

    public BankBaisicInformation getBankBaisicInformation() {
        return this.bankBaisicInformation;
    }
    
    public void setBankBaisicInformation(BankBaisicInformation bankBaisicInformation) {
        this.bankBaisicInformation = bankBaisicInformation;
    }
    
    @Column(name="VISAInfiniteCard", nullable=false)

    public String getVisainfiniteCard() {
        return this.visainfiniteCard;
    }
    
    public void setVisainfiniteCard(String visainfiniteCard) {
        this.visainfiniteCard = visainfiniteCard;
    }
    
    @Column(name="VISAGoldPremierCard", nullable=false)

    public String getVisagoldPremierCard() {
        return this.visagoldPremierCard;
    }
    
    public void setVisagoldPremierCard(String visagoldPremierCard) {
        this.visagoldPremierCard = visagoldPremierCard;
    }
    
    @Column(name="VISAMasterCard", nullable=false)

    public String getVisamasterCard() {
        return this.visamasterCard;
    }
    
    public void setVisamasterCard(String visamasterCard) {
        this.visamasterCard = visamasterCard;
    }
    
    @Column(name="collectorCardFee", nullable=false)

    public String getCollectorCardFee() {
        return this.collectorCardFee;
    }
    
    public void setCollectorCardFee(String collectorCardFee) {
        this.collectorCardFee = collectorCardFee;
    }
    
    @Column(name="cardRenewalToAdress", nullable=false)

    public String getCardRenewalToAdress() {
        return this.cardRenewalToAdress;
    }
    
    public void setCardRenewalToAdress(String cardRenewalToAdress) {
        this.cardRenewalToAdress = cardRenewalToAdress;
    }
    
    @Column(name="cashWithdrawalAnotherBankCounter", nullable=false)

    public String getCashWithdrawalAnotherBankCounter() {
        return this.cashWithdrawalAnotherBankCounter;
    }
    
    public void setCashWithdrawalAnotherBankCounter(String cashWithdrawalAnotherBankCounter) {
        this.cashWithdrawalAnotherBankCounter = cashWithdrawalAnotherBankCounter;
    }
    
    @Column(name="cashWithdrawalAnotherBankATM", nullable=false)

    public String getCashWithdrawalAnotherBankAtm() {
        return this.cashWithdrawalAnotherBankAtm;
    }
    
    public void setCashWithdrawalAnotherBankAtm(String cashWithdrawalAnotherBankAtm) {
        this.cashWithdrawalAnotherBankAtm = cashWithdrawalAnotherBankAtm;
    }
    
    @Column(name="nonEUZonePayment", nullable=false)

    public String getNonEuzonePayment() {
        return this.nonEuzonePayment;
    }
    
    public void setNonEuzonePayment(String nonEuzonePayment) {
        this.nonEuzonePayment = nonEuzonePayment;
    }
    
    @Column(name="nonEUZoneWithdrawal", nullable=false)

    public String getNonEuzoneWithdrawal() {
        return this.nonEuzoneWithdrawal;
    }
    
    public void setNonEuzoneWithdrawal(String nonEuzoneWithdrawal) {
        this.nonEuzoneWithdrawal = nonEuzoneWithdrawal;
    }
    
    @Column(name="codeEditing", nullable=false)

    public String getCodeEditing() {
        return this.codeEditing;
    }
    
    public void setCodeEditing(String codeEditing) {
        this.codeEditing = codeEditing;
    }
    
    @Column(name="oppositionFee", nullable=false)

    public String getOppositionFee() {
        return this.oppositionFee;
    }
    
    public void setOppositionFee(String oppositionFee) {
        this.oppositionFee = oppositionFee;
    }
   








}