package pl.infoshare.eleven;

public class Ikarus implements Bus{

    private double gasTank = 200.0;

    @Override
    public void stampTheTicket(String ticket) {
        System.out.println("Stamped the " + ticket);
    }

    @Override
    public void ride() {
        System.out.println("Wrrrrrrrr");

    }

    @Override
    public double refuel(double gasAmount) {
        this.gasTank+=gasAmount;
        return this.gasTank;
    }

    @Override
    public void honkTheHorn() {
        System.out.println("HONK HONK");

    }
}
