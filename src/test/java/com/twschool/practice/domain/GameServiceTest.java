package com.twschool.practice.domain;

import com.twschool.practice.GameService;
import org.junit.Assert;
import org.junit.Test;

public class GameServiceTest {
    @Test
    public void should_return_result_when_guess_number_once(){
        GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        GameService gameService = new GameService(guessNumberGame);
        String result = gameService.guess("1 2 3 4");
        Assert.assertNotNull(result);
    }
}
