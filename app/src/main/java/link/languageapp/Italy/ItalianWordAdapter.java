package link.languageapp.Italy;

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
import link.languageapp.Russia.RussianWord;

public class ItalianWordAdapter extends ArrayAdapter<ItalianWord> {

    private int resourceColor;

    public ItalianWordAdapter(@NonNull Context context, @NonNull List<ItalianWord> objects, int resourceColor) {
        super(context, 0, objects);
        this.resourceColor = resourceColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view,parent,false);
        }

        //get the  Word object located at this position in the list
        ItalianWord currentItalianWord = getItem(position);

        //find the TextView in the list_item.xml layout with the ID for the default language
        TextView defaultLanguageTextView = listItemView.findViewById(R.id.default_language);
        defaultLanguageTextView.setText(currentItalianWord.getLanguageDefault());

        //find the TextView in the list_item.xml layout with the ID for the italian language
        TextView italianTextView = listItemView.findViewById(R.id.chosen_language);
        italianTextView.setText(currentItalianWord.getItalianLanguage());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentItalianWord.hasImage()){
            imageView.setImageResource(currentItalianWord.getImageResourceID());
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
