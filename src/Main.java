public class Main {
    public static void main(String[] args) {
        BmiService ind = new BmiService();

        float bmi1 = ind.calculate(45.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi1);
        System.out.println();

        float bmi2 = ind.calculate(63.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi2);
        System.out.println();

        float bmi3 = ind.calculate(74.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi3);
        System.out.println();

        float bmi4 = ind.calculate(90.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi4);
        System.out.println();

        float bmi5 = ind.calculate(100.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi5);
        System.out.println();

        float bmi6 = ind.calculate(112.5F, 1.65F);
        System.out.printf("Ваш индекс массы тела (кг/м2) = " + "%.1f", bmi6);
        System.out.println();
    }
}
