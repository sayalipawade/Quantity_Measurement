package quantitymeasurement;

public enum Unit
{
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0),CM_TO_INCH(1/2.5);;
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
