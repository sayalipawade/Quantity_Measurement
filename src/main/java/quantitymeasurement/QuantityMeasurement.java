package quantitymeasurement;
public class QuantityMeasurement
{

    private double feet;
    private double inch;

    /**
     * main method
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Welcome to Quantity measurement");
    }

    /**
     * method for getting feet
     * @param inch
     * @return
     */
    public double getFeet(Double inch)
    {
        return inch/12;
    }

    /**
     * method foe getting inch
     * @param feet
     * @return
     */
    public double getInch(Double feet)
    {
        return feet*12;
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
        QuantityMeasurement that = (QuantityMeasurement) object;
        return Double.compare(that.feet, feet) == 0;
    }
}


