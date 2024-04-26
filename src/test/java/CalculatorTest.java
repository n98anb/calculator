import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @EnumSource(TypeOfOperation.class)
    public void enumTest(TypeOfOperation typeOfOperation) {
        assertEquals(typeOfOperation.getC(),
                CalculatorMain.testWithEnum(typeOfOperation.getA(), typeOfOperation.getB(), typeOfOperation));
    }

    /**
     * ожидаемый результат в "", разделитель запятая
     * в CalculatorMain.метод первое значение: a = слагаемое / уменьшаемое / множитель / делимое
     *                                         b = слагаемое / вычитаемое / множитель / делитель
     *                                         с = точность, необходимое количество знаков после запятой
     */

    @Test
    public void additionTest() {
        assertEquals("10,24", CalculatorMain.addition(6.111, 4.1301, 2));
        assertEquals("1000", CalculatorMain.addition(7, 993, 0));
    }

    @Test
    public void subtractionTest() {
        assertEquals("100,891", CalculatorMain.subtraction(1, -99.89107, 3));
        assertEquals("4", CalculatorMain.subtraction(10, 5.7, 0));
    }

    @Test
    public void multiplicationTest() {
        assertEquals("350,62", CalculatorMain.multiplication(175.31, 2, 2));
        assertEquals("48,0000800", CalculatorMain.multiplication(8, 6.00001, 7));
    }

    @Test
    public void divisionTest() {
        assertEquals("Нельзя делить на ноль", CalculatorMain.division(175.31, 0.0000, 2));
        assertEquals("200", CalculatorMain.division(1000, 5, 0));
    }
}
