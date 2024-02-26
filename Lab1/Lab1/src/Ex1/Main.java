package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char option = ' ';
        float re;
        float im;
        Scanner scanner = new Scanner(System.in);


        while(option != 'q'){

            System.out.println("Select an operation: + to add, - to substract, * to multiply, q to exit");
            option = scanner.nextLine().charAt(0);

            if(option == 'q')
            {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Input the real part of the first number: ");
            re = scanner.nextFloat();
            System.out.println("Input the imaginary part of the first number: ");
            im = scanner.nextFloat();
            ComplexNum num1 = new ComplexNum(re, im);

            System.out.println("Input the real part of the second number: ");
            re = scanner.nextFloat();
            System.out.println("Input the imaginary part of the second number: ");
            im = scanner.nextFloat();
            ComplexNum num2 = new ComplexNum(re, im);

            ComplexNum res = null;
            switch (option){
                case '+':
                    res = ComplexNum.add(num1, num2);
                    break;
                case '-':
                    res = ComplexNum.substract(num1, num2);
                    break;
                case '*':
                    res = ComplexNum.multiply(num1, num2);
                    break;
                case 'q':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid operation selected, restarting...");
                    break;
            }

            if(res != null){
                System.out.println("The result is: ");
                res.display();
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}