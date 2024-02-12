package com.saptarshi.das.designpatterns.behavioral.statepattern.states;

import com.saptarshi.das.designpatterns.behavioral.statepattern.models.Context;

public class OffState implements State {
    @Override
    public void pressOnOffButton(final Context context) {
        System.out.println("Starting television...");
        context.setState(new OnState());
    }

    @Override
    public void increaseVolume(final Context context) {

    }

    @Override
    public void decreaseVolume(final Context context) {

    }

    @Override
    public void changeToPreviousChannel(final Context context) {

    }

    @Override
    public void changeToNextChannel(final Context context) {

    }
}
