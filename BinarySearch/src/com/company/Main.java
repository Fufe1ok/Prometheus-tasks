package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] data = {3, 6, 7, 10, 34, 56, 60, 125, 456, 1290};
        int numberToFind = 6;
        int length = data.length;
        int low = 0;
        int hight = length - 1;

        while (low <= hight) {
            int mid = (hight + low) / 2;

            if (numberToFind == data[mid]) {
                System.out.print(data[mid]); //*Якщо потрібно знайти порядок числа в массиві, а не саме число
                                             //то потрібно зробити заміну - (data[mid]) на  (mid)
                                             // хз чого так, але воно працює.
                return;
            } else if (numberToFind > data[mid]) {
                low = mid + 1;
            } else {
                hight = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
