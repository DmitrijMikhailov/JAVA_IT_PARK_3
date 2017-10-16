package com.company;

import java.time.LocalTime;

/**
 * Created by Дмитрий on 12.10.2017.
 */
public class TvShows
{
    private String name;
    private int beginTime;
    private int endTime;

    public TvShows(String name, int beginTime, int endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
