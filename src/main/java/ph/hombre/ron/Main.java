package ph.hombre.ron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        RAE rae = new RAE();

        String output = rae.encrypt("Hello world!");

        System.out.println(output);

        String output2 = rae.decrypt(output);

        System.out.println(output2);
    }
}