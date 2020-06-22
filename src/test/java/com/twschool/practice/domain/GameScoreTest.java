package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
        @Test
        public void should_return_3_given_0_when_addThreeRate() {
            //given
            GameScore gameScore = new GameScore();
            //when
            gameScore.failedOnce();
            int score = GameScore.score;
            //then
            Assert.assertEquals(-3,score);
        }
}
