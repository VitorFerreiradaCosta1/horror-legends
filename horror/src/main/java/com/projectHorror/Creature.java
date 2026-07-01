package com.projectHorror;

public abstract class Creature extends Identifier{
    private String name;
    private int age;
    private int danger; //0 to 10
    private boolean active;
  

    public Creature(String name, int age, int danger, boolean active) {
        this.name = name;
        this.age = age;
        this.danger = danger;
        this.active = active;
    }

    public abstract void attack();
    public abstract String describe();
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getDanger(){
        return danger;
    }
    public boolean getActive(){
        return active;
    }

    public String activeStatus() {
        if (active) {
            return "is active";
        } else {
            return "isn't active";
        }
    }

}
