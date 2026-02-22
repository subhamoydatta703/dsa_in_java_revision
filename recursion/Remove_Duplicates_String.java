package recursion;

public class Remove_Duplicates_String {

    static void removeDuplicates(String str, int i, boolean[] arr, StringBuilder newStr) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(i);
        if (arr[currChar - 'a'] == true)
            removeDuplicates(str, i + 1, arr, newStr);
        else {
            arr[currChar - 'a'] = true;
            removeDuplicates(str, i + 1, arr, newStr.append(currChar));

        }

    }

    public static void main(String[] args) {
        String str = "SubhamoyDatta";
        removeDuplicates(str.toLowerCase(), 0, new boolean[26], new StringBuilder(""));

    }
}
