package com.twschool.practice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public String guess(String userInputString){
        //生成随机数
        GuessNumberGame guessNumberGame = gameRepository.find();
        return guessNumberGame.guess(userInputString);
    }
}
