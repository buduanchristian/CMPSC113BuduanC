public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    //Warlock Skills method class
    //Warlock skill no.1 with damage and mana reduction upon cast
    public void sunstrike(Character enemyCharacter, Character name){
        int damagePoints = 40;
        int manadecrease = 30;
        System.out.println(super.characterName + " Casts Sunstrike (-30 Mana) " + enemyCharacter.characterName + " Damage done(-50hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

    //Warlock Skill no. 2 Self-heal(Health Points Increase)
    public void healingorb() {
        super.healthPoints += 50;
        System.out.println(super.characterName+" Health restored + 50hp");
    }

    //Warlock skill no.3 with damage and mana reduction upon cast
    public void tailslap(Character enemyCharacter,Character name){
        int damagePoints = 30;
        int manadecrease = 20;
        System.out.println(super.characterName + " Casts Tailslap (-20 Mana) " + enemyCharacter.characterName + " Damage done(-30hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }
}

