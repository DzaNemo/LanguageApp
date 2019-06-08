package link.languageapp.France;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import link.languageapp.English.EnglishWord;
import link.languageapp.English.EnglishWordAdapter;
import link.languageapp.R;

public class LesAnimauxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<FrenchWord> frenchWords = new ArrayList<>();

        frenchWords.add(new FrenchWord("pas","chien"));
        frenchWords.add(new FrenchWord("mačka","chat"));
        frenchWords.add(new FrenchWord("krava","vache"));
        frenchWords.add(new FrenchWord("konj","cheval"));
        frenchWords.add(new FrenchWord("lav","lion"));
        frenchWords.add(new FrenchWord("tigar","tigre"));
        frenchWords.add(new FrenchWord("slon","éléphant"));
        frenchWords.add(new FrenchWord("medvjed","ours"));
        frenchWords.add(new FrenchWord("orao","aigle"));
        frenchWords.add(new FrenchWord("delfin","dauphin "));
        frenchWords.add(new FrenchWord("riba","poisson"));
        frenchWords.add(new FrenchWord("pingvin","pingouin"));

        FrenchWordArdapter frenchWordArdapter = new FrenchWordArdapter(this,frenchWords,R.color.category_animals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(frenchWordArdapter);
    }
}
