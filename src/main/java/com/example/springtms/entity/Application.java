package com.example.springtms.entity;

import javax.persistence.*;

@Entity
@Table(name = "application")

public class Application {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    private String address;
    private int status;

    @Column(name = "firstname")

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }
    @Column(name = "lastname")
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name = "Status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }
}
