package service;

import lombok.*;


public class Worker {

    private String FIO;

    private int days;

    private int amountTable;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getAmountTable() {
        return amountTable;
    }

    public void setAmountTable(int amountTable) {
        this.amountTable = amountTable;
    }

    public Worker(String FIO, int days, int amountTable) {
        this.FIO = FIO;
        this.days = days;
        this.amountTable = amountTable;
    }
}
