import org.junit.jupiter.api.Test;

public class RadioConstructorTest {
    @Test
    public void ShouldSetStation (){
        Radio rad =new Radio(30);
        rad.setCurrentStationNumber(15);

        int expected = 15;
        int actual = rad.getCurrentStationNumber();

    }


}
