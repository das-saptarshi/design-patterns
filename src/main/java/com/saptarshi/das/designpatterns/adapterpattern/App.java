package com.saptarshi.das.designpatterns.adapterpattern;

import com.saptarshi.das.designpatterns.adapterpattern.adaptee.Service;
import com.saptarshi.das.designpatterns.adapterpattern.adaptee.ServiceInterface;
import com.saptarshi.das.designpatterns.adapterpattern.adapter.Adapter;
import com.saptarshi.das.designpatterns.adapterpattern.client.Client;
import com.saptarshi.das.designpatterns.adapterpattern.client.ClientInterface;

public class App {
    public static void main(String[] args) {
        final ServiceInterface service = new Service();
        final ClientInterface adapter = new Adapter(service);
        final Client client = new Client(adapter);

        client.displayTemperature();
    }
}
