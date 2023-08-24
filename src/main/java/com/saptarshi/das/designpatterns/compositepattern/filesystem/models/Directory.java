package com.saptarshi.das.designpatterns.compositepattern.filesystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class Directory implements FileSystem {
    private String name;
    private List<FileSystem> files;

    @Override
    public void ls() {
        System.out.println("Directory: " + name);

        for (FileSystem file : files) {
            file.ls();
        }
    }
}
