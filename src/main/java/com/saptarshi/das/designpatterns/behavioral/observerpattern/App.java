package com.saptarshi.das.designpatterns.behavioral.observerpattern;

import com.saptarshi.das.designpatterns.behavioral.observerpattern.observables.implementations.MobileStockObservable;
import com.saptarshi.das.designpatterns.behavioral.observerpattern.observables.StockObservable;
import com.saptarshi.das.designpatterns.behavioral.observerpattern.observers.StockObserver;
import com.saptarshi.das.designpatterns.behavioral.observerpattern.observers.implementations.MobileStockObserver;

public class App {
	public static void main(String[] args) {
		final StockObservable subject = new MobileStockObservable();

		final StockObserver observer1 = new MobileStockObserver(subject, "Customer 1");
		final StockObserver observer2 = new MobileStockObserver(subject, "Customer 2");
		final StockObserver observer3 = new MobileStockObserver(subject, "Customer 3");

		subject.add(observer1);
		subject.add(observer2);
		subject.add(observer3);
		subject.addStock(6);
		observer1.unregister();
		subject.resetStock();
		subject.addStock(6);
	}
}
