package aaa;

public class MaxScoreAfterSplittingString {

    public int maxScore(String s) {

        int one = 0;
        int zero = 0;
        int best = Integer.MIN_VALUE;

        for (int i = 0; i < s.toCharArray().length - 1; i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero++;
            }

            best = Math.max(best, (zero - one));
        }

        return best + one;
    }
}
