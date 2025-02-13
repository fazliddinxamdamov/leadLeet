package aaa;

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char sT : s.toCharArray()) {
            for (char sS : t.toCharArray()) {
                if (sT == sS) {
                    stringBuilder.append(sS);
                    break;
                }
            }
        }

        return stringBuilder.toString().equals(s);
    }
}
