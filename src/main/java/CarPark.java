import java.util.ArrayList;

public class CarPark {

    private ArrayList<Vehicles> vehicles;



    public CarPark(){
        this.vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicles vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicles vehicle){
        this.vehicles.remove(vehicle);
    }

    public ArrayList<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }

}
