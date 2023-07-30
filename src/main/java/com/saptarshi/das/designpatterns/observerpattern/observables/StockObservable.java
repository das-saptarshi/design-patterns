package com.saptarshi.das.designpatterns.observerpattern.observables;

import com.saptarshi.das.designpatterns.observerpattern.observers.StockObserver;

public interface StockObservable {
	void add(StockObserver observer);
	void remove(StockObserver observer);
	void notifyObservers();
	int getStock();
	void addStock(int stock);
	void resetStock();
}
