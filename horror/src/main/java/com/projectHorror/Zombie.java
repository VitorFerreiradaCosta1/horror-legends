package com.projectHorror;

public class Zombie extends Creature{
    private String behavior;
    private boolean canSpread;

    protected Zombie(String name, int age, int danger, boolean active, String behavior, boolean canSpread){
        super(name, age, danger, active);
        this.behavior = behavior;
        this.canSpread = canSpread;
    }

    @Override
    public void attack() { 
        notifyObserver("Zombie " + getName() + " attacked a victim with its " + getBehavior() + " behavior!");
    }

    @Override
    public String describe() {
        return "Zombie " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its behavior is " + getBehavior() + " and it " + canSpreadStatus() + ".";
    }

    public String getBehavior(){
        return behavior;
    }
    public boolean isCanSpread(){
        return canSpread;
    }
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
    public void setCanSpread(boolean canSpread) {
        this.canSpread = canSpread;
    }

    public String canSpreadStatus(){
        if(canSpread){
            return "can spread";
        }
        else{
            return "can't spread";
        }
    }
}