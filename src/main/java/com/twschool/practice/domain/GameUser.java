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
     * 分数
     */
    private int score;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 游戏状态
     */
    private String status;
    /**
     * 存储用户id
     */
    private List<String> ids = new ArrayList<>();

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
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

    public void init(){
        score = 0;
    }

    public boolean findId(String id){
        if(!ids.contains(id)){
            ids.add(new GameUser().getId());
            return false;
        }
        return true;
    }

    public void addId(String id){
        ids.add(id);
    }
}
