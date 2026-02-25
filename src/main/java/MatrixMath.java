public class MatrixMath {

    public static byte[][] multiplyMatrices(byte[][] A, byte[][] B){
        if((A[0].length != B.length)){
            throw new IllegalArgumentException("Кількість стовпчиків А не збігається з рядками B!");
        }
        if(A == null || B == null){
            throw new NullPointerException("Матриці порожні!");
        }

        byte[][] C = new byte [A.length][B[0].length];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B[0].length; j++){
                int sum = 0;
                for(int k = 0; k < A[0].length; k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = (byte) sum;
            }
        }
        return C;
    }

    public static int sumRowMins(byte[][] C){
        int sum = 0;
        for(int i = 0; i < C.length; i++){
            byte rowMin = C[i][0];
            for(int j =0; j < C[i].length; j++){
                if(C[i][j] < rowMin){
                    rowMin = C[i][j];
                }
            }
            sum += rowMin;
        }
        return sum;
    }

}
