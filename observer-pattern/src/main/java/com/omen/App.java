package com.omen;

import java.util.Observable;
import java.util.Observer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyObservable observable = new MyObservable();
        Observer observer = new Teacher();
        observable.addObserver(observer);
        observable.setChanged();
        System.out.println(observable.hasChanged());
        observable.notifyObservers("hello");
        observable.clearChanged();
        System.out.println(observable.hasChanged());
    }
}
