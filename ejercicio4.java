/*
4. Programa que muestre en lineas separadas lo siguiente: ZYWXVUTSRQPONMLKJIHGFEDCBA, YWXVUTSRQPONMLKJIHGFEDCBA, WXVUTSRQPONMLKJIHGFEDCBA, ...., DCBA, CBA, BA, A.
 */
public class ejercicio4 {
    public static void main(String[] args) {
        for (char i = 'Z'; i >= 'A'; i--) {
            for (char j = i; j >= 'A'; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}