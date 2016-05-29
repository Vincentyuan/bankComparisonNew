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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * BankManager entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankmanager"
    ,catalog="BILIBILI"
)

public class BankManager  implements java.io.Serializable {


    // Fields    

     private Integer managerId;
     private City city;
     private BankBasicInformation bankBaisicInformation;
     private String bankAddressDetail;
     private String firstName;
     private String lastName;
     private String email;
     private String phone;
     private String position;
     private String agence;
     private String certifyStatus;
     private String fax;
    

    // Constructors

    /** default constructor */
    public BankManager() {
    }

	/** minimal constructor */
    public BankManager(City city, BankBasicInformation bankBaisicInformation, String lastName, String certifyStatus) {
        this.city = city;
        this.bankBaisicInformation = bankBaisicInformation;
        this.lastName = lastName;
        this.certifyStatus = certifyStatus;
    }
    
    /** full constructor */
    public BankManager(City city, BankBasicInformation bankBaisicInformation,
    		String bankAddressDetail, String firstName,
    		String lastName, String email, String phone, 
    		String position, String agence, 
    		String certifyStatus, String fax) {
        this.city = city;
        this.bankBaisicInformation = bankBaisicInformation;
        this.bankAddressDetail = bankAddressDetail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.agence = agence;
        this.certifyStatus = certifyStatus;
        this.fax = fax;
        
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="managerId", unique=true, nullable=false)

    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankCity", nullable=false)

    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankId", nullable=false)

    public BankBasicInformation getBankBaisicInformation() {
        return this.bankBaisicInformation;
    }
    
    public void setBankBaisicInformation(BankBasicInformation bankBaisicInformation) {
        this.bankBaisicInformation = bankBaisicInformation;
    }
    
    @Column(name="bankAddressDetail", length=100)

    public String getBankAddressDetail() {
        return this.bankAddressDetail;
    }
    
    public void setBankAddressDetail(String bankAddressDetail) {
        this.bankAddressDetail = bankAddressDetail;
    }
    
    @Column(name="firstName", length=20)

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="lastName", nullable=false, length=20)

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name="email", length=50)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="phone", length=15)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="position", length=30)

    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    @Column(name="agence", length=50)

    public String getAgence() {
        return this.agence;
    }
    
    public void setAgence(String agence) {
        this.agence = agence;
    }
    
    @Column(name="certifyStatus", nullable=false, length=10)

    public String getCertifyStatus() {
        return this.certifyStatus;
    }
    
    public void setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
    }
    
    @Column(name="Fax", length=15)

    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
 








}