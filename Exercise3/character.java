public class character {
    int strength;
    int agility;
    int intelligence;
    String name;


    public void sayMyName() {
        System.out.println("Hey, I am " + name + "! ready to fight?");
    }
    
    public void sayMyStrength() {
        System.out.println("strength: " + strength);
    }

    public void sayMyAgility() {
        System.out.println("agility: " + agility);
    }

    public void sayMyIntelligence() {
        System.out.println("Intelligence: " + intelligence);
    }
    void attack() {
        System.out.println("I am attacking!");
    }
}