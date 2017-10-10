package someOOP;

public class Test {
    public static void parkCar(Car car , Parking parking){
        if(parking.hasPlaces()){
            car.setInParking(true);
            parking.incIncome(car);
            parking.incCount(1);
        }
    }
    public static void leaveParking(Car car , Parking parking){
        car.setInParking(false);
        parking.decCount(1);
    }
    public static void printReport(Parking [] parkings){
        for (Parking parking :
                parkings) {
            parking.printReport();
        }
    }

    public static void main(String[] args) {
        Parking parkingForTrucks = new Parking(Parking.TRUCK_PARKING , 2);
        Parking passengersCarParking = new Parking(Parking.PASSENGER_CAR_PARKING , 1);
        Car c1 = new PassengerCar();
        parkCar(c1, passengersCarParking);

        Car c2 = new Truck();
        parkCar(c2, parkingForTrucks);

        Car c3 = new PassengerCar();
        parkCar(c3, passengersCarParking);

        Car c4 = new Truck();
        parkCar(c4, parkingForTrucks);

        printReport(new Parking[] { parkingForTrucks, passengersCarParking });
    }
}
