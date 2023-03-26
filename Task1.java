package Java_LaninMS.Seminar1;

import java.util.Scanner;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите чсло N: ");
        int N = sc.nextInt();
        int count = 1;
        System.out.println("N-ое треугольное число");
        for( int i = 0; i <= N; i++){
            count+= i;
        }
        System.out.printf("Ответ %d \n",count);
        
        int result = 1; 
        System.out.println("Факторал числа");
        for( int i = 1; i <= N ; i++){
            result = result * i;
        }
        System.out.printf("Ответ: %d \n",result);

    }
}
