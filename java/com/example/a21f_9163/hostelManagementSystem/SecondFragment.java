package com.example.a21f_9163.hostelManagementSystem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a21f_9163.R;

import org.w3c.dom.Text;

public class SecondFragment extends Fragment {

    TextView textView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        view = (View) inflater.inflate(R.layout.fragment_blank, viewGroup, false);
        return view;
    }


    public void FragmentInteraction(String msg) {
        textView = view.findViewById(R.id.txtcmfragment);
        textView.setText(msg);
    }
}
