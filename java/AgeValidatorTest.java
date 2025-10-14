import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeValidatorTest {
    AgeValidator validator = new AgeValidator();

    @Test
    public void testAgeBelow18() {
        Assert.assertFalse(validator.isEligibleToVote(16));
    }

    @Test
    public void testAgeExactly18() {
        Assert.assertTrue(validator.isEligibleToVote(18));
    }

    @Test
    public void testAgeAbove18() {
        Assert.assertTrue(validator.isEligibleToVote(25));
    }
}
