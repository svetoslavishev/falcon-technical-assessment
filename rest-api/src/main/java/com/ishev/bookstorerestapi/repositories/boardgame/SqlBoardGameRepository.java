package com.ishev.bookstorerestapi.repositories.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlBoardGameRepository implements BoardGameRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public SqlBoardGameRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
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
