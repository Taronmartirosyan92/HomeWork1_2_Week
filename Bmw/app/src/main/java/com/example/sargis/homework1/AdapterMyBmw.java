package com.example.sargis.homework1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterMyBmw extends ArrayAdapter<BmwModel> {
    private Context context;
    private List<BmwModel> list;
    private int myPostId;

    AdapterMyBmw(@NonNull Context context, int resource, @NonNull List<BmwModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.myPostId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(myPostId, parent, false);
        }
        final BmwModel bmwModel = list.get(position);
        ImageView imageView = listItem.findViewById(R.id.imageView);
        TextView textViewTitle = listItem.findViewById(R.id.textView5);
        TextView textViewContext = listItem.findViewById(R.id.textView6);
        TextView textViewModification = listItem.findViewById(R.id.textView7);

        textViewTitle.setText(bmwModel.getTitle());
        textViewContext.setText(bmwModel.getContent());
        textViewModification.setText(bmwModel.getModification());
        Picasso.get().load(bmwModel.getImageUrl()).into(imageView);
        return listItem;
    }
}
