package org.smartcompany.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    private double amount;

    private int employee_id;

    // JPA requires a public/protected no-arg constructor
    public Expense() {}

    // Optionally: convenience constructor
    public Expense(Date date, double amount, int employee_id) {
        this.date = date;
        this.amount = amount;
        this.employee_id = employee_id;
    }

    // Getters and setters for all fields
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}

