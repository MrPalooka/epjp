package s030;

public class Unary {
    public static void main(String[] args) {
        int value = 1;

        System.out.println(value); // 1

        System.out.println(++value); // 2 incrementa e stampa il valore incrementato
        System.out.println(--value); // 1

        System.out.println(value++); // 1 stampa il valore e poi lo incrementa
        System.out.println(value); // 2
        System.out.println(value--); // 2
        System.out.println(value); // 1

        System.out.println(+value); // 1
        System.out.println(-value); // -1
    }
}
