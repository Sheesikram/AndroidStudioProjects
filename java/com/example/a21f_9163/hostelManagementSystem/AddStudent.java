package com.example.a21f_9163.hostelManagementSystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.security.PrivateKey;
import java.util.ArrayList;
import com.example.a21f_9163.R;

public class AddStudent extends AppCompatActivity {

    private EditText nameEditText,registrationNumberEditText,batchEditText,departmentEditText,phoneEditText,emailEditText;
    private Button saveButton;
    private TextView nameText,registrationNumberText,batchText,departmentText,phoneText,emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        nameEditText = findViewById(R.id.nameEditText);
        registrationNumberEditText = findViewById(R.id.registrationNumberEditText);
        batchEditText = findViewById(R.id.batchEditText);
        departmentEditText = findViewById(R.id.departmentEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        emailEditText = findViewById(R.id.emailEditText);
        saveButton = findViewById(R.id.addbtn);
//        nameText=findViewById(R.id.nameText);
//        registrationNumberText=findViewById(R.id.registrationNumberText);
//        batchText=findViewById(R.id.batchText);
//        departmentText=findViewById(R.id.departmentText);
//        phoneText=findViewById(R.id.phoneText);
//        emailText=findViewById(R.id.emailText);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String registrationNumber = registrationNumberEditText.getText().toString();
                String batch = batchEditText.getText().toString();
                String department = departmentEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String email = emailEditText.getText().toString();

                StudentModel student = new StudentModel(name, registrationNumber, batch, department, phone, email);

                addStudentToFirebase(student);
                saveStudentToSharedPreferences(student);
            }

            private void saveStudentToSharedPreferences(StudentModel student) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("FastCfdHostel");

                myRef.child(student.getRegistrationNumber()).setValue(student);
            }

            private void addStudentToFirebase(StudentModel student) {

                  SharedPreferences sharedPreferences = getSharedPreferences("FastCfdHostel", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    editor.putString("name", student.getName());
                    editor.putString("registrationNumber", student.getRegistrationNumber());
                    editor.putString("batch", student.getBatch());
                    editor.putString("department", student.getDepartment());
                    editor.putString("phone", student.getPhone());
                    editor.putString("email", student.getEmail());

                    editor.apply();

            }
        });
    }
}