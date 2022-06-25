import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.service.SQRService;

public class SQRServiceTest {

    @Test
    public void NothingInside() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrPants(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AllInside() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.sqrPants(100, 9_801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SomeInside() {
        SQRService service = new SQRService();

        int expected = 7;
        int actual = service.sqrPants(120, 300);

        Assertions.assertEquals(expected, actual);
    }
}