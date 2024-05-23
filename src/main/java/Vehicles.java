public abstract class Vehicles {

    private int numberOfWheels;
    private int maximumOccupancy;

    private String fuelType;

    public Vehicles(int numberOfWheels, int maximumOccupancy, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
    }




    public int getNumberOfWheels() {
        return numberOfWheels;
    }


    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }


    public String getFuelType() {
        return fuelType;
    }


    public static String CanDrive() {
        return "Yes!";
    }
    public abstract boolean isManual();
}
