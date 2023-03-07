package dAy2;

import java.util.Scanner;

public class Table {

public static void genTable(int number){

    for(int i =1;i<=10;i++){

        System.out.println(number +"*"+i+"="+ number*i);
    }
}


    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number ");
            int table = sc.nextInt();
             Table.genTable(table);
            }
        }

    }

