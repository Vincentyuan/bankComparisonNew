package com.bilibili.entity;

// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * RequestSolidify entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="requestsolidify"
    ,catalog="BILIBILI"
)

public class RequestSolidify  implements java.io.Serializable {


    // Fields    

     private Integer requestId;
     private Request request;
     private Date finishTime;
     private String conclude;
     private Integer sender;
     private Integer receiver;


    // Constructors

    /** default constructor */
    public RequestSolidify() {
    }

	/** minimal constructor */
    public RequestSolidify(Request request, Date finishTime, Integer sender, Integer receiver) {
        this.request = request;
        this.finishTime = finishTime;
        this.sender = sender;
        this.receiver = receiver;
    }
    
    /** full constructor */
    public RequestSolidify(Request request, Date finishTime, String conclude, Integer sender, Integer receiver) {
        this.request = request;
        this.finishTime = finishTime;
        this.conclude = conclude;
        this.sender = sender;
        this.receiver = receiver;
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
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public Request getRequest() {
        return this.request;
    }
    
    public void setRequest(Request request) {
        this.request = request;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="finishTime", nullable=false, length=10)

    public Date getFinishTime() {
        return this.finishTime;
    }
    
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
    
    @Column(name="conclude", length=100)

    public String getConclude() {
        return this.conclude;
    }
    
    public void setConclude(String conclude) {
        this.conclude = conclude;
    }
    
    @Column(name="sender", nullable=false)

    public Integer getSender() {
        return this.sender;
    }
    
    public void setSender(Integer sender) {
        this.sender = sender;
    }
    
    @Column(name="receiver", nullable=false)

    public Integer getReceiver() {
        return this.receiver;
    }
    
    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }
   








}