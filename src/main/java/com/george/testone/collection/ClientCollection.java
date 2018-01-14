package com.george.testone.collection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.george.testone.entity.Clients;

public class ClientCollection {
    private ObservableList<Clients> list = FXCollections.observableArrayList();
    public void add(Clients clients){
        list.add(clients);
    }

    public ObservableList<Clients> getList(){
        return list;
    }

    public void delete(Clients clients){
        list.remove(clients);
    }

    public void fileTestData(){
        list.add(new Clients(1L,"G","M","121221"));
    }

    public ObservableList<Clients> getClientsList(){
        return this.list;
    }

}
