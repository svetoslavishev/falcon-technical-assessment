package com.ishev.bookstorerestapi.services.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;
import com.ishev.bookstorerestapi.repositories.boardgame.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameServiceImpl implements BoardGameService {

    private BoardGameRepository boardGameRepository;

    @Autowired
    public BoardGameServiceImpl(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    @Override
    public List<BoardGame> getAllBoardGamesByNumberOfPlayers(int numberOfPlayers) {
        return null;
    }

    @Override
    public List<BoardGame> getAllBoardGamesByName(String name) {
        return null;
    }
}
