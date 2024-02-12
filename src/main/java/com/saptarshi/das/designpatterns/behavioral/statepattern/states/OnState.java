package com.saptarshi.das.designpatterns.behavioral.statepattern.states;

import com.saptarshi.das.designpatterns.behavioral.statepattern.models.Context;

public class OnState implements State {
    @Override
    public void pressOnOffButton(final Context context) {
        System.out.println("Shutting down television...");
        context.setState(new OffState());
    }

    @Override
    public void increaseVolume(final Context context) {
        context.setVolume(Math.min(100, context.getVolume() + 1));
        System.out.println("Volume increased: " + context.getVolume());
    }

    @Override
    public void decreaseVolume(final Context context) {
        context.setVolume(Math.max(0, context.getVolume() - 1));
        System.out.println("Volume decreased: " + context.getVolume());
    }

    @Override
    public void changeToPreviousChannel(final Context context) {
        final int previousChannel = context.getChannel() == context.getMinChannel() ?
                context.getMaxChannel() : context.getChannel() - 1;
        context.setChannel(previousChannel);
        System.out.println("Channel Changed to: " + context.getChannel());
    }

    @Override
    public void changeToNextChannel(final Context context) {
        final int nextChannel = context.getChannel() == context.getMaxChannel() ?
                context.getMinChannel() : context.getChannel() + 1;
        context.setChannel(nextChannel);
        System.out.println("Channel Changed to: " + context.getChannel());
    }
}
