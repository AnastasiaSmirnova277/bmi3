public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 98;
        double height = 1.87;
        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("BMI: " + bmiIndex);
    }
}