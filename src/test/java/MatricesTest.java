import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MatricesTest {

    @Test
    void testMultiplyMatrices(){
        byte[][] A = {{1, 2, 3},
                      {3, 4, 5},
                      {-2, 1, -3} };
        byte[][] B = {{1},
                      {0},
                      {-6}};
        byte[][] expectedResult = {{-17},
                                   {-27},
                                   {16}};

        assertArrayEquals(expectedResult, MatrixMath.multiplyMatrices(A, B), "Множення матриць не вдалося");
    }


    @Test
    void testSumRowMins(){
        byte[][] C = {{10, -1, 2},
                      {12, 4, 5}};

        int expectedResult = 3;

        assertEquals(expectedResult, MatrixMath.sumRowMins(C),"Сума найменших елементів рядків матриці некоректна");
    }

    @Test
    void testIllegalArgumentThrow(){
        byte[][] A = {{1,0,1}};
        byte[][] B =  {{11, -1},
                       {1, 0}};

        try{
            MatrixMath.multiplyMatrices(A, B);
            fail("Повинен був прокинутий вийняток IllegalArgumentException");
        } catch (IllegalArgumentException e){

        }
    }


}

