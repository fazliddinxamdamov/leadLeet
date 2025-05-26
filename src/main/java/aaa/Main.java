package aaa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class Main {

    public static DateTimeFormatter fLocalDateTimeWithT = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");


    public static void main(String[] args) {

        System.out.println(phoneFormat("+998977495897"));
    }

    public static String phoneFormat(String phone) {

        phone = phone.replaceAll("[^0-9]", "");

        if (phone.length() == 12) {
            if (phone.startsWith("998")) return phone;
            if (phone.startsWith("000")) return phone.replaceFirst("000", "998");
        }

        if (phone.length() == 9) return "998" + phone;

        return "";
    }

    public static String getCardExpireFromDateTime(String time) {
        try {
            LocalDateTime localDateTime = parseReceiptTime(time);

            if (Objects.nonNull(localDateTime)) {
                int getYear = localDateTime.getYear() - 2000;
                int month = localDateTime.getMonthValue();

                return String.format("%s%s", getYear, month < 10 ? "0" + month : month);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "";
    }

    public static LocalDateTime parseReceiptTime(String date) throws Exception {
        if (hasText(date)) {
            try {
                return LocalDateTime.parse(date, fLocalDateTimeWithT        );
            } catch (Exception e) {
                throw new Exception("pattern should be like that : \"yyyy-MM-dd HH:mm:ss");
            }
        } else {
            return null;
        }
    }

    public static String fullNameForAML(UserProfile profile) {

        String fullName = "";
        if (isPresent(profile.getLastName())) {
            fullName = fullName + (profile.getLastName().charAt(0) + "***");
        }
        if (isPresent(profile.getFirstName())) {
            fullName = fullName + (!fullName.isEmpty() ? " " : "") + (profile.getFirstName().charAt(0) + "***");
        }
        if (isPresent(profile.getMiddleName())) {
            fullName = fullName + (!fullName.isEmpty() ? " " : "") + (profile.getMiddleName().charAt(0) + "***");
        }
        return fullName;
    }

    public static boolean isPresent(String str) {
        return hasText(str);
    }

    public static boolean hasText(String str) {
        return str != null && !str.isEmpty() && containsText(str);
    }

    private static boolean containsText(CharSequence str) {
        int strLen = str.length();

        for (int i = 0; i < strLen; ++i) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }

        return false;
    }
}
