package com.projectHorror;

public class ZombieFactory implements CreatureFactory<Zombie>{

    @Override
    public Zombie createCreature(String name, int age, int danger, boolean active, String behavior, boolean canSpread) {
        return new Zombie(name, age, danger, active, behavior, canSpread);
    }

}
