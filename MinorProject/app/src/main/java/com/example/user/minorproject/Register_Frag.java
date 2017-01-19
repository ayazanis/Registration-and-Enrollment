package com.example.user.minorproject;



import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class Register_Frag extends Fragment {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    EditText et1,et2,et3,et4,et5,et6;
    Button b1,b2;
    SharedPreferences sp;


    public Register_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_register_,container,false);
        tv1 = (TextView) v.findViewById(R.id.regText_1);
        tv2 = (TextView) v.findViewById(R.id.regText_2);
        tv3 = (TextView) v.findViewById(R.id.regText_3);
        tv4 = (TextView) v.findViewById(R.id.regText_4);
        tv5 = (TextView) v.findViewById(R.id.regText_5);
        tv6 = (TextView) v.findViewById(R.id.regText_6);
        et1 = (EditText) v.findViewById(R.id.regEdit_1);
        et2 = (EditText) v.findViewById(R.id.regEdit_2);
        et3 = (EditText) v.findViewById(R.id.regEdit_3);
        et4 = (EditText) v.findViewById(R.id.regEdit_4);
        et5 = (EditText) v.findViewById(R.id.regEdit_5);
        b1 = (Button) v.findViewById(R.id.regButton_1);
        b2 = (Button) v.findViewById(R.id.regButton_2);
        final SharedPreferences sp = getActivity().getSharedPreferences("credentials", 0);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Eno = et1.getText().toString().trim();
                String Ename = et2.getText().toString();
                String Email = et3.getText().toString();
                String Password = et4.getText().toString();
                String Confirm =et5.getText().toString();

                SharedPreferences.Editor et = sp.edit();
                et.putString("Eno",Eno);
                et.putString("Ename",Ename);
                et.putString("Email",Email);
                et.putString("Password",Password);
                et.putString("Confirm",Confirm);
                et.commit();
                Toast.makeText(getActivity(),"Detail is inserted",Toast.LENGTH_LONG).show();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity m = (MainActivity) getActivity();
                m.getLoginFragOnClick();
            }
        });
        return v;
    }

}
