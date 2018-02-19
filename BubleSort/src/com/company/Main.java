package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array={30, 2, 10, 4, 6};
        int length=  array.length;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length -1; j++){
                if(array[j]>array[j+1]){
                    int k= array[j]; // Присвоюємо елементу массива тимчасову змінну
                    array[j]=array[j+1];
                    array[j+1]= k;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");}

    }
}
