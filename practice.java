public class practice {
// Method overloading

    static int sum(int x, int y){
        return x+y;
    } 
    
static float sum(float x, float y){
    return x+y;
}

// Reverse string:
    static void reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
    public static void main(String[] args) {
        
        System.out.println(sum(6, 4));
        System.out.println(sum(3.33f, 5.55f));

        reverse("JAVA");

    }
}
