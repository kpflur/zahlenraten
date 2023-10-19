import java.util.Scanner;

public class Main {

    static int get_random_number(){

        int random_number = 0;
        while (random_number == 0){
            random_number = (int)(Math.random()*101);
        }
        //System.out.println(random_number);
        return random_number;
    }
    static int input_number(){
        int choosed_number = -1;
        Scanner myScanner = new Scanner(System.in);
        while (0 >= choosed_number || choosed_number > 100){
            System.out.println("Bitte gebe eine Zahl von 1-100 ein:\t");
            try{
                choosed_number = Integer.parseInt(myScanner.nextLine());
            }
            catch (Exception e){
                System.out.println("Falsche Eingabe! Bitte gebe eine Zahl von 1-100 ein.");
            }
        }
        return choosed_number;
    }

    static int get_difference(int choosed_number, int random_number){
        return Math.abs(choosed_number - random_number);
    }

    static void give_hint(int difference){
        if (difference > 20){
            System.out.println("Kalt🥶");
        }
        else if (difference < 20 && difference >= 10) {
            System.out.println("Lauwarm⛅");
        }
        else if (difference < 10 && difference >= 3) {
            System.out.println("Warm🌞");
        }
        else if (difference < 3 && difference != 0) {
            System.out.println("Heiß🥵");
        }
        else if (difference == 0) {
            System.out.println("(☞ﾟヮﾟ)☞");
        }
    }

    static String try_again(){
        Scanner myScanner = new Scanner(System.in);
        String retry;
        do {
            System.out.println("Möchten Sie nochmal spielen? y/n");
            retry = myScanner.nextLine();
        } while (!retry.equals("y") && !retry.equals("n"));

        return retry;
    }

    public static void main(String[] args) {
        String do_continue = "y";
        int random_zahl = get_random_number();
        while(do_continue.equals("y")){
            while(true){
                int picked_number = input_number();
                int difference = get_difference(random_zahl, picked_number);
                //System.out.println(random_zahl);
                give_hint(difference);
                if (picked_number == random_zahl){
                    System.out.println("Du hast die richtige Zahl erraten");
                    break;
                }
            }
            do_continue = try_again();
            if (do_continue.equals("y")){
                random_zahl = get_random_number();
            }
        }
    }
}

//Änderung
// 2 Änderung

