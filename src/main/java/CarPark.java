import java.util.ArrayList;

public class CarPark {

    public static String add;
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




    public int getNumberOfVehicles() {
        return vehicles.size();
    }

}
