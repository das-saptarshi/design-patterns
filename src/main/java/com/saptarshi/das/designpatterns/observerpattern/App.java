package com.saptarshi.das.designpatterns.observerpattern;

import com.saptarshi.das.designpatterns.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.observerpattern.observables.implementations.MobileStockObservable;
import com.saptarshi.das.designpatterns.observerpattern.observers.StockObserver;
import com.saptarshi.das.designpatterns.observerpattern.observers.implementations.MobileStockObserver;

public class App {
	public static void main(String[] args) {
		final StockObserver observer1 = new MobileStockObserver(); 
		final StockObserver observer2 = new MobileStockObserver(); 
		final StockObserver observer3 = new MobileStockObserver(); 
		
		final StockObservable subject = new MobileStockObservable();
		
		subject.add(observer1);
		subject.add(observer2);
		subject.add(observer3);
		
		subject.addStock(6);
	}
}
