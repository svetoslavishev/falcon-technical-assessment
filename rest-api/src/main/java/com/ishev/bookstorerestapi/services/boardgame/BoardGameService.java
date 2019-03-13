package com.ishev.bookstorerestapi.services.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;

import java.util.List;

public interface BoardGameService {
    List<BoardGame> getAllBoardGamesByNumberOfPlayers(int numberOfPlayers);
    List<BoardGame> getAllBoardGamesByName(String name);
}
