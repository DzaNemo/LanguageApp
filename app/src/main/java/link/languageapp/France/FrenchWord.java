package link.languageapp.France;

public class FrenchWord {

    private String languageDefault;
    private String languageFrance;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public FrenchWord(String languageDefault, String languageFrance) {
        this.languageDefault = languageDefault;
        this.languageFrance = languageFrance;
    }

    public FrenchWord(String languageDefault, String languageFrance, int mImageResourceID) {
        this.languageDefault = languageDefault;
        this.languageFrance = languageFrance;
        this.imageResourceID = mImageResourceID;
    }

    public String getLanguageDefault() {
        return languageDefault;
    }

    public String getLanguageFrance() {
        return languageFrance;
    }

    public int getmImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }

}
