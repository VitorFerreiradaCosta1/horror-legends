package com.projectHorror;

public class Witch extends Creature{
    private String spell;
    private boolean canFly;

    protected Witch(String name, int age, int danger, boolean active, String spell, boolean canFly){
        super(name, age, danger, active);
        this.spell = spell;
        this.canFly = canFly;
    }

    @Override
    public void attack() { 
        notifyObserver("Witch " + getName() + " cast the spell " + getSpell() + " on a victim!");
    }

    @Override
    public String describe() {
        return "Witch " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its spell is " + getSpell() + " and it " + canFlyStatus() + ".";
    }

    public String getSpell(){
        return spell;
    }
    public boolean isCanFly(){
        return canFly;
    }
    public void setSpell(String spell) {
        this.spell = spell;
    }
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    public String canFlyStatus(){
        if(canFly){
            return "can fly";
        }
        else{
            return "can't fly";
        }
    }
}