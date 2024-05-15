public class Buses extends Vehicles {

    private String type;

    public Buses(int numberOfWheels, int maximumOccupancy, String fuelType, String type){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.type = type;
    }

    public String type (){
        return type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String TakesOnPassengers(){
        return "Yes!";
    }

    public static String passage(){
        return "Yes!";
    }

    @Override
    public boolean isManual() {
        return false;
    }
}