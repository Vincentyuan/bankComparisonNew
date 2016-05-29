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
 * RecommendPerson entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="recommendperson"
    ,catalog="BILIBILI"
)

public class RecommendPerson  implements java.io.Serializable {


    // Fields    

     private String recommendCode;
     private School school;
     private String firstName;
     private String lastName;
     private String email;
     private String identityIntroduction;
     private String certifyStatus;


    // Constructors

    /** default constructor */
    public RecommendPerson() {
    }

	/** minimal constructor */
    public RecommendPerson(School school, String lastName, String email, String identityIntroduction, String certifyStatus) {
        this.school = school;
        this.lastName = lastName;
        this.email = email;
        this.identityIntroduction = identityIntroduction;
        this.certifyStatus = certifyStatus;
    }
    
    /** full constructor */
    public RecommendPerson(School school, String firstName, String lastName, String email, String identityIntroduction, String certifyStatus) {
        this.school = school;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.identityIntroduction = identityIntroduction;
        this.certifyStatus = certifyStatus;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="recommendCode", unique=true, nullable=false, length=8)

    public String getRecommendCode() {
        return this.recommendCode;
    }
    
    public void setRecommendCode(String recommendCode) {
        this.recommendCode = recommendCode;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="schoolId", nullable=false)

    public School getSchool() {
        return this.school;
    }
    
    public void setSchool(School school) {
        this.school = school;
    }
    
    @Column(name="firstName", length=10)

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="lastName", nullable=false, length=10)

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name="email", nullable=false, length=30)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="identityIntroduction", nullable=false, length=100)

    public String getIdentityIntroduction() {
        return this.identityIntroduction;
    }
    
    public void setIdentityIntroduction(String identityIntroduction) {
        this.identityIntroduction = identityIntroduction;
    }
    
    @Column(name="certifyStatus", nullable=false, length=10)

    public String getCertifyStatus() {
        return this.certifyStatus;
    }
    
    public void setCertifyStatus(String certifyStatus) {
        this.certifyStatus = certifyStatus;
    }








}