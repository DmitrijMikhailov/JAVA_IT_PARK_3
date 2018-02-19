package com.company;

public class TextViewer {
    private Thread tasks[] = new Thread[10];
    private int count = 0;
    private String text;
    public void setText(String text){
        this.text = text;
    }
    public void addTask(Thread task){
        tasks[count] = task;
        count++;
    }
    public void process(){
        for (int i = 0; i < tasks.length; i++){
           tasks[i].start();
        }
    }
}
