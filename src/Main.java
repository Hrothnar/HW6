public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 0; i <= 10; i++) { // i++ == i = i + 1
            System.out.println("Итерация цикла i " + i);
        }
        //task2
        for (int u = 10; u > 0; u--){
            System.out.println("Итерация цикла u " + u);
        }
        //task3
        for (int y = 0; y <= 17; y = y + 2) {
            System.out.println("Итерация цикла y " + y);
        }
        //task4
        for (int t = 10; t > -11; t--) {
            System.out.println("Итерация цикла t " + t);
        }
        //task2.1
        for (int r = 1904; r < 2097; r = r + 4) {
            System.out.println(r + " год является високосным");
        }
        //task2.2
        for (int e = 7; e < 100; e = e + 7) {
            System.out.println("Итерация цикла e " + e);
        }
        //task2.3
        for (int w = 1; w < 600; w = w * 2) {
            System.out.println("Итерация цикла w " + w);
        }
        //task3.1
        int deposit = 29000;
        int total = 0;
        for (int a = 0; a <13; a++) {
            total = total + total /100;
            total = total + deposit;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
        }
    }
}