package strings;

public class shortest_path {
    static float shortPath(String s) {
        int x = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N')
                y++;
            else if (s.charAt(i) == 'S')
                y--;
            else if (s.charAt(i) == 'W')
                x--;
            else if (s.charAt(i) == 'E')
                x++;
            else {
                System.out.print("Some Error occurred");
            }
        }
        int x1 = x * x, y1 = y * y;
        float path = (float) Math.sqrt(x1 + y1);
        return path;
    }

    public static void main(String[] args) {
        String s = "WNNSEE";
        System.out.println(shortPath(s));
    }
}
