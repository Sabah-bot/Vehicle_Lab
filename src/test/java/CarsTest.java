import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {

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
    public void turnLightsOn(){
        String expected = "FLASH!";
        String result;
        result = Cars.lightOn();
        assertThat(result).isEqualTo(expected);
    }
}