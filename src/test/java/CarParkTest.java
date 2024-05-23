import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarParkTest {

    CarPark carPark;
    Vehicles Vehicles;

    @BeforeEach
    public void setUp(){ carPark = new CarPark();
    }



    @Test
    public void testAddVehicle() {
        carPark.addVehicle(Vehicles);
        assertThat(carPark.getNumberOfVehicles()).isEqualTo(1);
    }

    @Test
    public void testRemoveVehicle() {
        carPark.removeVehicle(Vehicles);
    }

        @Test
        public void testGetNumberOfVehicles() {
            carPark.addVehicle(Vehicles);
            carPark.addVehicle(Vehicles);
            int numberOfVehicles = carPark.getNumberOfVehicles();
            assertThat(numberOfVehicles).isEqualTo(2);
        }
    }



