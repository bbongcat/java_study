package day15.api.util.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysExample {

    public static void main(String[] args) {

        char[] arr1 = {'J', 'A', 'V', 'A'};
        //char[] arr2 = arr1; // 배열 복사가 아닌 arr1 배열의 주소값만 복사해온 것

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);

        char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);

        arr1[2] = 'F';
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        // 배열 정렬
        Integer[] numbers = {98, 84, 100, 12, 23, 18, 35};
        System.out.println("정렬 전: " + Arrays.toString(numbers));

        // 오름차 정렬
        Arrays.sort(numbers);
        System.out.println("정렬 후: " + Arrays.toString(numbers));

        // 내림차 정렬
        /*
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[numbers.length - (i+1)];
        }
        */

        Arrays.sort(numbers, Collections.reverseOrder()); // 배열이 객체여야 함
        System.out.println("내림차 정렬: " + Arrays.toString(numbers));

    }
}
