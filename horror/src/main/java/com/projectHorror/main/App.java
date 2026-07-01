package com.projectHorror.main;

import com.projectHorror.*;

public class App {
    public static void main(String[] args) {
        System.out.println("---------------------- Horror Legends ---------------------- \n");

        System.out.println("--- Places ---");
        Place p1 = new Place("Vila do Chaves", "Mexico city", "Mexico", 2);
        Place p2 = new Place("Round Top Road", "Harrisvile", "USA", 9);
        Place p3 = new Place("Praconha", "Itajuba", "Brazil", 7);
        System.out.println(p1.describe());
        System.out.println(p2.describe());
        System.out.println(p3.describe() + "\n");

        System.out.println("--- Victims ---");
        Victim vct1 = new Victim("Florinda", 22, "restaurant manager", true, p1);
        Victim vct2 = new Victim("Ed Warren", 44, "ghost hunter", true, p2);
        Victim vct3 = new Victim("Joaozinho", 19, "engineer student", true, p3);
        System.out.println(vct1.describe());
        System.out.println(vct2.describe());
        System.out.println(vct3.describe() + "\n");

        System.out.println("--- Creatures Factories ---");
        DemonFactory df = new DemonFactory();
        GhostFactory gf = new GhostFactory();
        VampireFactory vf = new VampireFactory();
        WerewolfFactory wwf = new WerewolfFactory();
        WitchFactory wf = new WitchFactory();
        ZombieFactory zf = new ZombieFactory();
        System.out.println(df.getClass().getSimpleName() + " was created.");
        System.out.println(gf.getClass().getSimpleName() + " was created.");
        System.out.println(vf.getClass().getSimpleName() + " was created.");
        System.out.println(wwf.getClass().getSimpleName() + " was created.");
        System.out.println(wf.getClass().getSimpleName() + " was created.");
        System.out.println(zf.getClass().getSimpleName() + " was created. \n");

        System.out.println("--- Creatures ---");
        Demon d = df.createCreature("Azazel", 1000000, 10, false, "fire manipulation", true);
        Ghost g = gf.createCreature("Gasparzinho", 12, 1, true, "pneumonia", true);
        Vampire v = vf.createCreature("Dracula", 459, 8, false, "bat", false);
        Werewolf ww = wwf.createCreature("Claudio", 47, 7, true, "full moon", false);
        Witch w = wf.createCreature("do 71", 71, 3, true, "insults", false);
        Zombie z = zf.createCreature("dos Palmares", 40, 5, false, "leadership", true);
        System.out.println(d.describe());
        System.out.println(g.describe());
        System.out.println(v.describe());
        System.out.println(ww.describe());
        System.out.println(w.describe());
        System.out.println(z.describe() + "\n");

        System.out.println("--- Observer ---");
        Alert a = new Alert();
        Register r = new Register();
        System.out.println(a.getClass().getSimpleName() + " was created.");
        System.out.println(r.getClass().getSimpleName() + " was created. \n");

        w.getObservers().add(a);
        w.getObservers().add(vct1);

        g.getObservers().add(a);
        g.getObservers().add(vct2);
        g.getObservers().add(r);

        ww.getObservers().add(a);
        ww.getObservers().add(vct3);
        ww.getObservers().add(r);

        System.out.println("---------------------- Horror Story ---------------------- \n");

        System.out.println("The Night falls...");
        w.attack();
        System.out.println();
        g.attack();
        System.out.println();
        ww.attack();
        System.out.println("The Night ends... \n");

        System.out.println("--- Registers --- \n");
        
        System.out.println(r.getHistory() + "\n");
    }
}