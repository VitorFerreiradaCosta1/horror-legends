package com.projectHorror;

import java.util.ArrayList;
import java.util.List;

public abstract class Identifier {
    private List<Observer> observers = new ArrayList<Observer>();

    protected void notifyObserver(String e){
        for(Observer o : observers){
            o.event(e);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }
    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

}
