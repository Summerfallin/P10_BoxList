package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003749 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<boxitems> boxList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<boxitems> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id=resource;
        boxList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView imgbox =rowView.findViewById(R.id.imageView);
        boxitems currentItem = boxList.get(position);
        if(currentItem.getNum()==1){
            imgbox.setImageResource(R.drawable.blue_box);
        }else if (currentItem.getNum()==2){
            imgbox.setImageResource(R.drawable.orange_box);
        }else{
            imgbox.setImageResource(R.drawable.brown_box);
        }
        return rowView;

    }
}
