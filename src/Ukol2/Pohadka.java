package Ukol2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Pohadka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<PohadkovaPostava> postavy = new ArrayList<>();
        postavy.add(new Princezna("prvni", "HHHhhhhh", 18));
        postavy.add(new Princezna("druha", "lox", 19));
        postavy.add(new Princezna("treti", "pirs", 15));
        postavy.add(new Drak("drak", 20));

        for(PohadkovaPostava p : postavy) {
            if (p instanceof Princezna) {
                System.out.println("Ahoj, " + p.getJmeno() + ". Jses spokojena ze svym jmenem?: ");
                System.out.println("1. Ano");
                System.out.println("2. Ne");
                int vyber = sc.nextInt();
                sc.nextLine();

                boolean beh = true;


                if (vyber == 1) {
                    System.out.println("Tve jmeno: " + p.getJmeno() + ", zustava se stejnim.");
                } else if (vyber == 2) {
                    do {
                        System.out.println("Chces zmenit jmeno(" + p.getJmeno() + ") nebo prijmeni(" + p.getPrijmeni() + ")?: ");
                        System.out.println("1. Jmeno");
                        System.out.println("2. Prijmeni");
                        System.out.println("3. Oba");
                        System.out.println("4. Ne");
                        int zmena = sc.nextInt();
                        sc.nextLine();
                        switch (zmena) {
                            case 1:
                                System.out.println("Tve jmeno je: " + p.getJmeno());
                                System.out.println("Zadej nove jmeno:");
                                String noveJmeno = sc.nextLine();
                                p.setJmeno(noveJmeno);
                                break;
                            case 2:
                                System.out.println("Tve prijmeni je: " + p.getPrijmeni());
                                System.out.println("Zadej nove prijmeni:");
                                String novePrijmeni = sc.nextLine();
                                p.setPrijmeni(novePrijmeni);
                                break;
                            case 3:
                                System.out.println("Tve jmeno je: " + p.getJmeno());
                                System.out.println("Zadej nove jmeno:");
                                String noveJmeno3 = sc.nextLine();
                                p.setJmeno(noveJmeno3);
                                System.out.println("Tve prijmeni je: " + p.getPrijmeni());
                                System.out.println("Zadej nove prijmeni:");
                                String novePrijmeni3 = sc.nextLine();
                                p.setPrijmeni(novePrijmeni3);
                                break;
                            case 4:
                                System.out.println("Tve jmeno zustava se stejnim.");
                                beh = false;
                                break;
                            default:
                                System.out.println("Spatni vyber.");
                                break;
                        }
                    } while (beh == true);
                } else {
                    System.out.println("Spatny vyber");
                }

            }

        }
        int nejvetsiVek = 0;
        for (PohadkovaPostava p : postavy) {
            if(nejvetsiVek < p.getVek()){
                nejvetsiVek = p.getVek();
            }
        }

        for (PohadkovaPostava p : postavy) {
            if(p.getVek() == nejvetsiVek){
                p.popis();
            }
        }

        for(PohadkovaPostava p : postavy){
            p.popis();
        }
    }
}
