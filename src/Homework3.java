import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int numMonth = 3;
        System.out.println("Управляющие конструкции.Задача 1.");
        switch (numMonth) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
        }
        System.out.println("Управляющие конструкции.Задача 2.");
        if (numMonth == 12 || numMonth == 1 || numMonth == 2) {
            System.out.println("Zima");
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5) {
            System.out.println("Vesna");
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8) {
            System.out.println("Leto");
        } else {
            System.out.println("Osen");
        }
        System.out.println("Управляющие конструкции.Задача 3.");
        System.out.println("Введите температуру на улице t=");
        Scanner temp = new Scanner(System.in);
        int t = temp.nextInt();
        if (t > -5) {
            System.out.println("Teplo");
        } else if (t > -20) {
            System.out.println("Normalno");
        } else {
            System.out.println("Holodno");
        }
        System.out.println("Управляющие конструкции.Задача 4");
        System.out.println("Определение цвета радуги по номеру от 1 до 7");
        System.out.println("Введите пожалуйста число от  1 до 7");
        Scanner raduga = new Scanner(System.in);
        int radug = raduga.nextInt();
        if (radug < 1 || radug > 7) {
            System.out.println("Введено неправильное значение. Введите от 1 до 7");
        } else {
            switch (radug) {
                case 1:
                    System.out.println("Krasnyj");
                    break;
                case 2:
                    System.out.println("Orange");
                    break;
                case 3:
                    System.out.println("Zoltyj");
                    break;
                case 4:
                    System.out.println("Zelenyj");
                    break;
                case 5:
                    System.out.println("Goluboj");
                    break;
                case 6:
                    System.out.println("Sinij");
                    break;
                case 7:
                    System.out.println("Fioletowyj");
                    break;
            }
            System.out.println("Cykly for. Zadacza 1.");
            for (int i = 1; i < 100; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
            System.out.println("VVeditie celoje polozytelnoje czyslo");
            Scanner czyslo = new Scanner(System.in);
            int czysl = czyslo.nextInt();
            int sum1 = 0;
            for (int j = 1; j <= czysl; j++) {

                sum1 = sum1 + j;

            }
            System.out.println(sum1);
            int i = 7;
            while (i < 98) {
                System.out.print(i + "  ");
                i += 7;
            }
            int a = 0;
            for (int i1 = 0; i1 < 11; i1++) {
                System.out.println(a);
                a -= 5;
            }
            int b = 0;
            for (int a2 = 10; a2 <= 20; a2++) {
                b = a2 * a2;
                System.out.println(b);
            }
        }
        int a = 1, b = 2, c = a + b;
        for (int i = 0; i < 50; i++) {
            System.out.print(c+"  ");
            a = b;
            b = c;
            c=a+b;
        }
for (int i=9;i<=20;i++){
    System.out.println(i*i);
}
    }
}




