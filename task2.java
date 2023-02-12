package Java.HWork1;
// Задача 2. Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int minNum=2;
        int maxNum=1000;
        

        for (int i = minNum; i <= maxNum; i++) {
            int temp=0;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    temp=1;
                    break;
                } 
            }
            if (temp==0) System.out.print(i+",");  
        }      
    }
}
