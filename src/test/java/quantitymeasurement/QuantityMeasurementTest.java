package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    /**
     * Given zero feet and zero feet shoul return true
     */
    QuantityMeasurement quantityMeasurement=new QuantityMeasurement();
    @Test
    public void givenZeroFeetAndZeroValue_WhenCompare_ShouldReturnTrue() {
        double value1=quantityMeasurement.getFeet(0.0);
        double value2=quantityMeasurement.getFeet(0.0);
        Assert.assertEquals(value1,value2,0.0);
    }
}
