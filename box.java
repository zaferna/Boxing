public class box {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Muhammed Ali",100,20,90,50);
        Fighter f2 = new Fighter("Lewis", 95,15,95,25);

        Match match = new Match(f1,f2,85,105,50);

        match.run();

    }
}
