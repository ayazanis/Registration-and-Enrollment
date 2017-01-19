package com.example.user.minorproject;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataListView extends Fragment {

    ListView lv;
    SimpleCursorAdapter s;
    Cursor c;
    MyDatabase m;

    public DataListView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_data_list_view, container, false);
        lv = (ListView) v.findViewById(R.id.listView);
        m = new MyDatabase(getActivity());
        m.open();
        c = m.readStudent();
        /*s = new SimpleCursorAdapter(getActivity(),R.layout.row,c,new String[]{"semail","sno","sname","ssub"},                                                                                   at com.example.user.minorproject.DataListView.onCreateView(DataListView.java:36)
            new int[]{R.id.rowText_2,R.id.rowText_3,R.id.rowText_4,R.id.rowText_5},0);*/

      /*  s = new SimpleCursorAdapter(getActivity(),R.layout.row,c,new String[]{"_id","semail","sname","ssub","smob"},
                new int[]{R.id.rowText_1,R.id.rowText_2,R.id.rowText_3,R.id.rowText_4,R.id.rowText_5},0);*/

          s = new SimpleCursorAdapter(getActivity(),R.layout.row,c,new String[]{"_id","semail","sname","ssub","smob"},
                  new int[]{R.id.rowText_1,R.id.rowText_2,R.id.rowText_3,R.id.rowText_4,R.id.rowText_5},0);
        lv.setAdapter(s);
        return v;
    }

}
