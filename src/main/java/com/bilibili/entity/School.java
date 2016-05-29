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
import javax.persistence.Table;


/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="school"
    ,catalog="BILIBILI"
)

public class School  implements java.io.Serializable {


    // Fields    

     private Integer schoolId;
     private String schoolName;
     private String schoolAddress;
     private String schoolEmail;
     private Integer schoolTelephone;
     

    // Constructors

    /** default constructor */
    public School() {
    }

	/** minimal constructor */
    public School(String schoolName, String schoolAddress, String schoolEmail, Integer schoolTelephone) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolEmail = schoolEmail;
        this.schoolTelephone = schoolTelephone;
    }
    
 
   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="schoolId", unique=true, nullable=false)

    public Integer getSchoolId() {
        return this.schoolId;
    }
    
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }
    
    @Column(name="schoolName", nullable=false, length=50)

    public String getSchoolName() {
        return this.schoolName;
    }
    
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
    @Column(name="schoolAddress", nullable=false)

    public String getSchoolAddress() {
        return this.schoolAddress;
    }
    
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
    
    @Column(name="schoolEmail", nullable=false, length=30)

    public String getSchoolEmail() {
        return this.schoolEmail;
    }
    
    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }
    
    @Column(name="schoolTelephone", nullable=false)

    public Integer getSchoolTelephone() {
        return this.schoolTelephone;
    }
    
    public void setSchoolTelephone(Integer schoolTelephone) {
        this.schoolTelephone = schoolTelephone;
    }








}