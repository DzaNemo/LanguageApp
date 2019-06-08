package link.languageapp.Russia;

public class RussianWord {

    private String defaultLanguage;
    private String russianLanguage;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public RussianWord(String defaultLanguage, String russianLanguage) {
        this.defaultLanguage = defaultLanguage;
        this.russianLanguage = russianLanguage;
    }

    public RussianWord(String defaultLanguage, String russianLanguage, int imageResourceID) {
        this.defaultLanguage = defaultLanguage;
        this.russianLanguage = russianLanguage;
        this.imageResourceID = imageResourceID;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public String getRussianLanguage() {
        return russianLanguage;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
