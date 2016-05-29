package com.bilibili.entity;

// default package

import javax.persistence.Column;
import javax.persistence.Embeddable;


/**
 * BankAddressId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class BankAddressId  implements java.io.Serializable {


    // Fields    

     private Integer bankId;
     private Integer addressId;


    // Constructors

    /** default constructor */
    public BankAddressId() {
    }

    
    /** full constructor */
    public BankAddressId(Integer bankId, Integer addressId) {
        this.bankId = bankId;
        this.addressId = addressId;
    }

   
    // Property accessors

    @Column(name="bankId", nullable=false)

    public Integer getBankId() {
        return this.bankId;
    }
    
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    @Column(name="addressId", nullable=false)

    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof BankAddressId) ) return false;
		 BankAddressId castOther = ( BankAddressId ) other; 
         
		 return ( (this.getBankId()==castOther.getBankId()) || ( this.getBankId()!=null && castOther.getBankId()!=null && this.getBankId().equals(castOther.getBankId()) ) )
 && ( (this.getAddressId()==castOther.getAddressId()) || ( this.getAddressId()!=null && castOther.getAddressId()!=null && this.getAddressId().equals(castOther.getAddressId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getBankId() == null ? 0 : this.getBankId().hashCode() );
         result = 37 * result + ( getAddressId() == null ? 0 : this.getAddressId().hashCode() );
         return result;
   }   





}