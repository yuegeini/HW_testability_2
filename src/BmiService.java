public class BmiService {
    public int calculate(double height, int wieght) {
        int index = (int) (wieght / (height * height));

        return index;
    }
}
