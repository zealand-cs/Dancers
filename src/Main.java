import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dancer> dancerList = new ArrayList<>();
        dancerList.add(new Dancer());
        dancerList.add(new ElectricBoogieDancer());
        dancerList.add(new BreakDancer());

        for (Dancer dancer : dancerList) {
            dancer.dance();
        }
    }
}
