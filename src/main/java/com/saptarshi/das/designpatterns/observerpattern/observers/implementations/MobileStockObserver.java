package com.saptarshi.das.designpatterns.observerpattern.observers.implementations;

import com.saptarshi.das.designpatterns.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.observerpattern.observers.StockObserver;

public class MobileStockObserver implements StockObserver {

	@Override
	public void update(final StockObservable observable) {
		System.out.println("Stock available. Buying product.");
	}
}
