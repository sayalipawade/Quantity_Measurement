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
        try
        {
            quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,null);
        }
        catch (NullPointerException e)
        {
            Assert.assertEquals(null,e.getMessage());
        }
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
     * Given null Inch should return false
     */
    @Test
    public void givenNullInch_WhenCompare_ShouldReturnfalse()
    {
        try
        {
            quantityMeasurement.conversionOfUnit(Unit.INCH,null);
        }
        catch (NullPointerException e)
        {
            Assert.assertEquals(null,e.getMessage());
        }
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
     * Given Zero feet and zero inch when equal should return true
     */
    @Test
    public void givenZeroFeetAndZeroInch_WhenEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,0.0);
        double feet=quantityMeasurement.conversionOfUnit(Unit.INCH,0.0);
        Assert.assertEquals(inch,feet,0.0);
    }

    /**
     * Given One feet and one Inch when not equal should return true
     */
    @Test
    public void givenOneFeetAndOneInch_WhenNotEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double feet=quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        Assert.assertNotEquals(inch,feet,0.0);
    }

    /**
     * Given One feet and twelve inch when equal should return true
     */
    @Test
    public void givenOneFeetAndTwelveInch_WhenEqual_ShouldReturnTrue()
    {
        double inch=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        Assert.assertEquals(12,inch,0.0);
    }

    /**
     * Given twelve inch and one feet when equal should return true
     */
    @Test
    public void givenTwelveInchAndOneFeet_WhenEqual_ShouldReturnTrue()
    {
      double inch=quantityMeasurement.conversionOfUnit(Unit.INCH,12.0);
      double feet=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
      Assert.assertEquals(inch,feet,0.0);
    }

    /**
     * Given three feet and one yard when equal should return true
     */
    @Test
    public void givenThreeFeetAndOneYard_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,3.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given one feet and one yard when equal should return false
     */
    @Test
    public void givenOneFeetAndOneYard_WhenEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /**
     * Given one Inch and one yard when equal should return false
     */
    @Test
    public void givenOneInchAndOneYard_WhenEqual_ShouldReturnFalse()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertNotEquals(value1,value2,0.0);
    }

    /**
     * Given one yard and thirty six Inch when equal should return true
     */
    @Test
    public void givenOneYardAndThirtySixInch_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,36.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given thirty six inch and one yard when equal should return true
     */
    @Test
    public void givenThirtySixInchAndOneYard_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.INCH,36.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given one yard and three feet when equal should return true
     */
    @Test
    public void givenOneYardAndThreeFeet_WhenEqual_ShouldReturnTrue()
    {
        double value2=quantityMeasurement.conversionOfUnit(Unit.YARD_TO_INCH,1.0);
        double value1=quantityMeasurement.conversionOfUnit(Unit.FEET_TO_INCH,3.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given two inch and five centimeter when equal should return true
     */
    @Test
    public void givenTwoInchAndFiveCentimeter_WhenCompare_ShouldReturnTrue()
    {
        double value1 = quantityMeasurement.conversionOfUnit(Unit.INCH, 2.0);
        double value2 = quantityMeasurement.conversionOfUnit(Unit.CM_TO_INCH, 5.0);
        Assert.assertEquals(value1, value2, 0.0);
    }

    /**
     * Given 2in+2in=4in when this equality is right should return true
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
     * Given 1ft+2in=14in when this equality is right should return true
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
     * Given 1ft+1ft=24in when this equality is right should return true
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
     * Given 2in+2.5cm=3in when this equality is right should return true
     */
    @Test
    public void givenTwoInchAndTwoAndHalfCentimeter_WhenPerformingAddition_shouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.INCH,2.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.CM_TO_INCH,2.5);
        double result=value1+value2;
        Assert.assertEquals(3.0,result,0.0);
    }

    /**
     * Given 1 Gallon=3.78litre when this equality is right should return true
     */
    @Test
    public void givenVolumeInGallonAndLitre_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.GALLON_TO_LITRE,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.LITRE,3.78);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1 litre=1000 ml when this equality is right should return true
     */
    @Test
    public void givenOneLitreAndOneThousandMililiter_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.LITRE,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.MILLILITER_TO_LITRE,1000.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1gallon+3.78litres=7.57 litres when this equality is right should return true
     */
    @Test
    public void givenOneGallonAndLitre_WhenPerformingAddition_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.GALLON_TO_LITRE,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.LITRE,3.78);
        double result=value1+value2;
        Assert.assertEquals(7.56,result,0.0);
    }

    /**
     * Given 1litre+1000ml=2litres when this equality is right should return true
     */
    @Test
    public void givenOneLitreAndOneThousandMililitre_WhenPerformingAddition_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.LITRE,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.MILLILITER_TO_LITRE,1000.0);
        double result=value1+value2;
        Assert.assertEquals(2.0,result,0.0);
    }

    /**
     * Given 1kg =1000grams when this equality is right should return true
     */
    @Test
    public void givenOneKilogramAndOneThousandGram_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.KILOGRAM,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.GRAMS_TO_KILOGRAM,1000.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1 tonne = 1000 kgs when this equality is right should return true
     */
    @Test
    public void givenOneTonneAndOneThousandKilogram_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.TONNE_TO_KILOGRAM,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.KILOGRAM,1000.0);
        Assert.assertEquals(value1,value2,0.0);
    }

    /**
     * Given 1 tonne + 1000 gm = 1001 kg when this equality is right should return true
     */
    @Test
    public void givenOneTonneAndOneThousandGram_WhenPerformingAddition_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.TONNE_TO_KILOGRAM,1.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.GRAMS_TO_KILOGRAM,1000.0);
        double result=value1+value2;
        Assert.assertEquals(result,1001,0.0);
    }

    /**
     * Given 212 F = 100 C when this equality is right should return true
     */
    @Test
    public void givenFahrenheitAndCelcius_WhenEqual_ShouldReturnTrue()
    {
        double value1=quantityMeasurement.conversionOfUnit(Unit.FAHRENHEIT_TO_CELSIUS,212.0);
        double value2=quantityMeasurement.conversionOfUnit(Unit.CELSIUS,100.0);
        Assert.assertEquals(value1,value2,0.0);
    }
}
