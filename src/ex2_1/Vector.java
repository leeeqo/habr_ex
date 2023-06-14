package ex2_1;

public class Vector {
    private final double x, y, z;

    Vector() { x = 0; y = 0; z = 0; }
    Vector(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    Vector(Vector other) {
        this(other.x, other.y, other.z);
    }

    public double len() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double dotProduct(Vector vec) {
        return x * vec.x + y * vec.y + z * vec.z;
    }

    public double angleBetween(Vector vec) {
        double dotProduct = this.dotProduct(vec);
        return dotProduct / (this.len() + vec.len());
    }

    public Vector sum(Vector vec) {
        //Vector res = new Vector();
        return new Vector(this.x + vec.x, this.y + vec.y, this.z + vec.z);
    }

    public Vector diff(Vector vec) {
        return new Vector(this.x - vec.x, this.y - vec.y, this.z - vec.z);
    }

    public static Vector[] randVec(int N) {
        Vector[] array = new Vector[N];
        for (int i = 0; i < N; i++) {
            array[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return array;
    }

    public void printCoord() {
        System.out.printf("x = %.2f, y = %.2f, z = %.2f", x, y, z);
    }
}
