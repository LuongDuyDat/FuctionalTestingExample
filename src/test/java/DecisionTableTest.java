import org.junit.Assert;
import org.junit.Test;

public class DecisionTableTest {

    @Test
    public void Test1() {
        int loi = -2;
        int dem = 0;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int loi = -2;
        int dem = 3;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int loi = -2;
        int dem = 9;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int loi = 5;
        int dem = 0;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int loi = 5;
        int dem = 3;

        final String expected = "Phạt tiền";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int loi = 5;
        int dem = 9;

        final String expected = "Phạt tiền và treo bằng 6 tháng";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int loi = 8;
        int dem = 0;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        int loi = 8;
        int dem = 3;

        final String expected = "Phạt tiền và treo bằng 3 năm";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        int loi = 8;
        int dem = 9;

        final String expected = "Phạt tiền và treo bằng vĩnh viễn";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        int loi = 13;
        int dem = 0;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        int loi = 13;
        int dem = 3;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        int loi = 13;
        int dem = 9;

        final String expected = "Invalid input";
        final String actual = Main.xu_ly_vi_pham(loi, dem);

        Assert.assertEquals(expected, actual);
    }
}
