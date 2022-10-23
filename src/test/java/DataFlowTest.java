import org.junit.Assert;
import org.junit.Test;

public class DataFlowTest {

    @Test
    public void Test1() {
        int loi = 10;
        int dem = 4;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int loi = 8;
        int dem = 5;

        final String expected = "Phạt tiền và treo bằng 3 năm";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }
}
