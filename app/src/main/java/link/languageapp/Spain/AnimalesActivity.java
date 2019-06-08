package link.languageapp.Spain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;


public class AnimalesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<SpanishWord> spanishWords = new ArrayList<>();

        spanishWords.add(new SpanishWord("pas","perro"));
        spanishWords.add(new SpanishWord("mačka","gato"));
        spanishWords.add(new SpanishWord("krava","vaca"));
        spanishWords.add(new SpanishWord("konj","caballo"));
        spanishWords.add(new SpanishWord("lav","león"));
        spanishWords.add(new SpanishWord("tigar","tigre"));
        spanishWords.add(new SpanishWord("slon","elefante"));
        spanishWords.add(new SpanishWord("medvjed","oso"));
        spanishWords.add(new SpanishWord("orao","águila"));
        spanishWords.add(new SpanishWord("delfin","delfín"));
        spanishWords.add(new SpanishWord("riba","pescado"));
        spanishWords.add(new SpanishWord("pingvin","pinguino"));

        SpanishWordAdapter spanishWordAdapter = new SpanishWordAdapter(this,spanishWords, R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(spanishWordAdapter);
    }
}
