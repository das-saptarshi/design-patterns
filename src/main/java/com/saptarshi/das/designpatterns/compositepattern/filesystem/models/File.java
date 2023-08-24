package com.saptarshi.das.designpatterns.compositepattern.filesystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class File implements FileSystem {
    private String name;

    @Override
    public void ls() {
        System.out.println("File: " + name);
    }
}
