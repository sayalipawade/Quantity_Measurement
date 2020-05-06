package quantitymeasurement;

public enum Unit
{
    INCH(1.0), FEET_TO_INCH(1 * 12.0), YARD_TO_INCH(1 * 36.0),CM_TO_INCH(1/2.5),
    LITRE(1.0), GALLON_TO_LITRE(1 * 3.78), MILLILITER_TO_LITRE(1.0 / 1000),
    KILOGRAM(1.0), GRAMS_TO_KILOGRAM(1.0/1000), TONNE_TO_KILOGRAM(1.0*1000);
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
