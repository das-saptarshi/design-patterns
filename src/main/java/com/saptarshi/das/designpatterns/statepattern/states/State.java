package com.saptarshi.das.designpatterns.statepattern.states;

import com.saptarshi.das.designpatterns.statepattern.models.Context;
import com.saptarshi.das.designpatterns.statepattern.models.Television;

public interface State {
    void pressOnOffButton(Context context);
    void increaseVolume(Context context);
    void decreaseVolume(Context context);
    void changeToPreviousChannel(Context context);
    void changeToNextChannel(Context context);
}
