package com.saptarshi.das.designpatterns.behavioral.statepattern.states;

import com.saptarshi.das.designpatterns.behavioral.statepattern.models.Context;

public interface State {
    void pressOnOffButton(Context context);
    void increaseVolume(Context context);
    void decreaseVolume(Context context);
    void changeToPreviousChannel(Context context);
    void changeToNextChannel(Context context);
}
