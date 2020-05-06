package quantitymeasurement;
public class QuantityMeasurement
{
    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Welcome to Quantity measurement");
    }

    /**
     * Method for unit conversion
     * @param units
     * @param value
     * @return
     */
    public double conversionOfUnit(Unit units,Double value)
    {
        return value*units.unit;
    }

    /**
     * object equality method
     * @param object
     * @return
     */
    @Override
    public boolean equals(Object object)
    {
        if(object == null) return false;
        if(this == object) return true;
        if (this.getClass() == object.getClass()) return true;
        return super.equals(object);
    }
}


