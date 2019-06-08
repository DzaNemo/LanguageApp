package link.languageapp.Spain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class ColoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<SpanishWord> spanishWords = new ArrayList<SpanishWord>();
        //germanWords.add("one");
        spanishWords.add(new SpanishWord("bijela","blanco"));
        spanishWords.add(new SpanishWord("crvena","rojo"));
        spanishWords.add(new SpanishWord("crna","negro"));
        spanishWords.add(new SpanishWord("žuta","amarillo"));
        spanishWords.add(new SpanishWord("plava","azul"));
        spanishWords.add(new SpanishWord("zelena","verde"));
        spanishWords.add(new SpanishWord("narandžasta","naranja"));
        spanishWords.add(new SpanishWord("ljubičasta","violeta"));
        spanishWords.add(new SpanishWord("smeđa","marrón"));

        /*
        moglo se uraditi i na ovaj nacin ali je gornji primjer mnogo bolji
        Word word = new Word("lutti","one");
        germanWords.add(word);
         */


        SpanishWordAdapter spanishWordAdapter = new SpanishWordAdapter(this,spanishWords,R.color.category_colors);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(spanishWordAdapter);
    }
}
