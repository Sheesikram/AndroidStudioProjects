package com.example.a21f_9163.hostelManagementSystem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a21f_9163.R;

public class AlertDialogMainActivity extends AppCompatActivity {

    Button alertBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_allocation_main2);

        alertBtn = findViewById(R.id.reg2btnalertdialog);
        textView = findViewById(R.id.reg2txtalertdialog);


        alertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogMainActivity.this);
                builder.setMessage("Are You Sure? it is a comunication between student and wardern").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface di, int which) {
                        textView.setText("2000");
                    }
                }).setNegativeButton("Cancel", null);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
    }

}