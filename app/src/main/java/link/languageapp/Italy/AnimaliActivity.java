package link.languageapp.Italy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.R;

public class AnimaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ItalianWord> italianWords = new ArrayList<>();

        italianWords.add(new ItalianWord("pas","cane"));
        italianWords.add(new ItalianWord("mačka","cat "));
        italianWords.add(new ItalianWord("krava","mucca "));
        italianWords.add(new ItalianWord("konj","cavallo "));
        italianWords.add(new ItalianWord("lav","leo"));
        italianWords.add(new ItalianWord("tigar","tiger"));
        italianWords.add(new ItalianWord("slon","elefante"));
        italianWords.add(new ItalianWord("medvjed","orso"));
        italianWords.add(new ItalianWord("orao","aquila"));
        italianWords.add(new ItalianWord("delfin","delfino"));
        italianWords.add(new ItalianWord("riba","di pesce"));
        italianWords.add(new ItalianWord("pingvin","pinguino"));

        ItalianWordAdapter italianWordAdapter = new ItalianWordAdapter(this,italianWords, R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(italianWordAdapter);
    }
}
