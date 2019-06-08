package link.languageapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class FrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ItalianWord> italianWords = new ArrayList<>();

        italianWords.add(new ItalianWord("Dobar dan","Buongiorno"));
        italianWords.add(new ItalianWord("Zovem se...","Il mio nome è..."));
        italianWords.add(new ItalianWord("Kako ste?","Come stai?"));
        italianWords.add(new ItalianWord("Hvala","Grazie"));
        italianWords.add(new ItalianWord("Ne znam","Non lo so"));
        italianWords.add(new ItalianWord("Oprostite","Scusa"));
        italianWords.add(new ItalianWord("Govorite li italijanski?","Parli italiano?"));
        italianWords.add(new ItalianWord("Molim vas","Prego"));
        italianWords.add(new ItalianWord("Gdje si?","Dove sei?"));

        ItalianWordAdapter italianWordAdapter = new ItalianWordAdapter(this,italianWords,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(italianWordAdapter);
    }
}
