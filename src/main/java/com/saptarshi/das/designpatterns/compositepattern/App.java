package com.saptarshi.das.designpatterns.compositepattern;

import com.saptarshi.das.designpatterns.compositepattern.filesystem.models.Directory;
import com.saptarshi.das.designpatterns.compositepattern.filesystem.models.File;
import com.saptarshi.das.designpatterns.compositepattern.filesystem.models.FileSystem;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        fileSystemExample();
    }

    private static void fileSystemExample() {
        final FileSystem golmaal = new File("Golmaal.mp4");
        final FileSystem comedyMovies = new Directory("Comedy Movies", Stream.of(golmaal).collect(Collectors.toList()));


        final FileSystem interstellar = new File("Interstellar.mp4");
        final FileSystem movies = new Directory("Movies", Stream.of(interstellar, comedyMovies).collect(Collectors.toList()));

        movies.ls();
    }
}
