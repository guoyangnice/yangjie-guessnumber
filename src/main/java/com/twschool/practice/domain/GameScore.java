package com.twschool.practice.domain;

public class GameScore {
    /**
     * 分数
     */
    public static int score;
    /**
     * 连赢次数
     */
    public static int winTimes;

    public int getWinTimes() {
        return winTimes;
    }

    public void setWinTimes(int winTimes) {
        this.winTimes = winTimes;
    }

    public void winOnceTimes(){
        score += 3;
    }

    public void winThirdTimes(){
        score += 2;
    }

    public void winFiveTimes(){
        score += 3;
    }
    public void failedOnce(){
        score -= 3;
    }
    public void winTimesAdd(){
        winTimes++;
    }
}
