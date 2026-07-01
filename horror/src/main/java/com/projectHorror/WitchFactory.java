package com.projectHorror;

public class WitchFactory implements CreatureFactory<Witch>{

    @Override
    public Witch createCreature(String name, int age, int danger, boolean active, String spell, boolean canFly) {
        return new Witch(name, age, danger, active, spell, canFly);
    }

}