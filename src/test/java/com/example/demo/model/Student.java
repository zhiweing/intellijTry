package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
@Entity  //For hibernate purpose
@Data
@Table

//try for pull requests
//try j

public class Student {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "First Name")
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDate dob;
    private String gender;
    private String height;
    private int length;

    public Student(){

    }

    public Student(int id,String firstName,
                   String lastName,
                   String email,
                   String password,
                   LocalDate dob,
                   String gender) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
    }

    public Student(String firstName,
                   String lastName,
                   String email,
                   String password,
                   LocalDate dob,
                   String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob(){
        return this.dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "User Registered Successfully!\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Email: " + email + "\n" +
                "DOB: " + dob + "\n" +
                "Gender: " + gender;
    }
}
