package link.languageapp.France;

import android.app.Activity;
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

import java.util.ArrayList;
import java.util.List;

import link.languageapp.R;

public class FrenchWordArdapter extends ArrayAdapter<FrenchWord> {

    private int resourceColor;

    public FrenchWordArdapter(Activity context, ArrayList<FrenchWord>words,int resourceColor){
        super(context,0,words);
        this.resourceColor = resourceColor;
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
        FrenchWord currentWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default language
        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentWord.getLanguageDefault());

        //find the TextView in the list_item.xml layout with the ID for the english
        TextView frenchTextView = listItemView.findViewById(R.id.chosen_language);
        frenchTextView.setText(currentWord.getLanguageFrance());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),resourceColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
