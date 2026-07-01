package com.projectHorror;

public class Alert implements Observer {
    
    @Override
    public void event(String e){
        System.out.println("ALERTA: " + e);
    }
}
