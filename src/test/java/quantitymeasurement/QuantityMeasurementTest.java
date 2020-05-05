package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement=new QuantityMeasurement();
    /**
     * Given zero feet and zero feet should return true
     */
    @Test
    public void givenZeroFeetAndZeroValue_WhenCompare_ShouldReturnTrue() {
        double value1=quantityMeasurement.getFeet(0.0);
        double value2=quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given null feet should return false
     */
    @Test
    public void givenNullFeet_WhenCompare_ShouldReturnfalse() {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    /**
     * Reference check
     */
    @Test
    public void givenReference_WhenCompare_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement2=new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement,quantityMeasurement2);
    }
}
