import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Cars cars;

    @BeforeEach
    public void setUp(){
        cars = new Cars(4, 5, "diesel", true) {
            @Override
            public boolean isManual() {
                return false;
            }
        };
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(cars.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(cars.getMaximumOccupancy()).isEqualTo(5);
    }

    @Test
    public void canGetFuelType(){
        assertThat(cars.getFuelType()).isEqualTo("diesel");
    }

    @Test
    public void isCarManual(){
        assertThat (cars.isManual()).isEqualTo(true);
    }

    @Test
    public void turnLightsOn(){
        String expected = "FLASH!";
        String result;
        result = Cars.lightOn();
        assertThat(result).isEqualTo(expected);
    }
}