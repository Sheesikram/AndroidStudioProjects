package com.example.a21f_9163.hostelManagementSystem;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.a21f_9163.R;

public class FirstFragment extends Fragment {

    ButtonPressListener.onButtonPressListener btnPress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_blank, container, false);
        myFunction(viewGroup);
        return viewGroup;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        btnPress = (ButtonPressListener.onButtonPressListener) getActivity();
    }


    public void myFunction(ViewGroup root) {
        TextView textView = root.findViewById(R.id.txtcmfragment);
        textView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                textView.setText("name ");
                textView.setText("Reg ");
                textView.setText("batch ");
                textView.setText("dept ");
                textView.setText("phone ");
                textView.setText("Email ");

            }
        });
    }
}