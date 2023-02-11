public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodgeChance >= 0 && dodgeChance <= 100) {
            this.dodgeChance = dodgeChance;
        } else {
            this.dodgeChance = 0;
        }
    }

    public int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu!");

        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen saldırıyı savurdu!");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    public boolean isDodge() {
        double randomValue1 = Math.random() * 100;
        return randomValue1 < this.dodgeChance;
    }
}
