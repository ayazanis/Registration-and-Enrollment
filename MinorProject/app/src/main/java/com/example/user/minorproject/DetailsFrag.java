package com.example.user.minorproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFrag extends Fragment {

    Button b1,b2,b3,b4,b5,b6,b7,b8;


    public DetailsFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_details, container, false);
        b1 = (Button) v.findViewById(R.id.deButton_1);
        b2 = (Button) v.findViewById(R.id.deButton_2);
        b3 = (Button) v.findViewById(R.id.deButton_3);
        b4 = (Button) v.findViewById(R.id.deButton_4);
        b5 = (Button) v.findViewById(R.id.deButton_5);
        b6 = (Button) v.findViewById(R.id.deButton_6);
        b7 = (Button) v.findViewById(R.id.deButton_7);
        b8 = (Button) v.findViewById(R.id.deButton_8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getStudentDetailByClick();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getStudentDetailByClick();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getStudentDetailByClick();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getStudentDetailByClick();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getDataLIstViewByClick();

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getSearchByClick();
            }
        });


        return v;
    }

}
