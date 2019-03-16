package com.ishev.bookstorerestapi.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_details")
    private int orderDetailsId;

    @Column(name = "id_order")
    private int orderId;

    @Column(name = "id_item")
    private int itemId;

    @Column(name = "quantity")
    private int quantity;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date;

    public OrderDetails() {

    }

    public OrderDetails(int orderDetailsId, int orderId, int itemId, int quantity, Date date) {
        setOrderDetailsId(orderDetailsId);
        setOrderId(orderId);
        setItemId(itemId);
        setQuantity(quantity);
        setDate(date);
    }

    public int getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
