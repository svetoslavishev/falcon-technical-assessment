package com.ishev.bookstorerestapi.repositories.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;

import java.util.List;

public interface BoardGameRepository {
    List<BoardGame> getAllBoardGamesByNumberOfPlayers(int numberOfPlayers);
    List<BoardGame> getAllBoardGamesByName(String name);
}
