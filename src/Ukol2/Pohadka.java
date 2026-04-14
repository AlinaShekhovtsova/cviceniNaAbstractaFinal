package Ukol2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Pohadka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Princezna> princezny = new ArrayList<>();
        List<Drak> draky = new ArrayList<>();
        princezny.add(new Princezna("prvni", 18));
        princezny.add(new Princezna("druha", 19));
        princezny.add(new Princezna("treti", 15));
        draky.add(new Drak("drak", 20));


        boolean beh = true;
        for (Princezna p : princezny){
            System.out.println("Chces zmenit sve jmeno?: ");
            System.out.println("1. Ano");
            System.out.println("2. Ne");
            int vyber = sc.nextInt();
            sc.nextLine();
            do{
            switch (vyber){
                case 1:
                    System.out.println("Zadej nove jmeno: ");
                    String noveJmeno = sc.nextLine();
                    p.setJmeno(noveJmeno);
                    break;
                case 2:
                    System.out.println("Tve jmeno zustava se stejnim");
                    break;
                default:
                    System.out.println("Spatny vyber");
                    break;
            }
            } while (beh);

            System.out.println("Jses spokojena ze svym jmenem?: ");
            System.out.println("1. Ano");
            System.out.println("2. Ne");
            int spokojenost = sc.nextInt();
            sc.nextLine();
            switch (spokojenost){
                case 1:
                    beh = false;
                break;
                case 2:
                    beh = true;
                    break;
                default:
                    break;
            }


        }
    }
}
