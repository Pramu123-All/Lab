package Q1;

class Temperature {

    private  double celcius;


    public Temperature()
    {
        this.celcius = 0.0;
    }
    public Temperature(double celsius)
    {
        this.celcius=celsius;

    }
    public double tocelsius()
    {
        return celcius;
    }
    public double toFahrenheit()
    {
        return (celcius*9/5)+32;
    }
    public void setCelsius(double celsius)
    {
        this.celcius=celsius;
    }
    public  void setFahrenheit(double  fahrenheit)
    {
        this.celcius=(fahrenheit-32)*5/9;
    }
}
