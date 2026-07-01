package com.projectHorror;
public class Demon extends Creature{
    private String power;
    private boolean canPossess;

    protected Demon(String name, int age, int danger, boolean active, String power, boolean canPossess){
        super(name, age, danger, active);
        this.power = power;
        this.canPossess = canPossess;
    }

    @Override
    public void attack() { 
        notifyObserver("Demon " + getName() + " attacked with " + power + "!"); 
    }
    
    @Override
    public String describe() {
        return "Demon " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its power is " + getPower() + " and it " + canPossessStatus() + ".";
    }

    public String getPower(){
        return power;
    }
    public boolean isCanPossess(){
        return canPossess;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public void setCanPossess(boolean canPossess) {
        this.canPossess = canPossess;
    }

    public String canPossessStatus(){
        if(canPossess){
            return "can possess";
        }
        else{
            return "can't possess";
        }
    }
}
