public class Dancer {
    public void dance() {
        System.out.println("This is just a typical, boring dancer...");
    }

    public final void stopDancing() {
        System.out.println("A dancer stops dancing.");
    }
}

class ElectricBoogieDancer extends Dancer {
    public void dance() {
        System.out.println("The dancers dance is electrifying!");
    }
}

class BreakDancer extends Dancer {
    public void dance() {
        System.out.println("The dancer breaks!");
    }
}