package com.customer.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tbl_customer")
//@Access(AccessType.FIELD)
public class Customer{
    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(custId, customer.custId) && Objects.equals(custName, customer.custName) && Objects.equals(custMobile, customer.custMobile) && Objects.equals(custEmail, customer.custEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, custName, custMobile, custEmail);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", custName='" + custName + '\'' +
                ", custMobile=" + custMobile +
                ", custEmail='" + custEmail + '\'' +
                '}';
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Long getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(Long custMobile) {
        this.custMobile = custMobile;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(name="customer_id")
    private String custId;
    @Column(name="customer_name")
    private  String custName;
    @Column(name="customer_mobile")
    private Long custMobile;
    @Column(name="customer_email")
    private String custEmail;

    public Customer(){}
    public Customer(String custId, String custName,Long custMobile, String custEmail){
        if (custName == null || custName.isBlank()) {
        throw new IllegalArgumentException("Customer name cannot be empty");
    }
        this.custId = custId;
        this.custName = custName;
        this.custMobile = custMobile;
        this.custEmail = custEmail;
     }

}
