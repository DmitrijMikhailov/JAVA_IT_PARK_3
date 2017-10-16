package com.company;

import java.util.Scanner;

/**
 * Created by Дмитрий on 12.10.2017.
 */
public class RemoteController {
    TV tv = TV.getInstance();
    void remoteController(int x) {
        Scanner scanner = new Scanner(System.in);
        ChannelList channelList[] =new ChannelList[2];
        TvShows one [] = new TvShows[2];
        TvShows two [] = new TvShows[2];
        TvShows footboll = new TvShows("Рубин против Спартак", 8,14);
        TvShows bascetboll = new TvShows("Рубин против Спартак", 15,23);
        one[0] = footboll;
        one[1] = bascetboll;
        TvShows time = new TvShows("Время", 8, 14);
        TvShows news = new TvShows("Новостти", 15, 23);
        channelList[0] = new ChannelList(one,"Первый");
        channelList[1] = new ChannelList(two,"Второй");
        tv.findChannelList(channelList,1);
        switch (x){
            case 1: { tv.showChannelList(channelList);}
            case 2: {int channel = scanner.nextInt();
            tv.findChannelList(channelList,channel);}
            case 3: { System.exit(0);}
        }
    }

}
