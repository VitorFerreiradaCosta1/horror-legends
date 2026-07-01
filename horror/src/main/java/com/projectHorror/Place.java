package com.projectHorror;

public class Place {
    private String name;
    private String city;
    private String country;
    private int danger; //0 to 10

    public Place(String name, String city, String country, int danger){
        this.name = name;
        this.city = city;
        this.country = country;
        this.danger = danger;
    }
    public String describe() {
        return "Place " + getName() + " located in " + getCity() + ", " + getCountry() + " with danger " + getDanger() + "/10.";
    }

    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String getCountry(){
        return country;
    }
    public int getDanger(){
        return danger;
    }
    public void setDanger(int danger) {
        this.danger = danger;
    }
    
}
