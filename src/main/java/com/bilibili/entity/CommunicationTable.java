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
 * CommunicationTable entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="communicationtable"
    ,catalog="BILIBILI"
)

public class CommunicationTable  implements java.io.Serializable {


    // Fields    

     private Integer communicationId;
     private Request request;
     private Integer sender;
     private Integer receiver;
     private String messageBody;
     private String messageStatus;
     private String attacheFile;


    // Constructors

    /** default constructor */
    public CommunicationTable() {
    }

	/** minimal constructor */
    public CommunicationTable(Request request, Integer sender, Integer receiver, String messageBody, String messageStatus) {
        this.request = request;
        this.sender = sender;
        this.receiver = receiver;
        this.messageBody = messageBody;
        this.messageStatus = messageStatus;
    }
    
    /** full constructor */
    public CommunicationTable(Request request, Integer sender, Integer receiver, String messageBody, String messageStatus, String attacheFile) {
        this.request = request;
        this.sender = sender;
        this.receiver = receiver;
        this.messageBody = messageBody;
        this.messageStatus = messageStatus;
        this.attacheFile = attacheFile;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="communicationId", unique=true, nullable=false)

    public Integer getCommunicationId() {
        return this.communicationId;
    }
    
    public void setCommunicationId(Integer communicationId) {
        this.communicationId = communicationId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="requestId", nullable=false)

    public Request getRequest() {
        return this.request;
    }
    
    public void setRequest(Request request) {
        this.request = request;
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
    
    @Column(name="messageBody", nullable=false, length=200)

    public String getMessageBody() {
        return this.messageBody;
    }
    
    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
    
    @Column(name="messageStatus", nullable=false, length=10)

    public String getMessageStatus() {
        return this.messageStatus;
    }
    
    public void setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
    }
    
    @Column(name="attacheFile", length=200)

    public String getAttacheFile() {
        return this.attacheFile;
    }
    
    public void setAttacheFile(String attacheFile) {
        this.attacheFile = attacheFile;
    }
   








}