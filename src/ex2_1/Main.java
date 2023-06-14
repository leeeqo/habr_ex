package ex2_1;

public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(3, 4, 5);
        System.out.println(vector.len());

        int N = 5;
        Vector[] arrayVec = Vector.randVec(N);
        for (Vector vec : arrayVec) {
            vec.printCoord();
            System.out.println("");
        }
    }
}
