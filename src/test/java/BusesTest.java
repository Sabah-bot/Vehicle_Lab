import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusesTest {

    Buses buses;

    @BeforeEach
    public void setUp(){
        buses = new Buses (8, 30, "petrol", "doubledecker");
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(buses.getNumberOfWheels()).isEqualTo(8);
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(buses.getMaximumOccupancy()).isEqualTo(30);
    }

    @Test
    public void canGetFuelType(){
        assertThat(buses.getFuelType()).isEqualTo("petrol");
    }

<<<<<<< HEAD


=======
    @Test
    public void canGetType(){
        assertThat (buses.getType()).isEqualTo("doubledecker");
    }
   
    @Test
    public void TakesOnPassengers(){
        String expected = "AllAboard";
        String result;
        result = Buses.passage();
        assertThat(result).isEqualTo(expected);
    }
>>>>>>> 4fd81a94a17b4d25e8f605178c1145469b94776b
}
