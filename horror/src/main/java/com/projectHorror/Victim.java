package com.projectHorror;

public class Victim implements Observer{
    private String name;
    private int age;
    private String profession;
    private boolean survived;
    private Place place;

    public Victim(String name, int age, String profession, boolean survived, Place place){
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.place = place;
        this.survived = survived;
    }

    public String describe() {
        return "Victim " + getName() + " is " + getAge() + " years old, works as " + getProfession() + " in " + getPlace().getName() + " and is " + getSurvived() + ".";
    }

    @Override
    public void event(String e) {
        this.survived = false;
        System.out.println(getName() + " was attacked, and is " + getSurvived() + ".");
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getProfession(){
        return profession;
    }
    public Place getPlace() {
        return place;
    }
    public void setPlace(Place place) {
        this.place = place;
    }

    public String getSurvived(){
        if(survived){
            return "Alive";
        }
        else{
            return "Dead";
        }
    }

}
