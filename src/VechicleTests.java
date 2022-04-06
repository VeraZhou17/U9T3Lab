public class VechicleTests
{
  public static void main(String[] args)
  {
//    Taxi myTaxi = new Taxi("TX4567", 10.00, 6, true, 5.0);
//    System.out.println(myTaxi.calculateTollPrice());
//
//    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
//    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver

//    Taxi myTaxi3 = new Taxi("TX1234", 10.0, 6, true, 0.0);
//    System.out.println(myTaxi3.getPassengers()); // should be 6, including driver
//
//    // now let's drop off the 5 riders, charging 3.50 per rider
//    boolean success = myTaxi3.chargeAndDropOffRiders(3.50);
//    System.out.println(success); // should be true
//    System.out.println(myTaxi3.getPassengers()); // should now be 1
//    System.out.println(myTaxi3.getFareCollected()); // should be 17.50

    Car myCar3 = new Car("MK4567", 6.75, 4, true);
    myCar3.printInfo();

    Truck myTruck3 = new Truck("TB12MX", 15.50, 2, 4, true);
    myTruck3.printInfo();

    Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
    myTaxi4.printInfo();






  }
}
