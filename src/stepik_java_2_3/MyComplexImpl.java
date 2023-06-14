package stepik_java_2_3;

public class MyComplexImpl implements Complex {
    private final double x;
    private final double y;

    MyComplexImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Complex sum(Complex other) {
        Complex temp = new MyComplexImpl(this.x + other.getReal(), this.y + other.getImage());
        return temp;
    }

    @Override
    public Complex sub(Complex other) {
        Complex temp = new MyComplexImpl(this.x - other.getReal(), this.y - other.getImage());
        return temp;
    }

    @Override
    public Complex mul(Complex other) {
        Complex temp = new MyComplexImpl(this.x * other.getReal() - this.y * other.getImage(),
                this.y * other.getReal() + this.x * other.getImage());
        return temp;
    }

    @Override
    public double getReal() {
        return this.x;
    }

    @Override
    public double getImage() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        MyComplexImpl temp = (MyComplexImpl) obj;
        return ((Math.round(this.x * 100) / 100) == (Math.round(temp.x * 100) / 100)) &&
                ((Math.round(this.y * 100) / 100) == (Math.round(temp.y * 100) / 100));
    }

    @Override
    public int hashCode() {
        return (int) Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);
    }

    @Override
    public String toString() {
        String temp = String.format("%.2f", x) + "+" + String.format("%.2f", y) + "i";
        return temp;
    }

    Complex createComplex(double x, double y) {
        Complex temp = new MyComplexImpl(x, y);
        return temp;
    }
}
