package com.twschool.practice.domain;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GameRepository;
import com.twschool.practice.domain.GuessNumberGame;

public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public String guess(String userInputString){
        //生成随机数
        return gameRepository.find().guess(userInputString);
    }
}
