public class type_conversion {
    public static void main(String[] args) {
        // size= destination type > source type
        // for example we con convert int to long but can't convert long into int due to this may lost some data
        int a = 25;
        long b = a;
        System.out.print(b);
    }
}
