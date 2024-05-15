import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingMetreTest {

    @Test
    public void testParkingMetreParameters() {
        int hoursOfStay = 2;
        int payAmount = 10;
        ParkingMetre parkingMetre = new ParkingMetre(hoursOfStay, payAmount);
        assertEquals(hoursOfStay, parkingMetre.hoursOfStay);
        assertEquals(payAmount, parkingMetre.payAmount);
    }
}
