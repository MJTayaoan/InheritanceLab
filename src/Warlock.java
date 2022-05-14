public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }

    //Create two attacking method
    public void soulLeech(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Soul Leech (Damage - 70)");
        int damagePoints = 70;
        int manaDeduct = 50;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    }
    public void felDomination(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Fel Domination (Damage - 45)");
        int damagePoints = 45;
        int manaDeduct = 70;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    }
    //Create one healing method
    public void sweetBerries(){
        int addHP = 100;
        int addMP = 20;

        super.healthPoints += addHP;
        super.manaPoints += addMP;

        System.out.println( super.characterName + " pick Sweet Berries and gain " + addHP + " HP and " + addMP + " MP");
        System.out.println("Total HP is now " + super.healthPoints);
        System.out.println("Total MP is now " + super.manaPoints);
    }
}
