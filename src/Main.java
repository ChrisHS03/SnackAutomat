public class Main {
    public static void main(String[] args) {
        SnackAutomat snackAutomat = new SnackAutomat();
        int byttePenge = snackAutomat.køb(200,45);
        System.out.println("Byttepenge: " + byttePenge);
        System.out.println(snackAutomat.byttepenge(byttePenge));

        snackAutomat.køb(50,100);
    }
}
