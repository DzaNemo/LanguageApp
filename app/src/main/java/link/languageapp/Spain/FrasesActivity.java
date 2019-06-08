package link.languageapp.Spain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<SpanishWord> spanishWords = new ArrayList<SpanishWord>();
        //germanWords.add("one");
        spanishWords.add(new SpanishWord("Dobar dan","Buenas tardes"));
        spanishWords.add(new SpanishWord("Zovem se...","Yo soy..."));
        spanishWords.add(new SpanishWord("Kako ste?","¿Cómo estás?"));
        spanishWords.add(new SpanishWord("Hvala","Gracias"));
        spanishWords.add(new SpanishWord("Ne znam","No sé"));
        spanishWords.add(new SpanishWord("Oprostite", "Perdón"));
        spanishWords.add(new SpanishWord("Govorite li španski?","¿Habla usted español?"));
        spanishWords.add(new SpanishWord("Molim Vas","Por favor"));
        spanishWords.add(new SpanishWord("Gdje si?","¿Dónde estás"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji   ¿
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        SpanishWordAdapter spanishWordAdapter = new SpanishWordAdapter(this,spanishWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(spanishWordAdapter);
    }
}
