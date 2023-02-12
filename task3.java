package Java.HWork1;
// Задача 3. Реализовать простой калькулятор

import java.util.*;

public class task3 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1=sc.nextInt();
            System.out.print("Введите второе число: ");
            int num2=sc.nextInt();
            System.out.print("Введите арифметическое действие (+,-,*,/): ");
            String action=sc.next();
            sc.close();
            int res=0;
            String sp=" ";

            switch (action) {
                case "+":
                    res=num1+num2;
                    System.out.println(num1+sp+action+sp+num2+" = "+res);
                    break;
            
                case "-":
                    res=num1-num2;
                    System.out.println(num1+sp+action+sp+num2+" = "+res);
                    break;    

                case "*":
                    res=num1*num2;
                    System.out.println(num1+sp+action+sp+num2+" = "+res);
                    break;

                case "/":
                    if(num2!=0) {
                    res=num1*num2;
                    System.out.println(num1+sp+action+sp+num2+" = "+res);
                    break;}
                    else {
                        System.out.println("Делить на ноль нельзя.");
                        break;
                    }
            }
    }
}
