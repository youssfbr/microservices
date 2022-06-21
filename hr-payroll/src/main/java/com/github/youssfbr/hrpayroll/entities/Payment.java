package com.github.youssfbr.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double daylyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = daylyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDaylyIncome() {
        return dailyIncome;
    }

    public void setDaylyIncome(Double daylyIncome) {
        this.dailyIncome = daylyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }

}
