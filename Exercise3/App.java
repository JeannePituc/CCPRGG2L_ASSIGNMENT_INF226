public class App {
    public static void main(String[] args) {

        character knight = new character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();
        knight.attack();

        System.out.println();

        character mage = new character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();
        mage.attack();

        System.out.println();

        character thief = new character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();
        thief.attack();

        System.out.println();

        weapon sword = new weapon ();

        sword.name = "Spada";
        sword.damage = 8;
        sword.rarity = "common";
        
        sword.Name ();
        sword.Damage();
        sword.Rarity();
        sword.add (2);
        sword.add (10);
        String Gear = sword.Gear();
        System.out.println(Gear);
}
}
