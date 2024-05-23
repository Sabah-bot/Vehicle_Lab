public class Buses extends Vehicles {

    private String type;

    public Buses(int numberOfWheels, int maximumOccupancy, String fuelType, String type){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.type = type;
    }

    public int getNumberOfWheels() {
        return 8;
    }

    public int getMaximumOccupancy() {
        return 30;
    }

    public String getFuelType() {
        return "petrol";
    }

    @Override
    public boolean isManual() {
        return false;
    }


}
