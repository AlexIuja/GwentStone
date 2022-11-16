package Classes;

import Classes.Cards.Card;
import Classes.Cards.Heroes.EmpressThorina;
import Classes.Cards.Heroes.GeneralKocioraw;
import Classes.Cards.Heroes.KingMudface;
import Classes.Cards.Heroes.LordRoyce;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Card testCard = null;
        final String MinionString = "Disciple Miraj The Cursed One The Ripper Berserker Goliath Sentinel Warden";
        final String EnvironmentString = "Firestorm HeartHound Winterfell";
        final String HeroesString = "Empress Thorina General Kocioraw King Mudface Lord Royce";

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if(MinionString.contains(name)) {
            int mana = input.nextInt();
            int attackDamage = input.nextInt();
            int health = input.nextInt();
            input.nextLine();
            String description = input.nextLine();
            String col = input.nextLine();
            String[] colours = col.split(" ");

//            switch (name) {
//                case "Berserker":
//                    testCard = new Berserker(mana, health, attackDamage, description, colours, name);
//                    break;
//                case "Goliath":
//                    testCard = new Goliath(mana,  health, attackDamage, description, colours, name);
//                    break;
//                case "Sentinel":
//                    testCard = new Sentinel(mana, health, attackDamage, description, colours, name);
//                    break;
//                case "Warden":
//                    testCard = new Warden(mana, health, attackDamage, description, colours, name);
//                    break;
//                case "Disciple":
//                    testCard = new Disciple(mana, health, description, colours, name);
//                    break;
//                case "Miraj":
//                    testCard = new Miraj(mana, health, attackDamage, description, colours, name);
//                    break;
//                case "The Cursed One":
//                    testCard = new TheCursedOne(mana, health, description, colours, name);
//                    break;
//                case "The Ripper":
//                    testCard = new TheRipper(mana, health, attackDamage, description, colours, name);
//                    break;
//            }
        }
//        if(EnvironmentString.contains(name)) {
//            int mana = input.nextInt();
//            input.nextLine();
//            String description = input.nextLine();
//            String col = input.nextLine();
//            String[] colours = col.split(" ");
//            switch (name) {
//                case "Firestorm":
//                    testCard = new Firestorm(name, mana, description, colours);
//                    break;
//                case "HeartHound":
//                    testCard = new HeartHound(name, mana, description, colours);
//                    break;
//                case "Winterfell":
//                    testCard = new Winterfell(name, mana, description, colours);
//                    break;
//            }
//        }
        if(HeroesString.contains(name)) {
            int mana = input.nextInt();
            input.nextLine();
            String description = input.nextLine();
            String col = input.nextLine();
            String[] colours = col.split(" ");
            switch(name) {
                case "Empress Thorina":
                    testCard = new EmpressThorina(mana, description, colours);
                    break;
                case "General Kocioraw":
                    testCard = new GeneralKocioraw(mana, description, colours);
                    break;
                case "King Mudface":
                    testCard = new KingMudface(mana, description, colours);
                    break;
                case "Lord Royce":
                    testCard = new LordRoyce(mana, description, colours);
                    break;
            }
        }
        System.out.println(testCard);




    }
}
