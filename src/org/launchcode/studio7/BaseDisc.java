package org.launchcode.studio7;

public abstract class BaseDisc implements DiscInterface {
    String title;
    String author;
    String discType;
    String dataCapacity; //MB or GB data
    Integer speedRPM;

    public BaseDisc(String title, String author, String discType) {
        this.title = title;
        this.author = author;
        this.discType = discType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getDataCapacity() {
        return dataCapacity;
    }

    public Integer getSpeedRPM() {
        return speedRPM;
    }
}
