package quantitymeasurement;

public enum Unit
{
    INCH(1/12.0),FEET(1*12.0);
    final double unit;

    /**
     * Parameterised constructor
     * @param unit
     */
    Unit(double unit)
    {
        this.unit = unit;
    }
}
