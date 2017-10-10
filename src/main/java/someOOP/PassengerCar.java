package someOOP;

public class PassengerCar extends Car {
    protected  int horsePower;
    private int hasProtection = -1;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHasProtection() {
        return hasProtection;
    }

    public void setHasProtection(int hasProtection) {
        this.hasProtection = hasProtection;
    }
}
