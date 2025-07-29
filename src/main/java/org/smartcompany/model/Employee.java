package org.smartcompany.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    // JPA requires a public/protected no-arg constructor
    public Employee() {}

    // Optionally: convenience constructor
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters for all fields
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }
}

