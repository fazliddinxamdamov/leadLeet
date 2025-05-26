package DataStructure.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A1 {

    static int[] arr = {12, 13, 1, 10, 34, 1};

    public int getAlternates1() {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public int alternatives2() {

        Arrays.sort(arr);
        return arr[arr.length - 1];

    }

    public int secondLarge() {

        int n = arr.length;

        int largest = -1;
        int secondLarge = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLarge && arr[i] != largest) {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }

    public List<Integer> get3Large() {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                third = second;
                second = first;
                first = x;
            }

            if (x > second && x != first) {
                third = second;
                second = x;
            }

            if (x > third && x != first && x != second) {
                third = x;
            }
        }

        List<Integer> res = new ArrayList<>();

        if (first == Integer.MIN_VALUE) return res;
        res.add(first);

        if (second == Integer.MIN_VALUE) return res;
        res.add(second);

        if (third == Integer.MIN_VALUE) return res;
        res.add(third);

        return res;
    }

    public boolean isSorted (int[] arr) {

        int length = arr.length;

        if (length == 0 || length == 1) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }

}
