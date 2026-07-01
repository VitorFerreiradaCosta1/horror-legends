package com.projectHorror;

public class VampireFactory implements CreatureFactory<Vampire>{

    @Override
    public Vampire createCreature(String name, int age, int danger, boolean active, String animalForm, boolean hungry) {
        return new Vampire(name, age, danger, active, animalForm, hungry);
    }

}