package com.twschool.practice;

import com.twschool.practice.domain.GameRepository;
import com.twschool.practice.domain.GameService;
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

    @PostMapping("/games/guess-number")
    public Map<String,String> guess(@RequestBody Map<String,String> requestBody){
        Map<String,String> responseBody = new HashMap<>();
        String number = requestBody.get("number");
        responseBody.put("input",number);
        responseBody.put("result",gameService.guess(number));
        return responseBody;
    }

}
