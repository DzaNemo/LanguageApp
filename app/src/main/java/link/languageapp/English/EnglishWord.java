package link.languageapp.English;

public class EnglishWord {

    private String languageDefault;
    private String englishLanguage;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public EnglishWord(String languageDefault, String englishLanguage) {
        this.languageDefault = languageDefault;
        this.englishLanguage = englishLanguage;
    }

    public EnglishWord(String languageDefault, String englishLanguage, int imageResourceID) {
        this.languageDefault = languageDefault;
        this.imageResourceID = imageResourceID;
    }

    public String getLanguageDefault() {
        return languageDefault;
    }

    public String getEnglishLanguage() {
        return englishLanguage;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
