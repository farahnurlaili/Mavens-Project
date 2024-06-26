package com.example.mavensproject;

public class OrderModel {
    private String orderNumber;
    private String customerName;
    private String customerPhone;
    private String customerCityName;
    private String customerAddress;
    private String itemExpenses;
    private String deliveryCharges;
    private String orderTrackingNumber;
    private String courier;
    private String orderPlacingDate;
    private String orderStatus;
    private String uid;

    public OrderModel() {
    }

    public OrderModel(String orderNumber, String customerName, String customerPhone, String customerCityName, String customerAddress, String itemExpenses, String deliveryCharges, String orderTrackingNumber, String courier, String orderPlacingDate, String orderStatus, String uid) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerCityName = customerCityName;
        this.customerAddress = customerAddress;
        this.itemExpenses = itemExpenses;
        this.deliveryCharges = deliveryCharges;
        this.orderTrackingNumber = orderTrackingNumber;
        this.courier = courier;
        this.orderPlacingDate = orderPlacingDate;
        this.orderStatus = orderStatus;
        this.uid = uid;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerCityName() {
        return customerCityName;
    }

    public void setCustomerCityName(String customerCityName) {
        this.customerCityName = customerCityName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getItemExpenses() {
        return itemExpenses;
    }

    public void setItemExpenses(String itemExpenses) {
        this.itemExpenses = itemExpenses;
    }

    public String getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(String deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }

    public void setOrderTrackingNumber(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getOrderPlacingDate() {
        return orderPlacingDate;
    }

    public void setOrderPlacingDate(String orderPlacingDate) {
        this.orderPlacingDate = orderPlacingDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
