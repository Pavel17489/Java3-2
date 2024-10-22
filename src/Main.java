public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.99;
        int bodyWeight = 98;

        int index = service.calculate(height, bodyWeight);
        System.out.println(index);

    }
}