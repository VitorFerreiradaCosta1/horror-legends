package com.projectHorror;

public class Werewolf extends Creature{
    private String causeTransformation;
    private boolean immortal;

    protected Werewolf(String name, int age, int danger, boolean active, String causeTransformation, boolean immortal){
        super(name, age, danger, active);
        this.causeTransformation = causeTransformation;
        this.immortal = immortal;
    }

    @Override
    public void attack() { 
        notifyObserver("Werewolf " + getName() + " was transformed by " + getCauseTransformation() + " and attacked a victim!");
    }

    @Override
    public String describe() {
        return "Werewolf " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its cause of transformation is " + getCauseTransformation() + " and it " + immortalStatus() + ".";
    }

    public String getCauseTransformation(){
        return causeTransformation;
    }
    public boolean isImmortal(){
        return immortal;
    }
    public void setCauseTransformation(String causeTransformation) {
        this.causeTransformation = causeTransformation;
    }
    public void setImmortal(boolean immortal) {
        this.immortal = immortal;
    }

    public String immortalStatus(){
        if(immortal){
            return "is immortal";
        }
        else{
            return "isn't immortal";
        }
    }
}