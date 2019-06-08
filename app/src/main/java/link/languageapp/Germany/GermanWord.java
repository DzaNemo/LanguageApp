package link.languageapp.Germany;

public class GermanWord {

    private String languageDefault;
    private String languageGermany;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public GermanWord(String languageDefault, String languageGermany) {
        this.languageDefault = languageDefault;
        this.languageGermany = languageGermany;
    }

    public GermanWord(String languageDefault, String languageGermany, int imageResourceID) {
        this.languageDefault = languageDefault;
        this.languageGermany = languageGermany;
        this.imageResourceID = imageResourceID;
    }

    public String getLanguageDefault() {
        return languageDefault;
    }

    public String getLanguageGermany() {
        return languageGermany;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
