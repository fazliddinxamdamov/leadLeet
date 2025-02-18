package aaa;

public class Base7 {

    public String convertToBase7(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        num = Math.abs(num);

        for (int i = 0, q = 0;  i <= num; i++) {

            q = num % 7;
            num = num / 7;

            stringBuilder.append(q);
        }

        return stringBuilder.toString();
    }



}
