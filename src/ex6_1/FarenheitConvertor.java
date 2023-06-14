package ex6_1;

public class FarenheitConvertor implements Convertor {
    @Override
    public double convertTo(double celsValue) {
        return celsValue * 1.8 + 32;
    }
}