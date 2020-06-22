package com.twschool.practice;

import com.twschool.practice.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;
    @Autowired
    private GameRepository gameRepository;

    @PostMapping("/games/guess-number")
    public GameUser guess(@RequestBody Map<String,String> requestBody){

        GameUser gameUser = new GameUser();
//        if(gameUser.findId(gameUser.getId())){
            String number = requestBody.get("number");
            gameUser.setInputNumber(requestBody.get("number"));
            gameUser.setAbAnswer(gameService.guess(number));
            gameUser.setStatus(gameService.getStatus());
            gameUser.setScore(GameScore.score);
//        }else{
//            gameUser.init();
//        }
        return gameUser;
    }

}
