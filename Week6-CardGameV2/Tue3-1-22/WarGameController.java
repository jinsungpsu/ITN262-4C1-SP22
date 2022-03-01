package com.example.warcardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.Stack;

public class WarGameController {

    private Stack<Integer> originalDeck = new Stack<>();
    private Stack<Integer> p1won = new Stack<>();
    private Stack<Integer> p2won = new Stack<>();
    private Stack<Integer> p1cards = new Stack<>();
    private Stack<Integer> p2cards = new Stack<>();

    @FXML
    private Button button;

    @FXML
    private AnchorPane deck;

    @FXML
    private ImageView p1imageView;

    @FXML
    private ImageView p2imageView;


    // highest to lowest: spades, hearts, diamonds, clubs
    private String[] cardFileNames = {
            "ace_of_clubs.png", // 0
            "ace_of_diamonds.png", // 1
            "ace_of_hearts.png",
            "ace_of_clubs.png",
            "2_of_clubs.png",
            "2_of_diamonds.png",
            "2_of_hearts.png",
            "2_of_spades.png",
            "red_joker.png",
            "black_joker.png"
    };

    @FXML
    public void initialize() {
        // fill the original deck with integers 0 - 51
        // give out those cards to p1 and p2 cards randomly (26 each)

        fillOriginalDeck();
        dealCards();
        playGame();

    }

    void viewCard(int cardNum, int playerID) {

        String cardPathRoot = "images/cardImages/";
        URL path = getClass().getResource(cardPathRoot+cardFileNames[cardNum]);
        Image cardImage = new Image(path.toExternalForm());

        ImageView cardImageView;
        if (playerID == 0) {
            // player 1
            cardImageView = p1imageView;

        } else {
            // player 2
            cardImageView = p2imageView;

        }
        cardImageView.setImage(cardImage);
    }

    void fillOriginalDeck() {
        for (int i = 0; i < 6; i++) {
            originalDeck.push(i);
        }
    }

    void dealCards() {
        while(!originalDeck.isEmpty()) {
            p1cards.push(originalDeck.pop());
            p2cards.push(originalDeck.pop());
        }
    }

    void checkPlayerCards() {
        System.out.println("Player 1 has: " + p1cards);
        System.out.println("Player 2 has: " + p2cards);
        System.out.println("P1 has card: " + p1cards.peek());
        System.out.println("P1 has card: " + p2cards.peek());
        viewCard(p1cards.peek(), 0);
        viewCard(p2cards.peek(), 1);
    }

    public void playGame() {
        checkPlayerCards();

        // during each round, compare the top card on each player's stack
        // whoever has the higher number wins that round
        // the winner places both cards of that round into their "won" stack
    }


    @FXML
    void buttonPressed(ActionEvent event) {
        //viewCard(0);
    }

}
