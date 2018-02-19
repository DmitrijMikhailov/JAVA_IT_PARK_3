package com.company;

public abstract class AbstractTextViewerTask implements TextViewerTask {
    protected String text;

    @Override
    public void run(String text) {
        this.text = text;
    }
}
