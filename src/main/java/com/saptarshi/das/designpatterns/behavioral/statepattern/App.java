package com.saptarshi.das.designpatterns.behavioral.statepattern;

import com.saptarshi.das.designpatterns.behavioral.statepattern.models.Television;

public class App {
    public static void main(String[] args) {
        final Television television = new Television(0, 100);
        television.decreaseVolume();
        television.increaseVolume();

        television.onOff();

        television.increaseVolume();
        television.increaseVolume();
        television.previousChannel();
        television.nextChannel();
        television.nextChannel();
        television.decreaseVolume();

        television.onOff();
    }
}
