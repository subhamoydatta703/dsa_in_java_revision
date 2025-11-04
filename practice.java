public class practice {
// Method overloading

    static int sum(int x, int y){
        return x+y;
    } 
    
static float sum(float x, float y){
    return x+y;
}

static void avg(float a, float b, float c){
    float AVG = (a+b+c)/3;
    System.out.print(AVG);
}
// Reverse string:
    static void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }

    static boolean isEven(int x){
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        // System.out.println(sum(6, 4));
        // System.out.println(sum(3.33f, 5.55f));

        // reverse("JAVA");
        // avg(3, 5, 4);
        System.out.print(isEven(5));

    }
}
