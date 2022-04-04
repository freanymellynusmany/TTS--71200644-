package com.rplbo.tocm;

public class main_71200644 {
    static double convertToInches(int cm){
        double inch = 0.3937 * cm;
        double feet = 0.0328 * cm;
        System.out.printf("value in inches is: %.2f \n",inch );
        System.out.printf("Value in feet is: %.2f", feet);
        return 0;
    }
    public static void main( String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in centimeter: ");
        int cm = sc.nextInt();

        convertToInches(cm);

    };

}
