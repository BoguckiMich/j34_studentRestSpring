package com.sda.javagda34.demostudent.model;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Builder
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;


    public Student() {
    }

    public Student(Long id, String firstName, String lastName, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    public Student(Builder builder){
//        this.firstName= builder.firstName;
//        this.lastName= builder.lastName;
//        this.gender=builder.gender;
//    }

//    public class Builder {
//
//        private Long id;
//        private String firstName;
//        private String lastName;
//        private Gender gender;
//
//        public Builder() {
//        }
//
//        public Builder setFirstName(String firstName) {
//            this.firstName = firstName;
//            return this;
//        }
//
//        public Builder setLastName(String lastName) {
//            this.lastName = lastName;
//            return this;
//        }
//
//        public Builder setGender(Gender gender) {
//            this.gender = gender;
//            return this;
//        }
//
//        public Student  build() {
//            return new Student(this);
//        }
//    }
}
