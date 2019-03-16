package com.ishev.bookstorerestapi.models;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private int orderId;

    @Column(name = "id_customer")
    private int customerId;

    public Order() {

    }

    public Order(int orderId, int customerId) {
        setOrderId(orderId);
        setCustomerId(customerId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
