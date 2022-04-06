public class Taxi extends Car {
  private double fareCollected;

  public Taxi(String licensePlate, double tollFee, int passengers, boolean isElectric, double fareCollected) {
    super(licensePlate, tollFee, passengers, isElectric); // super refers to the Car constructor
    this.fareCollected = fareCollected;
  }

  public boolean chargeAndDropOffRiders(double farePerRider)
  {
    // calculate and collect fare from riders
    int numRiders = getPassengers() - 1; // don't count driver
    double totalFare = numRiders * farePerRider;
    fareCollected += totalFare;

    // call inherited method
    boolean dropOffSuccessful = dropOffPassengers(numRiders);
    return dropOffSuccessful;
  }

  public double getFareCollected()
  {
    return fareCollected;
  }

  @Override
  public void printInfo()
  {
    super.printInfo();
    System.out.println("Total fare collected: " + fareCollected);
  }
}