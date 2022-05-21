public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60;
        double growth = 1.65;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);

    }
}
