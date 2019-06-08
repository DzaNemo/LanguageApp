package link.languageapp.English;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import link.languageapp.R;


public class EnglishWordAdapter extends ArrayAdapter<EnglishWord> {

    private int colorResource;

    public EnglishWordAdapter(@NonNull Context context, @NonNull List<EnglishWord> objects, int colorResourceId) {
        super(context, 0, objects);
        this.colorResource = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        //get the  Word object located at this position in the list
        EnglishWord currentEnglishWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default language
        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentEnglishWord.getLanguageDefault());

        //find the TextView in the list_item.xml layout with the ID for the english language
        TextView englishTextView = listItemView.findViewById(R.id.chosen_language);
        englishTextView.setText(currentEnglishWord.getEnglishLanguage());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentEnglishWord.hasImage()){
            imageView.setImageResource(currentEnglishWord.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),colorResource);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
