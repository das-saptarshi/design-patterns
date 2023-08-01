package com.saptarshi.das.designpatterns.proxypattern.models;

public class ResourceImpl implements Resource {
    public ResourceImpl() {
        expensiveOperation();
    }
    @Override
    public void process() {
        System.out.println("Processing Request...");
    }

    private void expensiveOperation() {
        System.out.println("Performing expensive operation during initialization...");
    }
}
