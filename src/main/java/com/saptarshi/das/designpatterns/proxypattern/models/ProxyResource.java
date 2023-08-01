package com.saptarshi.das.designpatterns.proxypattern.models;

public class ProxyResource implements Resource {
    private Resource resource;
    @Override
    public void process() {
        if (resource == null) {
            resource = new ResourceImpl();
        }
        resource.process();
    }
}
