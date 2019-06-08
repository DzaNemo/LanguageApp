package link.languageapp.Spain;

public class SpanishWord {

    private String languageDefault;
    private String languageSpanish;

    private int imageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public SpanishWord(String languageDefault, String languageSpanish) {
        this.languageDefault = languageDefault;
        this.languageSpanish = languageSpanish;
    }

    public SpanishWord(String languageDefault, String languageSpanish, int imageResourceID) {
        this.languageDefault = languageDefault;
        this.languageSpanish = languageSpanish;
        this.imageResourceID = imageResourceID;
    }

    public String getLanguageDefault() {
        return languageDefault;
    }

    public String getLanguageSpanish() {
        return languageSpanish;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
