package Ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomGen = new Random();
        int[] a = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = randomGen.nextInt(100);
        }

        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }

        System.out.println('\n');

        for(int i = 0; i < 10; i++){
            for(int j = i+1; j < 10; j++){
                if(a[i] > a[j]){
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }

    }
}