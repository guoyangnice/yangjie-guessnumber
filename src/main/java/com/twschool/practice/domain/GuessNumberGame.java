package com.twschool.practice.domain;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    public static final String CORRECT_RESULT = "4A0B";
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUED;
    private int leftTryTimes = MAX_TRY_TIMES;
    private GameScore gameScore = new GameScore();

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.gameAnswer = answerGenerator.generateAnswer();
    }

    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    private void modifyStatus(String result) {
        if (CORRECT_RESULT.equals(result)) {
            gameStatus = GameStatus.SUCCEED;
            gameScore.winTimesAdd();
            gameScore.winOnceTimes();
            if(gameScore.getWinTimes() % 3 == 0){
                gameScore.winThirdTimes();
            }
            if(gameScore.getWinTimes() % 5 == 0){
                gameScore.winFiveTimes();
            }
        } else if (leftTryTimes == 0) {
            gameStatus = GameStatus.FAILED;
            gameScore.setWinTimes(0);
            gameScore.failedOnce();
        }
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }

}
