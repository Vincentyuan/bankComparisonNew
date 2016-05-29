package com.bilibili.entity;

// default package

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * GeneralUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="generaluser"
    ,catalog="BILIBILI"
)

public class GeneralUser  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private City city;
     private School school;
     private RecommendPerson recommendPerson;
     private String userIdentification;
     private String lastName;
     private String firstName;
     private String userPassword;
     private Integer userType;
     private Date expectionTime;
     private String selfIntroduce;
     private Set<Request> requests = new HashSet<Request>(0);


    // Constructors

    /** default constructor */
    public GeneralUser() {
    }

	/** minimal constructor */
    public GeneralUser(String userIdentification, String lastName, String userPassword, Integer userType, Date expectionTime) {
        this.userIdentification = userIdentification;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.userType = userType;
        this.expectionTime = expectionTime;
    }
    
    /** full constructor */
    public GeneralUser(City city, School school, RecommendPerson recommendPerson, String userIdentification, String lastName, String firstName, String userPassword, Integer userType, Date expectionTime, String selfIntroduce, Set<Request> requests) {
        this.city = city;
        this.school = school;
        this.recommendPerson = recommendPerson;
        this.userIdentification = userIdentification;
        this.lastName = lastName;
        this.firstName = firstName;
        this.userPassword = userPassword;
        this.userType = userType;
        this.expectionTime = expectionTime;
        this.selfIntroduce = selfIntroduce;
        this.requests = requests;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="userId", unique=true, nullable=false)

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="addressFrance")

    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="school")

    public School getSchool() {
        return this.school;
    }
    
    public void setSchool(School school) {
        this.school = school;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="recommendCode")

    public RecommendPerson getRecommendPerson() {
        return this.recommendPerson;
    }
    
    public void setRecommendPerson(RecommendPerson recommendPerson) {
        this.recommendPerson = recommendPerson;
    }
    
    @Column(name="userIdentification", nullable=false, length=30)

    public String getUserIdentification() {
        return this.userIdentification;
    }
    
    public void setUserIdentification(String userIdentification) {
        this.userIdentification = userIdentification;
    }
    
    @Column(name="lastName", nullable=false)

    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Column(name="firstName", length=10)

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    @Column(name="userPassword", nullable=false, length=30)

    public String getUserPassword() {
        return this.userPassword;
    }
    
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    @Column(name="userType", nullable=false)

    public Integer getUserType() {
        return this.userType;
    }
    
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="expectionTime", nullable=false, length=10)

    public Date getExpectionTime() {
        return this.expectionTime;
    }
    
    public void setExpectionTime(Date expectionTime) {
        this.expectionTime = expectionTime;
    }
    
    @Column(name="selfIntroduce", length=200)

    public String getSelfIntroduce() {
        return this.selfIntroduce;
    }
    
    public void setSelfIntroduce(String selfIntroduce) {
        this.selfIntroduce = selfIntroduce;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="generalUser")

    public Set<Request> getRequests() {
        return this.requests;
    }
    
    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }
   








}