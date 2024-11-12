import java.util.ArrayList;
import java.util.List;

public class SnackAutomat {

    public int køb(int betaling, int pris){
        if (betaling <= 0 ){
            throw new IllegalArgumentException("Betaling skal være højere end 0");
        } else if (pris <= 0){
            throw new IllegalArgumentException("Prisen skal være højere end 0");
        } else if (betaling-pris < 0) {
            throw new IllegalArgumentException("Du skal betale mere eller det samme som prisen");
        }
        return betaling-pris;
    }
    public ArrayList<String> byttepenge(int byttepengeBeløb){
        int sum = byttepengeBeløb;
        int counter20 = 0;
        int counter10 = 0;
        int counter5 = 0;
        int counter2 = 0;
        int counter1 = 0;
        while(sum > 0) {
            if (sum >= 20) {
                sum -= 20;
                counter20++;
            }else if (sum >= 10) {
                sum -= 10;
                counter10++;
            } else if (sum >= 5) {
                sum -= 5;
                counter5++;
            } else if (sum >= 2) {
                sum -= 2;
                counter2++;
            } else if (sum >= 1) {
                sum -= 1;
                counter1++;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("20 kr: "+counter20);
        list.add("10 kr: "+counter10);
        list.add("5 kr: "+counter5);
        list.add("2 kr: "+counter2);
        list.add("1 kr: "+counter1);

        list.sort((a, b) -> {
            // Extract the numerical part from strings a and b
            int countA = Integer.parseInt(a.split(": ")[1]);
            int countB = Integer.parseInt(b.split(": ")[1]);
            return Integer.compare(countB, countA); // Sort in descending order
        });

        return list;
    }
}
