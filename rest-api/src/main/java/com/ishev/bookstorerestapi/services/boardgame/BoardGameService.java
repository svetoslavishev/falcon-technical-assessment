package com.ishev.bookstorerestapi.services.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;

import java.util.List;

public interface BoardGameService {
    List<BoardGame> getAllBoardGames();
    List<BoardGame> getAllBoardGamesByNumberOfPlayers(int numberOfPlayers);
    List<BoardGame> getAllBoardGamesByName(String name);
    void updateBoardGameQuantity(int boardGameId, int quantity);
}
