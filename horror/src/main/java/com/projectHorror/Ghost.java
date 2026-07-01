package com.projectHorror;

public class Ghost extends Creature{
    private String causeDeath;
    private boolean canThroughWall;

    protected Ghost(String name, int age, int danger, boolean active, String causeDeath, boolean canThroughWall){
        super(name, age, danger, active);
        this.causeDeath = causeDeath;
        this.canThroughWall = canThroughWall;
    }

    @Override
    public void attack() { 
        notifyObserver("Ghost " + getName() + " attacked a victim!"); 
    }

    @Override
    public String describe() {
        return "Ghost " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its cause of death was " + getCauseDeath() + " and it " + canThroughWallStatus() + ".";
    }

    public String getCauseDeath(){
        return causeDeath;
    }
    public boolean isCanThroughWall(){
        return canThroughWall;
    }
    public void setCauseDeath(String causeDeath) {
        this.causeDeath = causeDeath;
    }
    public void setCanThroughWall(boolean canThroughWall) {
        this.canThroughWall = canThroughWall;
    }

    public String canThroughWallStatus(){
        if(canThroughWall){
            return "can pass through wall";
        }
        else{
            return "can't pass through wall";
        }
    }
}