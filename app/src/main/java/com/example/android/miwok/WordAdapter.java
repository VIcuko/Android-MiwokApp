package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicuko on 17/7/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text
        TextView miWokText = (TextView) listItemView.findViewById(R.id.miwok_text);

        // Get the word from the current Word object and set it on the TextView
        miWokText.setText(word.getMiWokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text
        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text);

        // Get the word from the current Word object and set it on the TextView
        defaultText.setText(word.getDefautltTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (word.getImageResourceId()!= 0){
            // Get the image from the current Word object and set it on the ImageView
            imageView.setImageResource(word.getImageResourceId());
        }
        else {
            // Set the ImageView to gone
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}