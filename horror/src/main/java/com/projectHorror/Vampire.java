package com.projectHorror;

public class Vampire extends Creature{
    private String animalForm;
    private boolean hungry;

    protected Vampire(String name, int age, int danger, boolean active, String animalForm, boolean hungry){
        super(name, age, danger, active);
        this.animalForm = animalForm;
        this.hungry = hungry;
    }

    @Override
    public void attack() { 
        notifyObserver("Vampire " + getName() + " attacked a victim in the form of " + getAnimalForm()); 
    }
    
    @Override
    public String describe() {
        return "Vampire " + getName() + " is " + getAge() + " years old, with danger " + getDanger() + "/10 and " + activeStatus() + 
        ", its animal form is " + getAnimalForm() + " and it " + hungryStatus() + ".";
    }

    public String getAnimalForm(){
        return animalForm;
    }
    public boolean isHungry(){
        return hungry;
    }
    public void setAnimalForm(String animalForm) {
        this.animalForm = animalForm;
    }
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String hungryStatus(){
        if(hungry){
            return "is hungry";
        }
        else{
            return "isn't hungry";
        }
    }
}

