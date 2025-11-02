public class practice {
// Method overloading

    static int sum(int x, int y){
        return x+y;
    } 
    
static float sum(float x, float y){
    return x+y;
}
    public static void main(String[] args) {
        
        System.out.println(sum(6, 4));
        System.out.print(sum(3.33f, 5.55f));



    }
}
