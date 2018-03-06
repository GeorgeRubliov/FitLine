package com.george.testone.interfaces;

import com.george.testone.entity.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public interface Collectiones<T> {
    void add(T t);
    ObservableList<T> getList();
    void init();
}
