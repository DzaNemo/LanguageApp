package link.languageapp.Spain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<SpanishWord> spanishWords = new ArrayList<>();

        spanishWords.add(new SpanishWord("otac","padre"));
        spanishWords.add(new SpanishWord("majka","madre"));
        spanishWords.add(new SpanishWord("sin","hijo"));
        spanishWords.add(new SpanishWord("kćerka","hija"));
        spanishWords.add(new SpanishWord("brat","hermano"));
        spanishWords.add(new SpanishWord("sestra","hermana"));
        spanishWords.add(new SpanishWord("deda","abuelo"));
        spanishWords.add(new SpanishWord("baba","abuela"));

        SpanishWordAdapter spanishWordAdapter = new SpanishWordAdapter(this,spanishWords,R.color.category_family);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(spanishWordAdapter);
    }
}
