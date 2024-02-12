package com.saptarshi.das.designpatterns.behavioral.observerpattern.observables.implementations;

import java.util.ArrayList;
import java.util.List;

import com.saptarshi.das.designpatterns.behavioral.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.behavioral.observerpattern.observers.StockObserver;

public class MobileStockObservable implements StockObservable {
	private int stock; 
	private final List<StockObserver> observers;
	
	public MobileStockObservable() {
		stock = 0;
		observers = new ArrayList<>();
	}

	@Override
	public void add(StockObserver observer) {
		observers.add(observer);
	}

	@Override
	public void remove(StockObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (StockObserver observer : observers) {
			observer.update();
		}
	}

	@Override
	public int getStock() {
		return stock;
	}

	@Override
	public void addStock(int stock) {
		this.stock += stock;
		if (this.stock > 0 && this.stock == stock) {
			notifyObservers();
		}
	}

	@Override
	public void resetStock() {
		this.stock = 0;
	}
}
