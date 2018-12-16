package com.entity;
// Generated 2016-10-26 11:09:08 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Merchandise generated by hbm2java
 */
public class Merchandise  implements java.io.Serializable {


     private Integer mid;
     private Merpic merpic;
     private Saler saler;
     private String name;
     private String specialInfo1;
     private String specialInfo2;
     private String category;
     private int quantity;
     private String des;
     private float price;
     private float mdiscount;
     private Set carts = new HashSet(0);
     private Set recommendations = new HashSet(0);
     private Set orders = new HashSet(0);

    public Merchandise() {
    }

	
    public Merchandise(Merpic merpic, Saler saler, String name, String category, int quantity, String des, float price, float mdiscount) {
        this.merpic = merpic;
        this.saler = saler;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.des = des;
        this.price = price;
        this.mdiscount = mdiscount;
    }
    public Merchandise(Merpic merpic, Saler saler, String name, String specialInfo1, String specialInfo2, String category, int quantity, String des, float price, float mdiscount, Set carts, Set recommendations, Set orders) {
       this.merpic = merpic;
       this.saler = saler;
       this.name = name;
       this.specialInfo1 = specialInfo1;
       this.specialInfo2 = specialInfo2;
       this.category = category;
       this.quantity = quantity;
       this.des = des;
       this.price = price;
       this.mdiscount = mdiscount;
       this.carts = carts;
       this.recommendations = recommendations;
       this.orders = orders;
    }
   
    public Integer getMid() {
        return this.mid;
    }
    
    public void setMid(Integer mid) {
        this.mid = mid;
    }
    public Merpic getMerpic() {
        return this.merpic;
    }
    
    public void setMerpic(Merpic merpic) {
        this.merpic = merpic;
    }
    public Saler getSaler() {
        return this.saler;
    }
    
    public void setSaler(Saler saler) {
        this.saler = saler;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialInfo1() {
        return this.specialInfo1;
    }
    
    public void setSpecialInfo1(String specialInfo1) {
        this.specialInfo1 = specialInfo1;
    }
    public String getSpecialInfo2() {
        return this.specialInfo2;
    }
    
    public void setSpecialInfo2(String specialInfo2) {
        this.specialInfo2 = specialInfo2;
    }
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDes() {
        return this.des;
    }
    
    public void setDes(String des) {
        this.des = des;
    }
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    public float getMdiscount() {
        return this.mdiscount;
    }
    
    public void setMdiscount(float mdiscount) {
        this.mdiscount = mdiscount;
    }
    public Set getCarts() {
        return this.carts;
    }
    
    public void setCarts(Set carts) {
        this.carts = carts;
    }
    public Set getRecommendations() {
        return this.recommendations;
    }
    
    public void setRecommendations(Set recommendations) {
        this.recommendations = recommendations;
    }
    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }




}


