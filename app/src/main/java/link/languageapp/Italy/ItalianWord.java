package link.languageapp.Italy;

public class ItalianWord {

    private String languageDefault;
    private String italianLanguage;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public ItalianWord(String languageDefault, String italianLanguage) {
        this.languageDefault = languageDefault;
        this.italianLanguage = italianLanguage;
    }

    public ItalianWord(String languageDefault, String italianLanguage, int imageResourceID) {
        this.languageDefault = languageDefault;
        this.italianLanguage = italianLanguage;
        this.imageResourceID = imageResourceID;
    }

    public String getLanguageDefault() {
        return languageDefault;
    }

    public String getItalianLanguage() {
        return italianLanguage;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
