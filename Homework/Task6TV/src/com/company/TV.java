package com.company;

/**
 * Created by Дмитрий on 12.10.2017.
 */
public class TV {
    private ChannelList channelList [];
    private static TV instance;
    private TV(){
    }
    public static TV getInstance(){ //singleton
        if (instance == null){
            instance = new TV();
        }
        return instance;
    }
    void showChannelList(ChannelList [] channelList){
        for (int i = 0; i < channelList.length; i++)
            System.out.println(channelList[i].getChannelName());
    }
    void findChannelList(ChannelList [] channelList, int channel){
            if (channel > channelList.length){
                System.err.println("Ошибка! Такого канала нет!");
            }else channelList[channel].findTvShows(channelList[channel].getTvShows());
    }
}
