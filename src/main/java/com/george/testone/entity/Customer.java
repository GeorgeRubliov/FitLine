package com.george.testone.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Customer {
    private Long id;
    private String firstName;
    private String secondName;
    private String familyName;
    private String mobileNumber;
    private String email;
    private String photo;
    private Long program;
    private Long gender;

    public Customer(Long id, String firstName, String secondName, String familyName, String mobileNumber, String email, String photo, Long program, Long gender) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.familyName = familyName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.photo = photo;
        this.program = program;
        this.gender = gender;
    }

    public Customer() {
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

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getProgram() {
        return program;
    }

    public void setProgram(Long program) {
        this.program = program;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", photo='" + photo + '\'' +
                ", program=" + program +
                ", gender=" + gender +
                '}';
    }

    //    private SimpleLongProperty id;
//    private SimpleStringProperty firstName;
//    private SimpleStringProperty secondName;
//    private SimpleStringProperty familyName;
//    private SimpleStringProperty mobileNumber;
//    private SimpleStringProperty email;
//    private SimpleStringProperty photo;
//    private SimpleLongProperty program;
//    private SimpleLongProperty gender;
//
//    public Customer(){
//
//    }
//
//    public Customer(Long id,
//                    String firstName,
//                    String secondName,
//                    String familyName,
//                    String mobileNumber,
//                    String email,
//                    String photo,
//                    Long program,
//                    Long gender){
//        this.id = new SimpleLongProperty(id);
//        this.firstName = new SimpleStringProperty(firstName);
//        this.secondName = new SimpleStringProperty(secondName);
//        this.familyName = new SimpleStringProperty(familyName);
//        this.mobileNumber = new SimpleStringProperty(mobileNumber);
//        this.email = new SimpleStringProperty(email);
//        this.photo = new SimpleStringProperty(photo);
//        this.program = new SimpleLongProperty(program);
//        this.gender = new SimpleLongProperty(gender);
//    }
//
//    public long getId() {
//        return id.get();
//    }
//
////    public SimpleLongProperty idProperty() {
////        return id;
////    }
//
//    public void setId(long id) {
//        this.id.set(id);
//    }
//
//    public String getFirstName() {
//        return firstName.get();
//    }
//
////    public SimpleStringProperty firstNameProperty() {
////        return firstName;
////    }
//
//    public void setFirstName(String firstName) {
//        this.firstName.set(firstName);
//    }
//
//    public String getSecondName() {
//        return secondName.get();
//    }
//
////    public SimpleStringProperty secondNameProperty() {
////        return secondName;
////    }
//
//    public void setSecondName(String secondName) {
//        this.secondName.set(secondName);
//    }
//
//    public String getFamilyName() {
//        return familyName.get();
//    }
//
////    public SimpleStringProperty familyNameProperty() {
////        return familyName;
////    }
//
//    public void setFamilyName(String familyName) {
//        this.familyName.set(familyName);
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber.get();
//    }
//
////    public SimpleStringProperty mobileNumberProperty() {
////        return mobileNumber;
////    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber.set(mobileNumber);
//    }
//
//    public String getEmail() {
//        return email.get();
//    }
//
////    public SimpleStringProperty emailProperty() {
////        return email;
////    }
//
//    public void setEmail(String email) {
//        this.email.set(email);
//    }
//
//    public String getPhoto() {
//        return photo.get();
//    }
//
////    public SimpleStringProperty photoProperty() {
////        return photo;
////    }
//
//    public void setPhoto(String photo) {
//        this.photo.set(photo);
//    }
//
//    public long getProgram() {
//        return program.get();
//    }
//
////    public SimpleLongProperty programProperty() {
////        return program;
////    }
//
//    public void setProgram(long program) {
//        this.program.set(program);
//    }
//
//    public long getGender() {
//        return gender.get();
//    }
//
////    public SimpleLongProperty genderProperty() {
////        return gender;
////    }
//
//    public void setGender(long gender) {
//        this.gender.set(gender);
//    }
}
