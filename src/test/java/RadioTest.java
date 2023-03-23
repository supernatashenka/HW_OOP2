import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void ShouldSetStation (){
        Radio rad = new Radio();
        rad.currentStationNumber = 9;

        int expected = 9;
        int actual = rad.currentStationNumber;

        Assertions.assertEquals(expected, actual);
    }
}
