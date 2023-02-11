public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc",10,100,90,20);
        Fighter alex = new Fighter("Alex",15,90,100,30);

        Match match = new Match(marc,alex,90,100);
        match.run();
    }
}