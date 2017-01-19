package com.example.user.minorproject;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFrag extends Fragment {

    Button b1,b2;
    AutoCompleteTextView at1,at2;
    MyDatabase m;
    ListView lv;
    Cursor c;
    SimpleCursorAdapter s;
    ArrayAdapter<String> arrayAdapterNumber,arrayAdapterName;


    public SearchFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_search, container, false);

        lv = (ListView) v.findViewById(R.id.searchList_1);
        b1 = (Button) v.findViewById(R.id.searchButton_1);
        b2 = (Button) v.findViewById(R.id.searchButton_2);
        at1 = (AutoCompleteTextView) v.findViewById(R.id.searchAuto_1);
        at2 = (AutoCompleteTextView) v.findViewById(R.id.searchAuto_2);
        m = new MyDatabase(getActivity());
        m.open();
        String[] numbers = m.getAllNumbers();
        String[] names = m.getAllNames();

        arrayAdapterNumber = new ArrayAdapter<String>(getActivity(),R.layout.listitem,numbers);
        arrayAdapterName = new ArrayAdapter<String>(getActivity(),R.layout.listitem,names);

        at1.setAdapter(arrayAdapterName);
        at2.setAdapter(arrayAdapterNumber);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabase m = new MyDatabase(getActivity());

                Cursor c = m.searchName(at1.getText().toString());

                s = new SimpleCursorAdapter(getActivity(), R.layout.row, c,
                        new String[]{"_id", "sname", "smob", "semail", "ssub"},
                        new int[]{R.id.rowText_1, R.id.rowText_2, R.id.rowText_3, R.id.rowText_4, R.id.rowText_5}, 0);
                lv.setAdapter(s);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDatabase m = new MyDatabase(getActivity());

                Cursor c = m.searchNum(at2.getText().toString());

                s = new SimpleCursorAdapter(getActivity(), R.layout.row, c,
                        new String[]{"_id", "sname", "smob", "semail", "ssub"},
                        new int[]{R.id.rowText_1, R.id.rowText_2, R.id.rowText_3, R.id.rowText_4, R.id.rowText_5}, 0);
                lv.setAdapter(s);
            }
        });
        return v;
    }

}
