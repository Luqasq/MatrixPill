package org.matrixredorbluepill;

import citizen.Citizen;
import ui.Display;

import java.io.InputStream;
import java.util.Scanner;

public class NeoHadToChoose {
    public static final String World_Name = " MATRIX ! ";

    public static void main(String[] args) {
        Display ui = new Display();
        ui.showWelcomeMessage();
        ui.selectMessage();
        ui.showPillMenu();
        Citizen morpheus = new Citizen(" Morpheus ", " Daniel ");
        Citizen neo = new Citizen(" Neo ", " Anderson ");
        String k = readFromKeyboard();
        neo.selectPill(k);
        int option = Integer.parseInt(k);
        if (option < 1 || option > 2) {
            System.out.println(" Not a valid option ! ");
            return;
        }
        if (option == 1) {
            System.out.println(" You choose the red pill ! ");
        }
        if (option == 2) {
            System.out.println(" You choose the blue pill ! ");
        }
        morpheus.type();
    }


    private static String readFromKeyboard() {
        InputStream in = System.in;
        Scanner keyboard = new Scanner(in);
        return keyboard.next();


    }
}