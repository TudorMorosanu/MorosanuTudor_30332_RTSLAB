package Ex2;

public class MatrixUtil {

    private int numRow;
    private int numCol;
    private float[][] content;

    public int getNumRow() {
        return numRow;
    }

    public void setNumRow(int numRow) {
        this.numRow = numRow;
    }

    public int getNumCol() {
        return numCol;
    }

    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }

    public float getElement(int i, int j){
        return this.content[i][j];
    }

    public MatrixUtil(float[][] content){
        this.content = content;
        this.numRow = this.content.length;
        this.numCol = this.content[0].length;
    }

    public static float[][] add(float[][] matrix1, float[][] matrix2){

        MatrixUtil m1 = new MatrixUtil(matrix1);
        MatrixUtil m2 = new MatrixUtil(matrix2);
        if(m1.getNumRow()==m2.getNumRow() && m1.getNumCol()==m2.getNumCol())
        {
            float[][] res = new float[m1.getNumRow()][m1.getNumCol()];
            for(int i = 0; i<m1.getNumRow(); i++){
                for(int j = 0; j<m1.getNumCol(); j++)
                {
                    res[i][j] = m1.getElement(i, j) + m2.getElement(i, j);
                }
            }
            return res;
        }
        else
        {
            System.out.println("Adding matrices are of incorrect dimensions!");
            return null;
        }
    }

    public static float[][] multiply(float[][] matrix1, float[][] matrix2){

        MatrixUtil m1 = new MatrixUtil(matrix1);
        MatrixUtil m2 = new MatrixUtil(matrix2);
        if(m1.getNumCol() == m2.getNumRow())
        {
            float[][] res = new float[m1.getNumRow()][m2.getNumCol()];
            for(int m1l = 0; m1l<m1.getNumRow(); m1l++){
                for(int m2c = 0; m2c < m2.getNumCol(); m2c++){
                    for(int i=0; i<m1.getNumCol(); i++){

                        res[m1l][m2c] += (m1.getElement(m1l, i) * m2.getElement(i, m2c));
                    }
                }
            }
            return res;
        }
        else
        {
            System.out.println("Multiplying matrices of incorrect dimensions!");
            return null;
        }
    }

    public static void display(float[][] matrix)
    {
        MatrixUtil m = new MatrixUtil(matrix);
        for(int i = 0; i<m.getNumRow(); i++){
            for(int j = 0; j<m.getNumCol(); j++){
                System.out.print(Float.toString(m.getElement(i, j)) + ' ');
            }
            System.out.print('\n');;
        }
        System.out.println('\n');
    }
}
