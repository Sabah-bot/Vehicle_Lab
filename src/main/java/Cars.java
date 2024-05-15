public abstract class Cars extends Vehicles {

    private boolean isManual;

    public Cars (int numberOfWheels, int maximumOccupancy, String fuelType, boolean isManual){
        super(numberOfWheels, maximumOccupancy, fuelType);
        this.isManual = true;
    }

    public boolean isManual(double amount) {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public String turnLightsOn(){
        return "FLASH!";
    }

    public static String lightOn() {
        return "FLASH!";
    }

}
