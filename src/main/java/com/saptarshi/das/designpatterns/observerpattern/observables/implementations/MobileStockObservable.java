package com.saptarshi.das.designpatterns.observerpattern.observables.implementations;

import java.util.ArrayList;
import java.util.List;

import com.saptarshi.das.designpatterns.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.observerpattern.observers.StockObserver;

public class MobileStockObservable implements StockObservable {
	private int stock; 
	private List<StockObserver> observers;
	
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
			observer.update(this);
		}
	}

	@Override
	public int getStock() {
		return stock;
	}

	@Override
	public void addStock(int stock) {
		final int oldStock = this.stock;
		this.stock += stock;
		
		if (oldStock == 0) {
			notifyObservers();
		}
	}
}
