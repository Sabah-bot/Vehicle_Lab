import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehiclesTest {

    Vehicles vehicles;


@BeforeEach
    public void setUp() {
        vehicles = new Vehicles(4, 5, "diesel") {
            @Override
            public int getNumberOfWheels() {
                return super.getNumberOfWheels();
            }

            @Override
            public boolean isManual() {
                return false;
            }
        };
    }

@Test
    public void canGetNumberOfWheels(){
        assertThat(vehicles.getNumberOfWheels()).isEqualTo(4);
    }

@Test
    public void canGetMaximumOccupancy(){
        assertThat(vehicles.getMaximumOccupancy()).isEqualTo(5);
    }

@Test
    public void canGetFuelType(){
        assertThat(vehicles.getFuelType()).isEqualTo("diesel");
    }

@Test
    public void CanitDrive(){
        String expected = "Yes!";
        String result = Vehicles.CanDrive();
        assertThat(result).isEqualTo(expected);
    }

}
