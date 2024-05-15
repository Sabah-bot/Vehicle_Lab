import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarParkTest {

    CarPark CarPark;

    @BeforeEach
    public void setUp(){
        CarPark = new CarPark();
    }

    @Test
    public void canGetNumberOfVehicles(){
        assertThat(CarPark.getNumberOfVehicles()).isEqualTo(0);
    }

    @Test
    public void canAddVehicle(){
        Cars cars = new Cars(4, 5, "diesel", true) {
            @Override
            public boolean isManual() {
                return false;
            }
        };
        Buses buses = new Buses(6, 29, "petrol", "Doubledecker");
        CarPark.addVehicle(cars);
        assertThat(CarPark.getNumberOfVehicles()).isEqualTo(1);
    }


}