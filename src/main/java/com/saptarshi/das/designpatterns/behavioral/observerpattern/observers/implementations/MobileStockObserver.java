package com.saptarshi.das.designpatterns.behavioral.observerpattern.observers.implementations;

import com.saptarshi.das.designpatterns.behavioral.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.behavioral.observerpattern.observers.StockObserver;

public class MobileStockObserver implements StockObserver {
	private final String name;
	private final StockObservable stockObservable;

	public MobileStockObserver(final StockObservable stockObservable, final String name) {
		this.name = name;
		this.stockObservable = stockObservable;
	}
	@Override
	public void update() {
		System.out.println("Stock Available: " + stockObservable.getStock() +". Checking product. Observer: " + name);
	}

	@Override
	public void unregister() {
		System.out.println(name +  " unregistered.");
		stockObservable.remove(this);
	}
}
