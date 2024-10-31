import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dancer> dancerList = new ArrayList<>();
        dancerList.add(new Dancer());
        dancerList.add(new ElectricBoogieDancer());
        dancerList.add(new BreakDancer());

        for (int i = 0; i < dancerList.size(); i++) {
            var dancer = dancerList.get(i);

            if (dancer instanceof ElectricBoogieDancer) {
                System.out.println("Dancer number " + i + " is an electric boogie dancer");
            }
            else if (dancer instanceof BreakDancer) {
                System.out.println("Dancer number " + i + " is a breakdancer!");
            }

            dancer.dance();
        }
    }
}
