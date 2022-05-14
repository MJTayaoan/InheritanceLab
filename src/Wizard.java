public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    //Create two attacking method
    public void gush(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Gush (Damage - 50)");
        int damagePoints = 50;
        int manaDeduct = 20;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    };
    public void pyrogram(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Pyrogram (Damage - 30)");
        int damagePoints = 30;
        int manaDeduct = 40;
        damageTarget(enemyCharacter, damagePoints, manaDeduct);
    };
    //Create one healing method
    public void goldenApple(){
        int addHP = 90;
        int addMP = 40;

        super.healthPoints += addHP;
        super.manaPoints += addMP;

        System.out.println( super.characterName + " pick Golden Apple and gain " + addHP + " HP and " + addMP + " MP");
        System.out.println("Total HP is now " + super.healthPoints);
        System.out.println("Total MP is now " + super.manaPoints);
    }
}