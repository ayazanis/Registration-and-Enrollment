package com.example.user.minorproject;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by user on 15-04-2016.
 */
public class DialogFrag1 extends DialogFragment {

    String date2;
    public DialogFrag1(){
        // Required empty public constructor

    }

    //StudentDetail sd = new StudentDetail();
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;

        final Calendar calendar = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int date = Calendar.getInstance().get(Calendar.DATE);
        /*DatePickerDialog dp = new DatePickerDialog(getActivity(), (view, year1, monthOfYear, dayOfMonth)-> {
             date2=""+year1+""+monthOfYear+""+dayOfMonth;
            sd.catchDate(date2);
        },year,month,date);*/
        DatePickerDialog dp = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                date2 = ""+year+""+monthOfYear+""+dayOfMonth;
                StudentDetail sd = (StudentDetail) getActivity().getSupportFragmentManager().findFragmentByTag("studentdetail");
                sd.catchDate(date2);
            }
        },year,month,date);

        d = dp;
        return d;
    }
}
