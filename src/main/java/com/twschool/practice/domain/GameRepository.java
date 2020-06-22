package com.twschool.practice.domain;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GameRepository {

    private GuessNumberGame guessNumberGame;

    public GuessNumberGame create() {
        guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        return guessNumberGame;
    }

    public GuessNumberGame find() {
        return guessNumberGame;
    }

}
