import java.text.DecimalFormat;


public class CalculatorMain {

    public static String testWithEnum(double a, double b, TypeOfOperation type) {
        double x;
        switch (type) {
            case ADDITION:
                x = a + b;
                return x + "";
            case SUBTRACTION:
                x = a - b;
                return x + "";
            case MULTIPLICATION:
                x = a * b;
                return x + "";
            case DIVISION:
                if (b == 0.0) {
                    try {
                        x = (int) a / 0;
                    } catch (ArithmeticException e) {
                        return "Нельзя делить на ноль";
                    }
                }
                x = a / b;
                return x + "";
        }

        return "Неверное значение оператора";
    }

    // a + b;
    public static String addition(double a, double b, int symbolsAfterDot) {
        String strSymbolsAfterComma = "#0";
        if (symbolsAfterDot >= 1) {
            strSymbolsAfterComma = "#0.";
        }
        for (int i = 0; i < symbolsAfterDot; i++) {
            strSymbolsAfterComma = strSymbolsAfterComma + "0";
        }
        return new DecimalFormat(strSymbolsAfterComma).format(a + b);
    }

    // a - b;
    public static String subtraction(double a, double b, int symbolsAfterDot) {
        String strSymbolsAfterComma = "#0";
        if (symbolsAfterDot >= 1) {
            strSymbolsAfterComma = "#0.";
        }
        for (int i = 0; i < symbolsAfterDot; i++) {
            strSymbolsAfterComma = strSymbolsAfterComma + "0";
        }
        return new DecimalFormat(strSymbolsAfterComma).format(a - b);
    }

    // a * b;
    public static String multiplication(double a, double b, int symbolsAfterDot) {
        String strSymbolsAfterComma = "#0";
        if (symbolsAfterDot >= 1) {
            strSymbolsAfterComma = "#0.";
        }
        for (int i = 0; i < symbolsAfterDot; i++) {
            strSymbolsAfterComma = strSymbolsAfterComma + "0";
        }
        return new DecimalFormat(strSymbolsAfterComma).format(a * b);
    }

    // a / b;
    public static String division(double a, double b, int symbolsAfterDot) {
        if (b == 0.0) {
            return "Нельзя делить на ноль";
        }
        String strSymbolsAfterComma = "#0";
        if (symbolsAfterDot >= 1) {
            strSymbolsAfterComma = "#0.";
        }
        for (int i = 0; i < symbolsAfterDot; i++) {
            strSymbolsAfterComma = strSymbolsAfterComma + "0";
        }
        return new DecimalFormat(strSymbolsAfterComma).format(a / b);
    }
}