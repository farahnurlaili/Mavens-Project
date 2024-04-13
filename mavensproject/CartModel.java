package com.example.mavensproject;

public class CartModel {
    private String cartId;
    private String productName;
    private String productImage;
    private String productPrice;
    private String productQty;
    private String sellerUid;
    public boolean isSelected;
    private String orderNumber;

    public CartModel() {
    }

    public CartModel(String cartId, String productName, String productImage, String productPrice, String productQty, String sellerUid,  String orderNumber) {
        this.cartId = cartId;
        this.productName = productName;
        this.productImage = productImage;
        this.productPrice = productPrice;
        this.productQty = productQty;
        this.sellerUid = sellerUid;
        this.orderNumber = orderNumber;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getSellerUid() {
        return sellerUid;
    }

    public void setSellerUid(String sellerUid) {
        this.sellerUid = sellerUid;
    }
    public void setIsSelected(boolean selected) {
        isSelected = selected;
    }
}

