package com.saptarshi.das.designpatterns.observerpattern.observers;

import com.saptarshi.das.designpatterns.observerpattern.observables.StockObservable;

public interface StockObserver {
	void update(StockObservable observable);
}
