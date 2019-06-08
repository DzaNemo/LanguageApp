package link.languageapp.English;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<EnglishWord> englishWords = new ArrayList<>();

        englishWords.add(new EnglishWord("Dobar dan","Good afternoon"));
        englishWords.add(new EnglishWord("Zovem se...","My name is..."));
        englishWords.add(new EnglishWord("Kako ste?","How are you?"));
        englishWords.add(new EnglishWord("Hvala","Thank you"));
        englishWords.add(new EnglishWord("Ne znam","I don't know"));
        englishWords.add(new EnglishWord("Oprostite","Sorry"));
        englishWords.add(new EnglishWord("Govorite li engleski?","Do you speak english?"));
        englishWords.add(new EnglishWord("Molim Vas","Please"));
        englishWords.add(new EnglishWord("Gdje si?","Where are you?"));

        EnglishWordAdapter englishWordAdapter = new EnglishWordAdapter(this,englishWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(englishWordAdapter);
    }
}
