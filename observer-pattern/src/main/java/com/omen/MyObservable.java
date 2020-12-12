package com.omen;

import java.util.Observable;

public class MyObservable extends Observable {

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
