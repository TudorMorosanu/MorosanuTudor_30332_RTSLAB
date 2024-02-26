public class Matrix {

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

    public Matrix(float[][] content){
        this.content = content;
        this.numRow = this.content.length;
        this.numCol = this.content[0].length;
    }

    public static Matrix add(Matrix m1, Matrix m2){

        if(m1.getNumRow()==m2.getNumRow() && m1.getNumCol()==m2.getNumCol())
        {
            float[][] res = new float[m1.getNumRow()][m1.getNumCol()];
            for(int i = 0; i<m1.getNumRow(); i++){
                for(int j = 0; j<m1.getNumCol(); j++)
                {
                    res[i][j] = m1.getElement(i, j) + m2.getElement(i, j);
                }
            }
            return new Matrix(res);
        }
        else
        {
            System.out.println("Adding matrices are of incorrect dimensions!");
            return null;
        }
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        if(m1.getNumCol() == m2.getNumRow())
        {
            float[][] res = new float[m1.getNumRow()][m2.getNumCol()];
            for(int m1l = 0; m1l<m1.getNumRow(); m1l++){
                for(int m2c = 0; m2c < m2.getNumCol(); m2c++){
                    for(int i=0; i<m1.getNumCol(); i++){
                        res[m2c][i] += m1.getElement(m1l, i) * m2.getElement(m2c, i);
                    }
                }
            }
            return new Matrix(res);
        }
        else
        {
            System.out.println("Multiplying matrices of incorrect dimensions!");
            return null;
        }
    }

    public void display()
    {
        for(int i = 0; i<this.numRow; i++){
            for(int j = 0; j<this.numCol; j++){
                System.out.print(Float.toString(content[i][j]));
            }
            System.out.print('\n');;
        }
    }
}
