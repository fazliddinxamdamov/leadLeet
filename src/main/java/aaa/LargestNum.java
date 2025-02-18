package aaa;

public class LargestNum {

    public String method(String num) {

        StringBuilder stringBuilder = new StringBuilder();

        int number = 0;
        int counter = 0;
        for (int i = 0; i < num.toCharArray().length; i++) {

            number = num.charAt(i);
            if (counter <= 3) {
                if (num.charAt(i) == num.charAt(i + 1)) {
                    stringBuilder.append(number);
                } else {
                    number = i + 1;
                }
                counter++;
            }

        }

        return stringBuilder.toString();
    }
}
