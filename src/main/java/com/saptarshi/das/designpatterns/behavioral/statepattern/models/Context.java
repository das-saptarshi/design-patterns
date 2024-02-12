package com.saptarshi.das.designpatterns.behavioral.statepattern.models;

import com.saptarshi.das.designpatterns.behavioral.statepattern.states.OffState;
import com.saptarshi.das.designpatterns.behavioral.statepattern.states.State;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Context {
    @Setter private State state;
    @Setter private int channel;
    @Setter private int volume;
    private final int minChannel;
    private final int maxChannel;

    public Context(final int minChannel, final int maxChannel) {
        this.minChannel = minChannel;
        this.maxChannel = maxChannel;
        this.channel = 0;
        this.volume = 10;
        this.state = new OffState();
    }
}
