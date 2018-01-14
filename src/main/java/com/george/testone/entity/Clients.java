/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

/**
 *
 * @author George
 */
public class Clients {
    private SimpleLongProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty coache;
    private SimpleStringProperty timeIn;

    public Clients(Long id, String name, String coache, String timeIn) {
        this.id = new SimpleLongProperty(id);
        this.name = new SimpleStringProperty(name);
        this.coache = new SimpleStringProperty(coache);
        this.timeIn = new SimpleStringProperty(timeIn);
    }

    public Long getId() {
        return id.get();
    }

    public void setId(Long id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getCoache() {
        return coache.get();
    }

    public void setCoache(String coache) {
        this.coache.set(coache);
    }

    public String getTimeIn() {
        return timeIn.get();
    }

    public void setTimeIn(String timeIn) {
        this.timeIn.set(timeIn);
    }

    public SimpleLongProperty idProperty(){
        return id;
    }

    public SimpleStringProperty nameProperty(){
        return name;
    }

    public SimpleStringProperty coacheProperty(){
        return coache;
    }

    public SimpleStringProperty timeInProperty(){
        return timeIn;
    }

    @Override
    public String toString() {
        return "Clients{" + "id=" + id + ", name=" + name + ", coache=" + coache + ", timeIn=" + timeIn + '}';
    }
    
    

}
