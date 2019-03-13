package com.ishev.bookstorerestapi.models;

import javax.persistence.*;

@Entity
@Table(name = "item_board_game")
public class BoardGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_item_board_game")
    private int boardGameId;

    @Column(name = "id_item")
    private int itemId;

    @Column(name = "board_game_name")
    private String name;

    @Column(name = "min_players")
    private int minPlayers;

    @Column(name = "max_players")
    private int maxPlayers;

    @Column(name = "board_game_price")
    private double price;

    @Column(name = "board_game_stock")
    private int inStockQuantity;

    public BoardGame() {

    }

    public BoardGame(int boardGameId, int itemId, String name, int minPlayers, int maxPlayers, double price, int stock) {
        setBoardGameId(boardGameId);
        setItemId(itemId);
        setName(name);
        setMinPlayers(minPlayers);
        setMaxPlayers(maxPlayers);
        setPrice(price);
        setInStockQuantity(stock);
    }

    public int getBoardGameId() {
        return boardGameId;
    }

    public void setBoardGameId(int boardGameId) {
        this.boardGameId = boardGameId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int stock) {
        this.inStockQuantity = stock;
    }
}
