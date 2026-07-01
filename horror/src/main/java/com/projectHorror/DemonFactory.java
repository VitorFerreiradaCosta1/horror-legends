package com.projectHorror;

public class DemonFactory implements CreatureFactory<Demon>{

    @Override
    public Demon createCreature(String name, int age, int danger, boolean active, String power, boolean canPossess) {
        return new Demon(name, age, danger, active, power, canPossess);
    }

}
