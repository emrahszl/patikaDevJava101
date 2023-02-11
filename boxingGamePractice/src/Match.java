public class Match {

    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (checkWeight()) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                System.out.println("==========Yeni Round==========");
                if (isFirstHit()) {
                    System.out.println(fighter1.name+" ilk saldırıyı yaptı!");
                    fighter2.health = fighter1.hit(fighter2);
                    if (isWin()) {
                        break;
                    }
                    fighter1.health = fighter2.hit(fighter1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    System.out.println(fighter2.name+" ilk saldırıyı yaptı!");
                    fighter1.health = fighter2.hit(fighter1);
                    if (isWin()) {
                        break;
                    }
                    fighter2.health = fighter1.hit(fighter2);
                    if (isWin()) {
                        break;
                    }
                }
                printHealth();
            }
        } else {
            System.out.println("Sporcuların ağırlıkları maç için uygun değil !");
        }
    }

    boolean checkWeight() {
        return (fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight);
    }

    boolean isFirstHit() {
        double randomNumber = Math.random() * 100;
        return randomNumber < 50;
    }

    boolean isWin() {
        if (fighter1.health == 0) {
            System.out.println("Kazanan : " + fighter2.name);
            return true;
        } else if (fighter2.health == 0) {
            System.out.println("Kazanan : " + fighter1.name);
            return true;
        }
        return false;
    }

    void printHealth() {
        System.out.println("----------------------");
        System.out.println(fighter1.name + "'nın Kalan Canı : " + fighter1.health);
        System.out.println(fighter2.name + "'nın Kalan Canı : " + fighter2.health);
    }
}
