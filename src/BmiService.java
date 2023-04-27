public class BmiService {
    public int calculate(double weight, double height) {
        int result;
        double height2 = height * height; //  ИМТ = вес / рост 2

            result = (int) (weight / height2);

        return result;
    }
}
