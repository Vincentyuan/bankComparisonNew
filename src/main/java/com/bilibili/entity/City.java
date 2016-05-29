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
 * City entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="city"
    ,catalog="BILIBILI"
)

public class City  implements java.io.Serializable {


    // Fields    

     private Integer cityId;
     private String cityName;
     private String cityLocation;
  


    // Constructors

    /** default constructor */
    public City() {
    }

	/** minimal constructor */
    public City(String cityName, String cityLocation) {
        this.cityName = cityName;
        this.cityLocation = cityLocation;
    }
    
  
   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="cityId", unique=true, nullable=false)

    public Integer getCityId() {
        return this.cityId;
    }
    
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    
    @Column(name="cityName", nullable=false, length=20)

    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
    @Column(name="cityLocation", nullable=false, length=20)

    public String getCityLocation() {
        return this.cityLocation;
    }
    
    public void setCityLocation(String cityLocation) {
        this.cityLocation = cityLocation;
    }






}