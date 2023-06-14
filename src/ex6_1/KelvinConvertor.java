package ex6_1;

public class KelvinConvertor implements Convertor {
    @Override
    public double convertTo(double celsValue) {
        return celsValue + 273.0;
    }
}
