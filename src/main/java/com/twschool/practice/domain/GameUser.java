package com.twschool.practice.domain;

import java.util.ArrayList;
import java.util.List;

public class GameUser {
    /**
     * 用户唯一id
     */
    private String id;
    /**
     * 输入数字
     */
    private String inputNumber;
    /**
     * 答案
     */
    private String abAnswer;
    /**
     * 连赢次数
     */
    private int gameWinStep;
    /**
     * 分数
     */
    private int score;
    /**
     * 存储id
     */
    private List<String> ids = new ArrayList<>();

    public int getGameWinStep() {
        return gameWinStep;
    }

    public void setGameWinStep(int gameWinStep) {
        this.gameWinStep = gameWinStep;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInputNumber() {
        return inputNumber;
    }

    public void setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
    }

    public String getAbAnswer() {
        return abAnswer;
    }

    public void setAbAnswer(String abAnswer) {
        this.abAnswer = abAnswer;
    }

    public void init(GameUser user){
        user.setScore(0);
        user.setGameWinStep(0);
    }

    public boolean findId(GameUser gameUser){
        if(!ids.contains(gameUser.getId())){
            ids.add(gameUser.getId());
            return false;
        }
        return true;
    }
}
