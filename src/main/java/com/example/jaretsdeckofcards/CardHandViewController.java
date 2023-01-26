package com.example.jaretsdeckofcards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;
//implements initializable means the CardHandViewController is also an Initializable class
//Initializable is an interface that defines we must havea  method called initialize

public class CardHandViewController implements Initializable {

    @FXML
    private Button ButtonLabel;

    @FXML
    private Label ColorLabel;

    @FXML
    private Label FaceNameLabel;

    @FXML
    private Label SuitLabel;

    @FXML
    private ImageView imageView;
    @FXML
    private Label ValueLabel;

    private DeckOfCards deck;


    @FXML
    void DealNextCard() {
        Card cardSelected = deck.dealTopCard();
        FaceNameLabel.setText("Face Name: " + cardSelected.getFaceName());
        ColorLabel.setText("Colour: " + cardSelected.getColour());
        SuitLabel.setText("Suit: " + cardSelected.getSuit());
        ValueLabel.setText("Value: " + cardSelected.getFaceValue());
        imageView.setImage(cardSelected.getImage());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        DealNextCard();
    }
}

