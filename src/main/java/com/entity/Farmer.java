package com.entity;

import javax.persistence.*;

@Entity
public class Farmer {
    private int farmerId;
    private String farmerName;
    private String farmerAddress;
    private String farmerPhone;
    private String farmerAbout;
    private String farmerExpertise;
    private int farmerStatus;

    @Id
    @Column(name = "farmer_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    @Basic
    @Column(name = "farmer_name")
    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    @Basic
    @Column(name = "farmer_address")
    public String getFarmerAddress() {
        return farmerAddress;
    }

    public void setFarmerAddress(String farmerAddress) {
        this.farmerAddress = farmerAddress;
    }

    @Basic
    @Column(name = "farmer_phone")
    public String getFarmerPhone() {
        return farmerPhone;
    }

    public void setFarmerPhone(String farmerPhone) {
        this.farmerPhone = farmerPhone;
    }

    @Basic
    @Column(name = "farmer_about")
    public String getFarmerAbout() {
        return farmerAbout;
    }

    public void setFarmerAbout(String farmerAbout) {
        this.farmerAbout = farmerAbout;
    }

    @Basic
    @Column(name = "farmer_expertise")
    public String getFarmerExpertise() {
        return farmerExpertise;
    }

    public void setFarmerExpertise(String farmerExpertise) {
        this.farmerExpertise = farmerExpertise;
    }

    @Basic
    @Column(name = "farmer_status")
    public int getFarmerStatus() {
        return farmerStatus;
    }

    public void setFarmerStatus(int farmerStatus) {
        this.farmerStatus = farmerStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Farmer farmer = (Farmer) o;

        if (farmerId != farmer.farmerId) return false;
        if (farmerStatus != farmer.farmerStatus) return false;
        if (farmerName != null ? !farmerName.equals(farmer.farmerName) : farmer.farmerName != null) return false;
        if (farmerAddress != null ? !farmerAddress.equals(farmer.farmerAddress) : farmer.farmerAddress != null)
            return false;
        if (farmerPhone != null ? !farmerPhone.equals(farmer.farmerPhone) : farmer.farmerPhone != null) return false;
        if (farmerAbout != null ? !farmerAbout.equals(farmer.farmerAbout) : farmer.farmerAbout != null) return false;
        if (farmerExpertise != null ? !farmerExpertise.equals(farmer.farmerExpertise) : farmer.farmerExpertise != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = farmerId;
        result = 31 * result + (farmerName != null ? farmerName.hashCode() : 0);
        result = 31 * result + (farmerAddress != null ? farmerAddress.hashCode() : 0);
        result = 31 * result + (farmerPhone != null ? farmerPhone.hashCode() : 0);
        result = 31 * result + (farmerAbout != null ? farmerAbout.hashCode() : 0);
        result = 31 * result + (farmerExpertise != null ? farmerExpertise.hashCode() : 0);
        result = 31 * result + farmerStatus;
        return result;
    }
}
