public abstract class Cars extends Vehicles {

    private boolean isManual;

    public Cars (int numberOfWheels, int maximumOccupancy, String fuelType, boolean isManual){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.isManual = true;
    }



    public String turnLightsOn(){
        return "FLASH!";
    }

    public static String lightOn() {
        return "FLASH!";
    }

}
