package aaa;

public class FindTheDifference {


    public char findTheDifference(String s, String t) {

        int tInt = 0;
        for (char tChat : t.toCharArray()) {
            tInt += tChat;
        }

        int sInt = 0;
        for (char sChar : s.toCharArray()) {
            sInt += sChar;
        }

        return (char) (tInt - sInt);
    }
}
