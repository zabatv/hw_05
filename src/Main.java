public class Main {
    public static void main(String[] args) {
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        int[] masive1 = new int[3];
        masive1[0] = 1;
        masive1[1] = 2;
        masive1[2] = 3;

        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        double[] masive2 = {1.57, 7.65, 9.976};

        //Произвольный массив.(У меня логический) Тип и количество данных определите сами. Самостоятельно выберите способ создания массива
        boolean[] logickmasive = new boolean[7];

        logickmasive[0] = true;
        logickmasive[1] = true;
        logickmasive[2] = false;
        logickmasive[3] = false;
        logickmasive[4] = true;
        logickmasive[5] = true;
        logickmasive[6] = true;//зашифрованая буква g (1100111) P.S. БУТТО У МЕНЯ ЕСТЬ ВРЕМЯ ЧТОБ ЭТО ДЕЛАТЬ!

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        for (int a = 0; a < masive1.length; a++) {

            if (masive1[a] % 2 != 0) {
                masive1[a] = masive1[a] + 1;
            }


            for (int i = masive1.length - 1; i >= 0; i--) {
                System.out.print(masive1[i]);
                if (i > 0) {
                    System.out.print(", ");
                } else {
                    System.out.println();
                }


            }


        }
    }
}
