package com.twschool.practice.domain;

import com.twschool.practice.GameService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GameServiceTest {
    @Test
    public void should_return_result_when_guess_number_once(){
        GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());
        GameService gameService = new GameService(guessNumberGame);
        String result = gameService.guess("1 2 3 4");
        Assert.assertNotNull(result);
    }

    @Test
    public void should_return_result_when_guess_number(){
        GuessNumberGame guessNumberGame = Mockito.mock(GuessNumberGame.class);
        GameService gameService = new GameService(guessNumberGame);
        gameService.guess("1 2 3 4");
        Mockito.verify(guessNumberGame,Mockito.times(1)).guess(Mockito.eq("1 2 3 4"));
    }
}
