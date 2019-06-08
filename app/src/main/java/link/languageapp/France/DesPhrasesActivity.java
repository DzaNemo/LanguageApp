package link.languageapp.France;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class DesPhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FrenchWord> frenchWords = new ArrayList<FrenchWord>();
        //words.add("one");
        frenchWords.add(new FrenchWord("Dobar dan","Bonjour"));
        frenchWords.add(new FrenchWord("Zovem se...","Je m'appelle ..."));
        frenchWords.add(new FrenchWord("Kako ste?","Comment ça va?"));
        frenchWords.add(new FrenchWord("Hvala","Merci"));
        frenchWords.add(new FrenchWord("Ne znam","Je ne sais pas"));
        frenchWords.add(new FrenchWord("Oprostite","Excusez-moi"));
        frenchWords.add(new FrenchWord("Govorite li francuski?","Vous parlez français?"));
        frenchWords.add(new FrenchWord("Molim Vas","S'il vous plaît"));
        frenchWords.add(new FrenchWord("Gdje si?","Où es-tu?"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        words.add(word);
         */


        FrenchWordArdapter adapterFrench = new FrenchWordArdapter(this,frenchWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapterFrench);
    }
}
