/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.george.testone.controller;

import com.george.testone.collection.CustomerCollection;
import com.george.testone.dataBase.DbQuery;
import com.george.testone.entity.Customer;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import java.util.Optional;

/***********************************************************************************************************************
 *
 * This class was write for manage Operators.fxml file
 *
 * @author George
 *
 **********************************************************************************************************************/

public class OperatorsController{

    private CustomerCollection customerCollection = new CustomerCollection();
    private Customer customerListener;
    private ObservableList<Customer> customerObservableList;

    @FXML
    private TableView<Customer> table;
    @FXML
    private BorderPane operatorGUI;
    @FXML
    private TableColumn<Customer, String> firstName;
    @FXML
    private TableColumn<Customer, String> familyName;
    @FXML
    private TableColumn<Customer, String> mobileNumber;
    @FXML
    private Label firstNameInfo;
    @FXML
    private Label secondNameInfo;
    @FXML
    private Label familyNameInfo;
    @FXML
    public Button customerEdit;

    /*******************************************************************************************************************
     *                                                                                                                 *
     * The method initializes lines in the table and show information about customers which does exercise in the gym.  *
     *                                                                                                                 *
     ******************************************************************************************************************/

    @FXML
    private void initialize() {
        customerObservableList = customerCollection.getList();
        firstName.setCellValueFactory(new PropertyValueFactory<Customer, String>("firstName"));
        familyName.setCellValueFactory(new PropertyValueFactory<Customer, String>("familyName"));
        mobileNumber.setCellValueFactory(new PropertyValueFactory<Customer, String>("mobileNumber"));
        customerCollection.init();

        table.setItems(customerObservableList);

        table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
                setNames(newValue));
        table.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->
                setValueForCustomerListener(newValue));
    }

    private void setNames(Customer newValue) {
        try{
            firstNameInfo.setText(newValue.getFirstName());
            secondNameInfo.setText(newValue.getSecondName());
            familyNameInfo.setText(newValue.getFamilyName());
        }catch (NullPointerException e){
            System.out.println("exception in OperatorController setName: this exception is under control");
        }

    }

    private void event(ActionEvent actionEvent){
        Object source = actionEvent.getSource();
        if(!(source instanceof Button)){
            return;
        }
        Button button = (Button) source;
    }

    /*******************************************************************************************************************
     *
     * This method for closing the operator's window.
     *
     ******************************************************************************************************************/

    @FXML
    private void closeOperator(){
        System.exit(0);
    }

    /*******************************************************************************************************************
     *                                                                                                                 *
     * This method listen action event from the button edit for a chosen customer and call a dialog window with        *
     * data about this customer from ObserList<Customer></Customer>                                                    *
     *                                                                                                                 *
     * @param actionEvent                                                                                              *
     ******************************************************************************************************************/

    public void edit(ActionEvent actionEvent) {
        if(checkListenerValue(customerListener)){
            Dialog<Customer> dialog = new Dialog<>();
            dialog.setTitle("test Dialog for customer");

            /**
             *
             * initial lines
             *
             */

            Label idLabel = new Label("ID: ");
            Label idValueLabel = new Label(Long.toString(customerListener.getId()));
            Label firstNameLabel = new Label("First Name: ");
            TextField firstNameTextField = new TextField(customerListener.getFirstName());
            Label secondNameLabel = new Label("Second Name: ");
            TextField secondNameTextField = new TextField(customerListener.getSecondName());
            Label familyNameLabel = new Label("Family Name: ");
            TextField familyNameTextField = new TextField(customerListener.getFamilyName());
            Label mobileNumberLabel = new Label("Mobile Number: ");
            TextField mobileNumberTextField = new TextField(customerListener.getMobileNumber());
            ButtonType okButton = new ButtonType("Ok");

            /***********************************************************************************************************
             *                                                                                                         *
             * Adding lines to a GridPane                                                                              *
             *                                                                                                         *
             **********************************************************************************************************/

            GridPane gridPane = new GridPane();
            gridPane.add(idLabel, 1,1);
            gridPane.add(idValueLabel,2,1);
            gridPane.add(firstNameLabel, 1,2);
            gridPane.add(firstNameTextField,2,2);
            gridPane.add(secondNameLabel, 1,3);
            gridPane.add(secondNameTextField,2,3);
            gridPane.add(familyNameTextField,2,4);
            gridPane.add(familyNameLabel, 1,4);
            gridPane.add(mobileNumberLabel, 1,5);
            gridPane.add(mobileNumberTextField,2,5);

            /***********************************************************************************************************
             *                                                                                                         *
             * add the gridPane to the dialog window
             *                                                                                                         *
             **********************************************************************************************************/

            dialog.getDialogPane().setContent(gridPane);
            dialog.getDialogPane().getButtonTypes().add(okButton);
//            dialog.show();

            /***********************************************************************************************************
             *
             * button listener
             *
             **********************************************************************************************************/

            dialog.setResultConverter(new javafx.util.Callback<ButtonType, Customer>() {
                @Override
                public Customer call(ButtonType param) {
                    Customer temp = new Customer();
                    if(param == okButton){
                        temp.setFirstName(firstNameTextField.getText());
                        customerListener.setFirstName(firstNameTextField.getText());
                        temp.setFamilyName(familyNameTextField.getText());
                        customerListener.setFamilyName(familyNameTextField.getText());
                        temp.setId(Long.parseLong(idValueLabel.getText()));
                        customerListener.setId(Long.parseLong(idValueLabel.getText()));
                        temp.setMobileNumber(mobileNumberTextField.getText());
                        customerListener.setMobileNumber(mobileNumberTextField.getText());
                        new DbQuery().stringQuery("");
                    }
                    return temp;
                }
            });

            Optional<Customer> result = dialog.showAndWait();

            if(result.isPresent()){
                System.out.println(result.get());
            }

        }

    }


    public void setValueForCustomerListener(Customer valueForCustomerListener) {
        if(checkListenerValue(valueForCustomerListener)){
            this.customerListener = valueForCustomerListener;
        }

    }

    private boolean checkListenerValue(Customer valueForCustomerListener) {
        if(valueForCustomerListener != null){
            return true;
        }
            return false;
    }

    /*******************************************************************************************************************
     *                                                                                                                 *
     * Listener for a button for update information from ObservableList
     *
     * @param actionEvent                                                                                              *
     *                                                                                                                 *
     ******************************************************************************************************************/

    public void updateTable(ActionEvent actionEvent) {
        customerCollection.refreshCustomerObservableList();
        customerObservableList = customerCollection.getList();
    }

    public void searchAction(ActionEvent actionEvent) {

    }
}


