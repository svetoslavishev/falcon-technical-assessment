package com.ishev.bookstorerestapi.repositories.boardgame;

import com.ishev.bookstorerestapi.models.BoardGame;
import org.hibernate.Session;
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
    public List<BoardGame> getAllBoardGames() {
        List<BoardGame> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from BoardGame").list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public List<BoardGame> getAllBoardGamesByNumberOfPlayers(int numberOfPlayers) {
        List<BoardGame> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from BoardGame where minPlayers <= :numberOfPlayers and maxPlayers >= :numberOfPlayers")
                    .setParameter("numberOfPlayers", numberOfPlayers)
                    .list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public List<BoardGame> getAllBoardGamesByName(String name) {
        List<BoardGame> result;

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            result = session.createQuery("from BoardGame where upper(name) like :name")
                    .setParameter("name", name.toUpperCase() + "%")
                    .list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

        return result;
    }

    @Override
    public void updateBoardGameQuantity(int boardGameId, int quantity) {

        try(
                Session session = sessionFactory.openSession()
        ) {
            session.beginTransaction();
            BoardGame boardGameToBeUpdated = session.get(BoardGame.class, boardGameId);
            int currentQuantity = boardGameToBeUpdated.getInStockQuantity();
            if (currentQuantity + quantity >= 0) {
                boardGameToBeUpdated.setInStockQuantity(currentQuantity + quantity);
            }
            session.update(boardGameToBeUpdated);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
    }
}
