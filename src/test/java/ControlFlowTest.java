import org.junit.Assert;
import org.junit.Test;

public class ControlFlowTest {

    @Test
    public void Test1() {
        int loi = 3;
        int dem = -13;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int loi = 5;
        int dem = 4;

        final String expected = "Phạt tiền";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int loi = 5;
        int dem = 9;

        final String expected = "Phạt tiền và treo bằng 6 tháng";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int loi = 9;
        int dem = 4;

        final String expected = "Phạt tiền và treo bằng 3 năm";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int loi = 9;
        int dem = 9;

        final String expected = "Phạt tiền và treo bằng vĩnh viễn";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }
}
