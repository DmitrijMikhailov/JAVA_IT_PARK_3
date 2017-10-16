package com.company;


import java.time.LocalTime;

/**
 * Created by Дмитрий on 07.10.2017.
 */
public class ChannelList {
    private TvShows tvShows [];
    private String channelName;
    private LocalTime localTime = LocalTime.now();
    private int getTime = localTime.getHour();
    public ChannelList(TvShows[] tvShows, String channelName) {
        this.tvShows = tvShows;
        this.channelName = channelName;
    }
    void findTvShows(TvShows [] tvShows){
        for (int i = 0; i < tvShows.length; i++){
            if (tvShows[i].getBeginTime()<= getTime && tvShows[i].getEndTime() > getTime){
                System.out.println(tvShows[i].getName());
            }

        }
    }

    public TvShows[] getTvShows() {
        return tvShows;
    }

    public void setTvShows(TvShows[] tvShows) {
        this.tvShows = tvShows;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
