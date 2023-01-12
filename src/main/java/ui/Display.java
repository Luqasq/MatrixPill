package ui;

import citizen.Citizen;

import static org.matrixredorbluepill.NeoHadToChoose.World_Name;

public class Display {
    public static final String PICK_PILL =
            """
                    1. Red pill
                    2. Blue pill""";

    public void showWelcomeMessage() {
        System.out.println(" Welcome to " + World_Name);
    }

    public void selectMessage() {
        System.out.println(" Please select the pill ! ");
    }

    public void showPillMenu() {
        System.out.println(PICK_PILL);
    }


}



