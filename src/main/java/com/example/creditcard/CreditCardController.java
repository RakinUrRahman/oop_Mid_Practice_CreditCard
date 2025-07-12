package com.example.creditcard;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardController
{
    @javafx.fxml.FXML
    private TextField cardNoTextField;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> holderNameCol;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> cardTypeCol;
    @javafx.fxml.FXML
    private TextField creditLimitTextfield;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> gatewayCol;
    @javafx.fxml.FXML
    private TableView<CreditCard> creditCardTableView;
    @javafx.fxml.FXML
    private TextField holderNameTextField;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, Float> creditLimitCol;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, LocalDate> dateOfExpCol;
    @javafx.fxml.FXML
    private DatePicker dateExpDatePicket;
    @javafx.fxml.FXML
    private ComboBox<String> cardTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> gatewayNameComboBox;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> cardNoCol;

    ArrayList<CreditCard> cardList = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {
        cardNoCol.setCellValueFactory(new PropertyValueFactory<>("cardNo"));
        holderNameCol.setCellValueFactory(new PropertyValueFactory<>("holderName"));
        dateOfExpCol.setCellValueFactory(new PropertyValueFactory<>("dateOfExpiry"));
        gatewayCol.setCellValueFactory(new PropertyValueFactory<>("gatewayName"));
        creditLimitCol.setCellValueFactory(new PropertyValueFactory<>("creditLimit"));
        cardTypeCol.setCellValueFactory(new PropertyValueFactory<>("cardType"));

        cardTypeComboBox.getItems().addAll("Silver","Gold","Platinum","Titanium");
        gatewayNameComboBox.getItems().addAll("Visa","Master Card");
    }

    @javafx.fxml.FXML
    public void handleAddCreditCardButton(ActionEvent actionEvent) {

        if (cardNoTextField.getText().length() != 16 ){

            showAlert("Card Number Length Must Be 16 ! ");
            return;
        }

        if (gatewayNameComboBox.getValue().equals("Visa") && Integer.parseInt(cardNoTextField.getText().charAt(0) == "4"))


    }

    public void showAlert(String message){
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText(message);
        a.showAndWait();

    }
}