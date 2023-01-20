public class weapon {
    String name;
    int damage;
    String rarity;

    public void Name() {
        System.out.println("Weapon: " + name);
    }
    public void Damage() {
        System.out.println("Damage: " + damage);

    } public void Rarity() {
        System.out.println("Rarity: " + rarity);
    }
    void add (int totaldamage) {
        int newDamage = this.damage + totaldamage;
        System.out.println("Damage increased from : " + this.damage + " to " + newDamage);
        this.damage = newDamage;
    }
 String Gear() {
    String Gear = ("Weapon Name: " + name + "\n"+ "Rarity: " + rarity + "\n"+ "Damage: " + damage );
    return Gear;
    }
}
