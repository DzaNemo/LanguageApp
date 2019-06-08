package link.languageapp.Spain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class NumerosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<SpanishWord> spanishWords = new ArrayList<>();

        spanishWords.add(new SpanishWord("jedan","unos"));
        spanishWords.add(new SpanishWord("dva","dos"));
        spanishWords.add(new SpanishWord("tri","tres"));
        spanishWords.add(new SpanishWord("četiri","cuatro"));
        spanishWords.add(new SpanishWord("pet","cinco"));
        spanishWords.add(new SpanishWord("šest","seis"));
        spanishWords.add(new SpanishWord("sedam","siete"));
        spanishWords.add(new SpanishWord("osam","ocho"));
        spanishWords.add(new SpanishWord("devet","nueve"));
        spanishWords.add(new SpanishWord("deset","diez"));

        SpanishWordAdapter spanishWordAdapter = new SpanishWordAdapter(this,spanishWords,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(spanishWordAdapter);
    }
}
