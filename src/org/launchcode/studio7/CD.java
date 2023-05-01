package org.launchcode.studio7;

public class CD extends BaseDisc {

        String dataCapacity = "700 MB";
        Integer speedRPM = 400;
    public CD(String title, String author, String discType) {
        super(title, author, discType);
    }

    @Override
    public void spin() {
        System.out.println(getTitle() + " is spinning at " + speedRPM + " RPM.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing new song on " + getDiscType() + "...");
    }

    @Override
    public void readData() {
        System.out.println(getAuthor() + " PLAYING!");
    }
}
