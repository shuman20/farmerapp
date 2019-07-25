package com.entity;

import javax.persistence.*;

@Entity
public class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private int productStatus;
    private String availableStock;
    private int farmerId;

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "product_status")
    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    @Basic
    @Column(name = "available_stock")
    public String getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(String availableStock) {
        this.availableStock = availableStock;
    }

    @Basic
    @Column(name = "farmer_id")
    public int getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(int farmerId) {
        this.farmerId = farmerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (productStatus != product.productStatus) return false;
        if (farmerId != product.farmerId) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (category != null ? !category.equals(product.category) : product.category != null) return false;
        if (availableStock != null ? !availableStock.equals(product.availableStock) : product.availableStock != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + productStatus;
        result = 31 * result + (availableStock != null ? availableStock.hashCode() : 0);
        result = 31 * result + farmerId;
        return result;
    }
}
