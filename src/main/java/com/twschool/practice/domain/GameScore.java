package com.twschool.practice.domain;

public class GameScore {
    /**
     * 分数
     */
    private int score;
    private int winTimes;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWinTimes() {
        return winTimes;
    }

    public void setWinTimes(int winTimes) {
        this.winTimes = winTimes;
    }

    public int winOnceTimes(){
        score += 3;
        return score;
    }

    public int winThirdTimes(){
        score += 2;
        return score;
    }

    public int winFiveTimes(){
        score += 3;
        return score;
    }
    public int failedOnce(){
        score -= 3;
        return score;
    }
    public void winTimesAdd(){
        winTimes++;
    }
}
