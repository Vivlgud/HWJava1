package Java.HWork1;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num=sc.nextInt();
        sc.close();
        
        int sum=0;
        int fakt=1;
        for (int i = 1; i <= num; i++) {
            sum+=i;
            fakt*=i;
        }
        System.out.println("Треугольное число от числа "+num+" равно "+sum);
        System.out.println("Факториал числа " + num+" равен "+fakt);
        
    }
    
}
