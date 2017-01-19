package com.example.user.minorproject;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class StudentDetail extends Fragment {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6,et7;
    Button b1,b2,b3;
    MyDatabase m;


    public StudentDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_student_detail, container, false);
        tv1 = (TextView) v.findViewById(R.id.sdText_1);
        tv2 = (TextView) v.findViewById(R.id.sdText_2);
        tv3 = (TextView) v.findViewById(R.id.sdText_3);
        tv4 = (TextView) v.findViewById(R.id.sdText_4);
        tv5 = (TextView) v.findViewById(R.id.sdText_5);
       /* tv6 = (TextView) v.findViewById(R.id.sdText_6);*/
        et1 = (EditText) v.findViewById(R.id.sdEdit_1);
        et2 = (EditText) v.findViewById(R.id.sdEdit_2);
        et3 = (EditText) v.findViewById(R.id.sdEdit_3);
        et4 = (EditText) v.findViewById(R.id.sdEdit_4);
        et5 = (EditText) v.findViewById(R.id.sdEdit_5);
       /* et6 = (EditText) v.findViewById(R.id.sdEdit_6);*/
        et7 = (EditText) v.findViewById(R.id.sdEdit_7);
        b1 = (Button) v.findViewById(R.id.sdButton_1);
        b2 = (Button) v.findViewById(R.id.sdButton_2);
        b3 = (Button) v.findViewById(R.id.sdButton_3);

        m = new MyDatabase(getActivity());
        m.open();

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            MainActivity m = (MainActivity) getActivity();
            m.getDialogFragment();
        }
    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et1.getText().toString();
                String mob = et2.getText().toString().trim();
                String email = et3.getText().toString().trim();
                String sub = et4.getText().toString().trim();
                String des = et5.getText().toString().trim();
                String date = et7.getText().toString();
                m.insertStudent(name, mob, email, sub, des, date);
                Toast.makeText(getActivity(), "Detail inserted", Toast.LENGTH_SHORT).show();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity m = (MainActivity) getActivity();
                m.getDetailFragByClick();

            }
        });
        return v;
    }
    public void catchDate(String date){

        et7.setText(date);

    }


}

