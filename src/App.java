public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         * 
         * 
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         * 
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         * 
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         * 
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         * 
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */
        Wizard Merlin = new Wizard("Merlin");
        Warlock Saruman = new Warlock("Saruman");

        //Display the Character Names
        Merlin.displayName();
        Saruman.displayName();
        System.out.println("\n");

        Merlin.pyrogram(Saruman);
        System.out.println("\n");
        Saruman.soulLeech(Merlin);
        System.out.println("\n");

        //Merlin used Recovery Spell
        Merlin.goldenApple();
        System.out.println("\n");
        Saruman.soulLeech(Merlin);
        System.out.println("\n");
        Merlin.gush(Saruman);
        System.out.println("\n");
        Saruman.felDomination(Merlin);
        System.out.println("\n");
        Merlin.gush(Saruman);
        System.out.println("\n");
    }
}
