public class MatrixUtils {

    public static void printMatrix(String a, byte[][] C){
        System.out.println("Результат матричного добутку:");

        for(int i =0; i < C.length; i++){
            for(int j =0; j < C[i].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
