package com.ishev.bookstorerestapi.controllers;

import com.ishev.bookstorerestapi.models.BoardGame;
import com.ishev.bookstorerestapi.services.boardgame.BoardGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGameRestController {

    private final BoardGameService boardGameService;

    @Autowired
    public BoardGameRestController(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @GetMapping
    public List<BoardGame> getBoardGamesCatalog() {
        return boardGameService.getAllBoardGames();
    }

    @GetMapping("/name/{name}")
    public List<BoardGame> searchForBoardGamesByName(@PathVariable String name) {
        return boardGameService.getAllBoardGamesByName(name);
    }

    @GetMapping("/players/{numberOfPlayers}")
    public List<BoardGame> searchForBoardGamesByNumberOfPlayers(@PathVariable int numberOfPlayers) {
        return boardGameService.getAllBoardGamesByNumberOfPlayers(numberOfPlayers);
    }

    @PutMapping("/{boardGameId}/{quantity}")
    public void updateBoardGameQuantity(@PathVariable int boardGameId, @PathVariable int quantity) {
        boardGameService.updateBoardGameQuantity(boardGameId, quantity);
    }
}
