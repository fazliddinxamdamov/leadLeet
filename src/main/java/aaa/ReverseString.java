package aaa;

public class ReverseString {

    public void reverseString(char[] s) {

        for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
            s[j] = s[i];
            j--;
        }

        for (char c : s) {
            System.out.print(c);
        }
    }
}
