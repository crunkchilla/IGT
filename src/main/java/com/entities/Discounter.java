package com.entities;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Severin on 28.05.2016.
 */
@Entity
public class Discounter implements Serializable{

    @Id
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "customerId")
    public Customer customer;

    @NotNull
    public double amount;

    public Discounter(double amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }
    public Discounter() {

    }

}
