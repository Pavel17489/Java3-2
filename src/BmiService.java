public class BmiService {
    public int calculate(double heightInMetres, int bodyWeightInKilogram) {

        int index;
        index = (int) (bodyWeightInKilogram / Math.pow(heightInMetres, 2));

        return index;
    }
}
