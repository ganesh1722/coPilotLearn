import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReverseStringTest {
    @DataProvider(name = "stringProvider")
    public Object[][] steringProvider() {
        return new Object[][]{
                {"hello", "olleh"},
                {"world", "dlrow"},
                {"TestNG", "GNtseT"}
        };
    }

    @Test(dataProvider = "stringProvider")
    public void testReverse(String input, String expectedOutput) {
        String result = reverseString.reverse(input);
        Assert.assertEquals(result, expectedOutput);
    }
}