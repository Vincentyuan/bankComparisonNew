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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Request entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="request"
    ,catalog="BILIBILI"
)

public class Request  implements java.io.Serializable {


    // Fields    

     private Integer requestId;
     private BankManager bankManager;
     private GeneralUser generalUser;
     private Date startTime;
     private String fileFolder;
     private boolean isFinished;
     private String requestOrder;
     private String requestStatus;
     private String expectedCityToTake;
    
     private RequestSolidify requestSolidify;


    // Constructors

    /** default constructor */
    public Request() {
    }

	/** minimal constructor */
    public Request(GeneralUser generalUser, Date startTime, boolean isFinished, String requestStatus) {
        this.generalUser = generalUser;
        this.startTime = startTime;
        this.isFinished = isFinished;
        this.requestStatus = requestStatus;
    }
    
    /** full constructor */
    public Request(BankManager bankManager, GeneralUser generalUser, Date startTime, String fileFolder, boolean isFinished, String requestOrder, String requestStatus, String expectedCityToTake, RequestSolidify requestSolidify) {
        this.bankManager = bankManager;
        this.generalUser = generalUser;
        this.startTime = startTime;
        this.fileFolder = fileFolder;
        this.isFinished = isFinished;
        this.requestOrder = requestOrder;
        this.requestStatus = requestStatus;
        this.expectedCityToTake = expectedCityToTake;
        
        this.requestSolidify = requestSolidify;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="requestId", unique=true, nullable=false)

    public Integer getRequestId() {
        return this.requestId;
    }
    
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="bankManagerId")

    public BankManager getBankManager() {
        return this.bankManager;
    }
    
    public void setBankManager(BankManager bankManager) {
        this.bankManager = bankManager;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="userId", nullable=false)

    public GeneralUser getGeneralUser() {
        return this.generalUser;
    }
    
    public void setGeneralUser(GeneralUser generalUser) {
        this.generalUser = generalUser;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="startTime", nullable=false, length=10)

    public Date getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    @Column(name="fileFolder", length=200)

    public String getFileFolder() {
        return this.fileFolder;
    }
    
    public void setFileFolder(String fileFolder) {
        this.fileFolder = fileFolder;
    }
    
    @Column(name="isFinished", nullable=false)

    public boolean getIsFinished() {
        return this.isFinished;
    }
    
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    @Column(name="requestOrder", length=50)

    public String getRequestOrder() {
        return this.requestOrder;
    }
    
    public void setRequestOrder(String requestOrder) {
        this.requestOrder = requestOrder;
    }
    
    @Column(name="requestStatus", nullable=false, length=10)

    public String getRequestStatus() {
        return this.requestStatus;
    }
    
    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
    
    @Column(name="expectedCityToTake", length=200)

    public String getExpectedCityToTake() {
        return this.expectedCityToTake;
    }
    
    public void setExpectedCityToTake(String expectedCityToTake) {
        this.expectedCityToTake = expectedCityToTake;
    }

	@OneToOne(fetch=FetchType.LAZY, mappedBy="request")

    public RequestSolidify getRequestSolidify() {
        return this.requestSolidify;
    }
    
    public void setRequestSolidify(RequestSolidify requestSolidify) {
        this.requestSolidify = requestSolidify;
    }
   








}