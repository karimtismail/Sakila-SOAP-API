// default package
// Generated Apr 6, 2023, 1:53:34 AM by Hibernate Tools 6.1.7.Final
package com.iti.sakilaapi.domain;

import jakarta.persistence.*;

/**
 * CustomerList generated by hbm2java
 */
@Entity
@Table(name = "customer_list"
        , catalog = "sakila"
)
public class CustomerList implements java.io.Serializable {


    private CustomerListId id;

    public CustomerList() {
    }

    public CustomerList(CustomerListId id) {
        this.id = id;
    }

    @EmbeddedId


    @AttributeOverrides({
            @AttributeOverride(name = "address", column = @Column(name = "address", nullable = false, length = 50)),
            @AttributeOverride(name = "city", column = @Column(name = "city", nullable = false, length = 50)),
            @AttributeOverride(name = "country", column = @Column(name = "country", nullable = false, length = 50)),
            @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false)),
            @AttributeOverride(name = "name", column = @Column(name = "name", length = 91)),
            @AttributeOverride(name = "notes", column = @Column(name = "notes", nullable = false, length = 6)),
            @AttributeOverride(name = "phone", column = @Column(name = "phone", nullable = false, length = 20)),
            @AttributeOverride(name = "sid", column = @Column(name = "SID", nullable = false)),
            @AttributeOverride(name = "zipCode", column = @Column(name = "zip code", length = 10))})
    public CustomerListId getId() {
        return this.id;
    }

    public void setId(CustomerListId id) {
        this.id = id;
    }


}


