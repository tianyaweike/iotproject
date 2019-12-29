package com.ruoyi.iot.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Board {

    private String board_id;

    private String control;
   // private Date gradtime;
    private String working;

    @Override
    public String toString() {
        return "Board{" +
                "board_id='" + board_id + '\'' +
                ", control='" + control + '\'' +
                ", working='" + working + '\'' +
                '}';
    }

    public Board(String board_id, String control, String working) {
        this.board_id = board_id;
        this.control = control;
        this.working = working;
    }

    public Board() {
        super();
    }

    public String getBoard_id() {
        return board_id;
    }

    public void setBoard_id(String board_id) {
        this.board_id = board_id;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }
}