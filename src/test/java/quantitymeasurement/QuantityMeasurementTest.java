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
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.0);
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
        double type1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.1);
        double type2=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.1);
        Assert.assertEquals(type1,type2,0.0);
    }

    /**
     * Given Two Different Feet Values When Equal Should Return False
     */
    @Test
    public void givenTwoDifferentFeetValues_WhenEqual_ShouldReturnFalse()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        Assert.assertNotEquals(value1, value2, 0.0);
    }

    /**
     * Given Two Equal Feet Values When Equal Should Return True
     */
    @Test
    public void givenTwoEqualFeetValues_WhenEqual_ShouldReturnTrue()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
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
     * Given 0ft=0in
     */
    @Test
    public void givenZeroFeetAndZeroInch_WhenEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.0);
        double feet=quantityMeasurement.conversionOfUnit(Unit.INCH,0.0);
        Assert.assertEquals(inch,feet,0.0);
    }

    /**
     * Given 1ft!=1in
     */
    @Test
    public void givenOneFeetAndOneInch_WhenNotEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double feet=quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        Assert.assertNotEquals(inch,feet,0.0);
    }

    /**
     * Given 1ft=12in
     */
    @Test
    public void givenOneFeetAndTwelveInch_WhenEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        Assert.assertEquals(12,inch,0.0);
    }

    /**
     * Given 12in=1ft
     */
    @Test
    public void givenTwelveInchAndOneFeet_WhenEqual_ShouldReturnTrue()
    {
      double inch=quantityMeasurement.conversionOfUnit(Unit.INCH,12);
      double feet=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1);
      Assert.assertEquals(inch,feet,0.0);
    }

    /**
     * Given 3ft=1yd
     */
    @Test
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,3.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1ft!=1yd
     */
    @Test
    public void givenOneFeetAndOneYard_WhenEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /**
     * Given 1in!=1yd
     */
    @Test
    public void givenOneInchAndOneYard_WhenEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /**
     * Given 1yd=36in
     */
    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,36.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 36in=1yd
     */
    @Test
    public void givenThirtySixInchAndOneYard_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.INCH,36);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1yd=3ft
     */
    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue()
    {
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,3.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 2 Inch = 5 Centimeter
     */
    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.INCH, 2.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.CM_TO_INCH, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 2in+2in=4in
     */
    @Test
    public void givenTwoInchAndTwoInch_WhenPerformingAddition_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,2.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.INCH,2.0);
        double result=value1+value2;
        Assert.assertEquals(4.0,result,0.0);
    }

    /**
     * Given 1ft+2in=14in
     */
    @Test
    public void givenOneFeetAndTwoInch_WhenPerformingAddition_shouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.INCH,2.0);
        double result=value1+value2;
        Assert.assertEquals(14,result,0.0);
    }

    /**
     * Given 1ft+1ft=24in
     */
    @Test
    public void givenOneFeetAndOneFeet_WhenPerformingAddition_shouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double result=value1+value2;
        Assert.assertEquals(24,result,0.0);
    }

    /**
     * Given 2in+2.5cm=3in
     */
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenPerformingAddition_shouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,2.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.CM_TO_INCH,2.5);
        double result=value1+value2;
        Assert.assertEquals(3.0,result,0.0);
    }
}
