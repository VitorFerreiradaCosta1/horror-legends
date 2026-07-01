package com.projectHorror;

public interface CreatureFactory <T extends Creature> {
    public T createCreature(String name, int age, int danger, boolean active, String power, boolean canPossess);

}
