
public class Main{

    public static void main(String[] args) {
            try {
                byte[][] A = {{2, 2, 3},
                              {4, 5, 6},
                              {1, 2, 3}};
                byte[][] B = {{2,2,},
                              {3,4},
                              {5,6}};

                byte[][] resultMatrix = MatrixMath.multiplyMatrices(A, B);
                MatrixUtils.printMatrix("Результат матричного добутку:", resultMatrix);
                System.out.println("Сума найменших елементів кожного рядка матриці: " + MatrixMath.sumRowMins(resultMatrix));

            } catch(IllegalArgumentException e){
                System.out.println("Помилка даних");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Помилка індексів");
            }catch(NullPointerException e){
                System.out.println("Порожні матриці");
            }catch(Exception e){
                System.out.println("Помилка у матриці");
            }
        }
    }
