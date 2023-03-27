import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> array1 = new ArrayList<>();
        List<String> array2 = new ArrayList<>();
        String resultado = "";
        for(int i = 0; i < 5; i++) {
            System.out.println("Escreva uma palavra:\n");
            String word = scan.nextLine();

            System.out.println("Escreva outra palavra:\n");
            String word2 = scan.nextLine();

            array1.add(word);
            array2.add(word2);
        }

        for(int i = 0; i < array1.size(); i++) {
            for(int j = 0; j < array2.size(); j++) {
                if(array1.get(i).equals(array2.get(j)) ) {
                    resultado = resultado + " " + array1.get(i);
                }
            }
        }

        System.out.println("A resposta é: " + resultado);

    }
}
