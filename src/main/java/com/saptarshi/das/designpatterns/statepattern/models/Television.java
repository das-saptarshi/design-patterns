package com.saptarshi.das.designpatterns.statepattern.models;

public class Television {
    private final Context context;
    public Television(final int minChannel, final int maxChannel) {
        this.context = new Context(minChannel, maxChannel);
    }

    public void onOff() {
        context.getState().pressOnOffButton(context);
    }

    public void increaseVolume() {
        context.getState().increaseVolume(context);
    }

    public void decreaseVolume() {
        context.getState().decreaseVolume(context);
    }

    public void nextChannel() {
        context.getState().changeToNextChannel(context);
    }

    public void previousChannel() {
        context.getState().changeToPreviousChannel(context);
    }
}
