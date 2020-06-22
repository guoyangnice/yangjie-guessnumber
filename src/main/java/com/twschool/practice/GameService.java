package com.twschool.practice;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;

public class GameService {
    GuessNumberGame guessNumberGame;
    public GameService(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public String guess(String userInputString){
        //生成随机数
        guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        String result = guessNumberGame.guess(userInputString);
        return result;
    }
}
