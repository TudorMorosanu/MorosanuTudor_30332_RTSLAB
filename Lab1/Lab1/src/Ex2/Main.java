package Ex2;

public class Main {
    public static void main(String[] args) {

        float[][] m1 = {
                {2, 3, 1},
                {7, 1, 6},
                {9, 2, 4}
        };
        float[][] m2 = {
                {8, 5, 3},
                {3, 9, 2},
                {2, 7, 3}
        };

        float[][] res= MatrixUtil.add(m1, m2);
        MatrixUtil.display(res);

        res = MatrixUtil.multiply(m1, m2);
        MatrixUtil.display(res);
    };
}