package mini_Calculater;

import java.util.Scanner;

public class Parent {

 int type;
 int previous;   

 public Parent(){
    type = 0;
    previous = 0;

 }
    
public void calcuat(int type){
switch(type){

    case 1:{
      System.out.println("Add");
      break;
    }
    case 2:{
        System.out.println("Subtract");
        break;
    }case 3:{
        System.out.println("Multiplication");
        break;
    }case 4:{
        System.out.println("Divide");
        break;
    }default:
    {
        System.out.println("Enter valid Option");
        break;
    }
    
}
}

public static void main(String[] args) {
     System.out.println("Please Select Option \n"+"1 Add\n"+"2 Subtract\n"+"3 Multiplication \n"+"4 Divide\n");
       
     try (Scanner sc = new Scanner(System.in)) {
        int num = sc.nextInt();

         Parent  obj = new Parent();
         obj.calcuat(num);
    }

    }
}
