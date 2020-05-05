package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{

    QuantityMeasurement quantityMeasurement=new QuantityMeasurement();
    /**
     * Given zero feet and zero feet should return true
     */
    @Test
    public void givenZeroFeetAndZeroFeet_WhenCompare_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET,0.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.FEET,0.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given null feet should return false
     */
    @Test
    public void givenNullFeet_WhenCompare_ShouldReturnfalse()
    {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    /**
     * Reference check
     */
    @Test
    public void givenReferenceOfFeet_WhenCompare_ShouldReturnTrue()
    {
        QuantityMeasurement quantityMeasurement2=new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement,quantityMeasurement2);
    }

    /**
     * TypeCheck
     */
    @Test
    public void givenSameType_WhenCompare_ShouldReturnTrue()
    {
        double type1=quantityMeasurement.conversionOfUnit(Unit.FEET,0.1);
        double type2=quantityMeasurement.conversionOfUnit(Unit.FEET,0.1);
        Assert.assertEquals(type1,type2,0.0);
    }

    /**
     * Given Two Different Feet Values When Equal Should Return False
     */
    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.FEET,0.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.FEET,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Feet Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.FEET,1.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.FEET,1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given null feet should return false
     */
    @Test
    public void givenNullInch_WhenCompare_ShouldReturnfalse()
    {
        Assert.assertFalse(quantityMeasurement.equals(null));
    }

    /**
     * Given Reference of Inch should return equal
     */
    @Test
    public void givenReferenceOfInch_WhenCompare_ShouldReturnTrue()
    {
        QuantityMeasurement quantityMeasurement2=new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement,quantityMeasurement2);
    }

    /**
     * Given Two Different Inch Values When Equal Should Return False
     */
    @Test
    public void givenTwoDifferentInchValues_WhenEqual_ShouldReturnFalse()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.INCH,0.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Inch Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualInchValues_WhenEqual_ShouldReturnTrue()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given Zero feet and zero inch should return equal
     */
    @Test
    public void givenZeroFeetAndZeroInch_WhenEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET,0.0);
        double feet=quantityMeasurement.conversionOfUnit(Unit.INCH,0.0);
        Assert.assertEquals(inch,feet,0.0);
    }
}
