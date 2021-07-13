//package com.saroj.demo.newModule;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="bills")
//public class Billing {
//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private int id;
//
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "product_id")
//    private Product product;
//
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "operator_id")
//    private NewUser customer;
//
//    private NewUser handleBy;
//    private long quantity;
//   private double totalBill;
//    private Boolean paid;
//
//    public Billing() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public NewUser getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(NewUser customer) {
//        this.customer = customer;
//    }
//
//    public NewUser getHandleBy() {
//        return handleBy;
//    }
//
//    public void setHandleBy(NewUser handleBy) {
//        this.handleBy = handleBy;
//    }
//
//    public double getTotalBill() {
//        return totalBill;
//    }
//
//    public void setTotalBill(double totalBill) {
//        this.totalBill = totalBill;
//    }
//
//    public Boolean getPaid() {
//        return paid;
//    }
//
//    public void setPaid(Boolean paid) {
//        this.paid = paid;
//    }
//
//    public long getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(long quantity) {
//        this.quantity = quantity;
//    }
//}
