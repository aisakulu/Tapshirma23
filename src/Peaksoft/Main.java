package Peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Randomly generated Array List Elements : ");
        fillArrayListRandomly(arrayList);
        
        getEvenNumber(arrayList);
        System.out.println();
        getOddNumber(arrayList);

    }

    private static void fillArrayListRandomly(ArrayList<Integer> randomNumber) {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            randomNumber.add(random.nextInt(100));
        }
        System.out.println(randomNumber);
    }

    private static  void getEvenNumber(ArrayList<Integer> arrayList) {
        System.out.println("These are Even Numbers: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) %2 == 0) {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
    }

    private static void getOddNumber(ArrayList<Integer> arrayList) {
        System.out.println("These are Odd Numbers: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) %2 == 1) {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
    }


}
