package com.projectHorror;

public class GhostFactory implements CreatureFactory<Ghost>{

    @Override
    public Ghost createCreature(String name, int age, int danger, boolean active,  String causeDeath, boolean canThroughWall) {
        return new Ghost(name, age, danger, active, causeDeath, canThroughWall);
    }

}