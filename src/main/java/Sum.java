public class Sum <T extends Number>{
    public double s = 0.0;
    public double sum (T[] array){
        for (T value: array) {
            s+= value.doubleValue();
        }
        return s;
    }
}
