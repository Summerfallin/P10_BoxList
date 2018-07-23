package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvBox;
    ArrayList<boxitems> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvBox=findViewById(R.id.listViewBox);
        alBoxList = new ArrayList<>();
        boxitems item1 = new boxitems(1);
        boxitems item2 = new boxitems(2);
        boxitems item3 = new boxitems(3);
        alBoxList.add(item1);
        alBoxList.add(item2);
        alBoxList.add(item3);
        caBox = new CustomAdapter(this,R.layout.box_items,alBoxList);
        lvBox.setAdapter(caBox);
    }
}
