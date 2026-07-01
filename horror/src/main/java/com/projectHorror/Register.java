package com.projectHorror;

import java.util.ArrayList;
import java.util.List;

public class Register implements Observer { 
    private List<String> history = new ArrayList<String>();

    @Override
    public void event(String e){
        history.add(e);
        System.out.println("'" + e + "'" + " Registered.");
    }

    public List<String> getHistory(){
        return history;
    }

}
