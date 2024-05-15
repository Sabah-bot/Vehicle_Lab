public abstract class Vehicles {

    private int numberOfWheels;
    private int maximumOccupancy;

    private String fuelType;

    public Vehicles(int numberOfWheels, int maximumOccupancy, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelType = fuelType;
    }



    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {

    }

    public String CanitDrive(){
        return "Yes!";
    }

    public static String CanDrive() {
        return "Yes!";
    }

    public abstract boolean isManual();
}