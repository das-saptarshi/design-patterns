package com.saptarshi.das.designpatterns.proxypattern;

import com.saptarshi.das.designpatterns.proxypattern.models.ProxyResource;
import com.saptarshi.das.designpatterns.proxypattern.models.Resource;

public class App {
    public static void main(String[] args) {
        final Resource resource = new ProxyResource();
        resource.process();
        resource.process();
    }
}
