package com.bilibili.entity;

// default package

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * BankAddress entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="bankaddress"
    ,catalog="BILIBILI"
)

public class BankAddress  implements java.io.Serializable {


    // Fields    

     private BankAddressId id;
   
     private City city;
     private String address;


    // Constructors

    /** default constructor */
    public BankAddress() {
    }

	/** minimal constructor */
    public BankAddress(BankAddressId id, City city, String address) {
        this.id = id;
        this.city = city;
        this.address = address;
    }
 
   
    // Property accessors
    @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="bankId", column=@Column(name="bankId", nullable=false) ), 
        @AttributeOverride(name="addressId", column=@Column(name="addressId", nullable=false) ) } )

    public BankAddressId getId() {
        return this.id;
    }
    
    public void setId(BankAddressId id) {
        this.id = id;
    }
    
   
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="addressId", nullable=false, insertable=false, updatable=false)

    public City getCity() {
        return this.city;
    }
    
    public void setCity(City city) {
        this.city = city;
    }
    
    @Column(name="address", nullable=false, length=100)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
   








}