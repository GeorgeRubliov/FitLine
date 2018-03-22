package com.george.testone.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TextField;

/**
 * Entity class for manage customer profile.
 * @author George
 */

public class Customer {

    private SimpleLongProperty id  = new SimpleLongProperty();
    private SimpleStringProperty firstName  = new SimpleStringProperty();
    private SimpleStringProperty secondName  = new SimpleStringProperty();
    private SimpleStringProperty familyName  = new SimpleStringProperty();
    private SimpleStringProperty mobileNumber  = new SimpleStringProperty();
    private SimpleStringProperty email  = new SimpleStringProperty();
    private SimpleStringProperty photo  = new SimpleStringProperty();
    private SimpleLongProperty program  = new SimpleLongProperty();
    private SimpleLongProperty gender  = new SimpleLongProperty();
    private SimpleStringProperty birthDate = new SimpleStringProperty();

    public Customer(){}

    /**
     *
     * @param id
     * @param firstName
     * @param secondName
     * @param familyName
     * @param mobileNumber
     * @param email
     * @param photo
     * @param program
     * @param gender
     * @param birthDate
     */
    public Customer(Long id,
                    String firstName,
                    String secondName,
                    String familyName,
                    String mobileNumber,
                    String email,
                    String photo,
                    Long program,
                    Long gender,
                    String birthDate){
        this.id.set(id);
        this.firstName.set(firstName);
        this.secondName.set(secondName);
        this.familyName.set(familyName);
        this.mobileNumber.set(mobileNumber);
        this.email.set(email);
        this.photo.set(photo);
        this.program.set(program);
        this.gender.set(gender);
        this.birthDate.set(birthDate);
    }

    /**
     *
     * @return
     */
    public long getId() {
        return id.get();
    }

    /**
     *
     * @return
     */
    public SimpleLongProperty idProperty() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id.set(id);
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    /**
     *
     * @return
     */
    public String getSecondName() {
        return secondName.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty secondNameProperty() {
        return secondName;
    }

    /**
     *
     * @param secondName
     */
    public void setSecondName(String secondName) {
        this.secondName.set(secondName);
    }

    /**
     *
     * @return
     */
    public String getFamilyName() {
        return familyName.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty familyNameProperty() {
        return familyName;
    }

    /**
     *
     * @param familyName
     */
    public void setFamilyName(String familyName) {
        this.familyName.set(familyName);
    }

    /**
     *
     * @return
     */
    public String getMobileNumber() {
        return mobileNumber.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty mobileNumberProperty() {
        return mobileNumber;
    }

    /**
     *
     * @param mobileNumber
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber.set(mobileNumber);
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty emailProperty() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email.set(email);
    }

    /**
     *
     * @return
     */
    public String getPhoto() {
        return photo.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty photoProperty() {
        return photo;
    }

    /**
     *
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo.set(photo);
    }

    /**
     *
     * @return
     */
    public long getProgram() {
        return program.get();
    }

    /**
     *
     * @return
     */
    public SimpleLongProperty programProperty() {
        return program;
    }

    /**
     *
     * @param program
     */
    public void setProgram(long program) {
        this.program.set(program);
    }

    /**
     *
     * @return
     */
    public long getGender() {
        return gender.get();
    }

    /**
     *
     * @return
     */
    public SimpleLongProperty genderProperty() {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(long gender) {
        this.gender.set(gender);
    }

    /**
     *
     * @return
     */
    public String getBirthDate() {
        return birthDate.get();
    }

    /**
     *
     * @return
     */
    public SimpleStringProperty birthDateProperty() {
        return birthDate;
    }

    /**
     *
     * @param birthDate
     */
    public void setBirthDate(String birthDate) {
        this.birthDate.set(birthDate);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", secondName=" + secondName +
                ", familyName=" + familyName +
                ", mobileNumber=" + mobileNumber +
                ", email=" + email +
                ", photo=" + photo +
                ", program=" + program +
                ", gender=" + gender +
                ", birthDate="+ birthDate +
                '}'+"\n ";
    }


}
