package Java_LaninMS.Seminar1;

import java.util.Scanner;

/**
 * Task1
 */
public class Task3 {
 
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        System.out.println("Выберите одну из функций калькулятора: \n 1.Cложение \n 2.Вычитание \n 3.Умножение \n 4.Деление \n 5.Факториал" );
       
        Scanner sc = new Scanner(System.in);

        System.out.printf("Введите функцию: ");
        
        int c = sc.nextInt();
        double a, b;
        double d = 1;
        System.out.printf("Введите число а: ");
        a = sc.nextInt();
        System.out.printf("введите число b: ");
        b = sc.nextInt();
        
        switch(c) {
            
            case(1) : {
                d = a + b;
                System.out.printf("Ответ: %.0f\n",d);
                break;
            } 
            case(2) : {
                d = a - b;
                System.out.printf("Ответ: %.0f\n",d);
                break;
            }
            case(3) : {
                d = a * b ;
                System.out.printf("Ответ: %.0f\n",d);
                break;
            }
            case(4) : {
                d = a / b;
                System.out.printf("Ответ: %s",d);
                break;
            }
            case(5) : {
                for(int i = 1; i <= a; i++ ){
                    d = d * i;
                }
                System.out.printf("Ответ: %.0f\n",d);
                break;
            }
            default :
                System.out.println("Функция находится в разработке, пожадуйста подождите");
            break;
        }

    }
}
