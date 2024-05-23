import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarParkTest {
<<<<<<< HEAD

    CarPark carPark;
=======
     CarPark carPark;
>>>>>>> 4fd81a94a17b4d25e8f605178c1145469b94776b
    Vehicles Vehicles;

    @BeforeEach
    public void setUp(){ carPark = new CarPark();
<<<<<<< HEAD
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

=======
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

>>>>>>> 4fd81a94a17b4d25e8f605178c1145469b94776b
        @Test
        public void testGetNumberOfVehicles() {
            carPark.addVehicle(Vehicles);
            carPark.addVehicle(Vehicles);
            int numberOfVehicles = carPark.getNumberOfVehicles();
            assertThat(numberOfVehicles).isEqualTo(2);
        }
    }



