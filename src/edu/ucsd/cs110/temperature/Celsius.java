package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float fahren = this.getValue() * 9 / 5 + 32;
        return new Fahrenheit(fahren);
    }

    public String toString()
    {
        return "" + this.getValue() + " C";
    }
}
