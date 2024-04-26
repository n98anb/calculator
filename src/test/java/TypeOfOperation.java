public enum TypeOfOperation {
    ADDITION(50, 2, "52.0"),
    SUBTRACTION(10, 4, "6.0"),
    MULTIPLICATION(20, 5, "100.0"),
    DIVISION(48, 0, "Нельзя делить на ноль");
    // a = слагаемое / уменьшаемое / множитель / делимое
    private double a;

    // b = слагаемое / вычитаемое / множитель / делитель
    private double b;

    // с = сумма / разность / произведение / частное
    private String c;

    TypeOfOperation(double a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getC() {
        return c;
    }


    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setС(String c) {
        this.c = c;
    }

}
