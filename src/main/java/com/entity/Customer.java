package com.entity;

import javax.persistence.*;

@Entity
public class Customer {
    private int cusId;
    private String cusName;
    private String cusAddress;
    private String cusPhone;
    private String cusEmail;

    @Id
    @Column(name = "cus_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    @Basic
    @Column(name = "cus_name")
    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    @Basic
    @Column(name = "cus_address")
    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    @Basic
    @Column(name = "cus_phone")
    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    @Basic
    @Column(name = "cus_email")
    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (cusId != customer.cusId) return false;
        if (cusName != null ? !cusName.equals(customer.cusName) : customer.cusName != null) return false;
        if (cusAddress != null ? !cusAddress.equals(customer.cusAddress) : customer.cusAddress != null) return false;
        if (cusPhone != null ? !cusPhone.equals(customer.cusPhone) : customer.cusPhone != null) return false;
        if (cusEmail != null ? !cusEmail.equals(customer.cusEmail) : customer.cusEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cusId;
        result = 31 * result + (cusName != null ? cusName.hashCode() : 0);
        result = 31 * result + (cusAddress != null ? cusAddress.hashCode() : 0);
        result = 31 * result + (cusPhone != null ? cusPhone.hashCode() : 0);
        result = 31 * result + (cusEmail != null ? cusEmail.hashCode() : 0);
        return result;
    }
}
