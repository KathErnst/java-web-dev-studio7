package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD backStreetBoys = new CD("BackStreet's Back", "BackStreet Boys", "CD");
        DVD youveGotMail = new DVD("You've Got Mail", "Nora Ephron", "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        youveGotMail.spin();
        backStreetBoys.writeData();
        backStreetBoys.readData();
        youveGotMail.readData();

    }
}
