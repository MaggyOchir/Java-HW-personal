package org.example.e114;

public class Method {
    int addArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int multArray(int[] arr) {
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }
        return mult;
    }

    int subtArray(int[] arr) {
        int subt = 30;
        for (int i = 0; i < arr.length; i++) {
            subt -= arr[i];
        } return subt;
    }
}

