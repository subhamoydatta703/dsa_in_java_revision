public class type_casting {
    public static void main(String[] args) {
        // type casting= convert the value of a variuable of one data type to another data type
        float a = 12.66f;
        int b = (int) a;
         System.out.println(((Object)b).getClass().getSimpleName()); 
        //  this is ujsed to check the data type of variable b
        System.out.print(b);
    }
}
