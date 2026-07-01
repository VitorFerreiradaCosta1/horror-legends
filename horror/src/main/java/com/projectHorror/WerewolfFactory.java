package com.projectHorror;

public class WerewolfFactory implements CreatureFactory<Werewolf>{

    @Override
    public Werewolf createCreature(String name, int age, int danger, boolean active, String causeTransformation, boolean immortal) {
        return new Werewolf(name, age, danger, active, causeTransformation, immortal);
    }

}