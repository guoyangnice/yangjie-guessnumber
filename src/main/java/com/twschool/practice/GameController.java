package com.twschool.practice;

import com.twschool.practice.domain.GameRepository;
import com.twschool.practice.domain.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {

    @PostMapping("/games/guess-number")
    public Map<String,String> guess(@RequestBody Map<String,String> requestBody){
        Map<String,String> responseBody = new HashMap<>();
        GameService gameService = new GameService(new GameRepository());
        responseBody.put("input",requestBody.get("number"));
        responseBody.put("result",gameService.guess("1 2 3 4"));
        return responseBody;
    }

}
