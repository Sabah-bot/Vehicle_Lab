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
<<<<<<< HEAD:src/test/java/CarsTest.java

=======
    

    @Test
    public void isCarManual(){
        assertThat (cars.isManual()).isEqualTo(false);
    }
>>>>>>> 4fd81a94a17b4d25e8f605178c1145469b94776b:src/test/java/CarTest.java

    @Test
    public void turnLightsOn(){
        String expected = "FLASH!";
        String result;
        result = Cars.lightOn();
        assertThat(result).isEqualTo(expected);
    }
}
