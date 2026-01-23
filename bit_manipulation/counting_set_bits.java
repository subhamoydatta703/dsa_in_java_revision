package bit_manipulation;

public class counting_set_bits {
    static int countSetBits(int n){
        int count =0;
        while(n != 0){
            n = (n &(n-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(countSetBits(12));
    }
}
