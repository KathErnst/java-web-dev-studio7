package org.launchcode.studio7;

public class DVD extends BaseDisc{


        String dataCapacity = "17 GB";
        Integer speedRPM = 1200;
    public DVD(String title, String author, String discType) {
        super(title, author, discType);
    }

    @Override
    public void spin() {
        System.out.println(getTitle() + " is spinning at " + speedRPM + " RPM.");
    }

    @Override
    public void writeData() {
        System.out.println("Writing new video on " + getDiscType() + "...");
    }

    @Override
    public void readData() {
        System.out.println(getTitle() + " PLAYING!");
    }
}
