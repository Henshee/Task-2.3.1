package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "email")
    private String email;


    public User() {}

    public User(String firstName, String lastName, String email) {
        this.name = firstName;
        this.lastname = lastName;
        this.email = email;
    }

    public User(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.name = firstName;
        this.lastname = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User #" + id +
                ":  name:  " + name + " | " +
                "lastname:  " + lastname + " | " +
                " email:  " + email;
    }
}
