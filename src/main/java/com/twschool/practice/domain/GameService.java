package com.twschool.practice.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public String guess(String userInputString){
        GuessNumberGame guessNumberGame = gameRepository.find();
//        GameUser gameUser = new GameUser();
//        if(!gameUser.findId(userId)){
//            gameUser.init();
//            gameUser.addId(userId);
//        }
        if(guessNumberGame == null){
            guessNumberGame = gameRepository.create();
        }else if(getStatus().equals("FAILED") || getStatus().equals("SUCCEED")){
            guessNumberGame = gameRepository.create();
        }
        return guessNumberGame.guess(userInputString);
    }
    public String getStatus(){
        return gameRepository.find().getStatus().name();
    }
}
