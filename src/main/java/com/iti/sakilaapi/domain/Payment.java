// default package
// Generated Apr 6, 2023, 1:53:34 AM by Hibernate Tools 6.1.7.Final
package com.iti.sakilaapi.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment"
        , catalog = "sakila"
)
public class Payment implements java.io.Serializable {


    private Short paymentId;
    private Staff staff;
    private Customer customer;
    private Rental rental;
    private BigDecimal amount;
    private Date paymentDate;
    private Date lastUpdate;

    public Payment() {
    }


    public Payment(Staff staff, Customer customer, BigDecimal amount, Date paymentDate) {
        this.staff = staff;
        this.customer = customer;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public Payment(Staff staff, Customer customer, Rental rental, BigDecimal amount, Date paymentDate, Date lastUpdate) {
        this.staff = staff;
        this.customer = customer;
        this.rental = rental;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.lastUpdate = lastUpdate;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)


    @Column(name = "payment_id", unique = true, nullable = false)
    public Short getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(Short paymentId) {
        this.paymentId = paymentId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id", nullable = false)
    public Staff getStaff() {
        return this.staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rental_id")
    public Rental getRental() {
        return this.rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }


    @Column(name = "amount", nullable = false, precision = 5, scale = 2)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "payment_date", nullable = false, length = 19)
    public Date getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", length = 19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


}

