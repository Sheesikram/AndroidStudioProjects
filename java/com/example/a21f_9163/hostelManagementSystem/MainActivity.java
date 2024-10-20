package com.example.a21f_9163.hostelManagementSystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;

import com.example.a21f_9163.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addStudentToFirebase(StudentModel student) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("FastCfdHostel");

        myRef.child(student.getRegistrationNumber()).setValue(student);
    }

    public void saveStudentToSharedPreferences(StudentModel student) {
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
    public void addStudent(View view) {
        Intent intent = new Intent(this,AddStudent.class);
        startService(intent);

    }

    public void MessEntry(View view) {
        Intent intent = new Intent(this,HostelWarden.class);
        startService(intent);

    }
//    SecondFragment secondFragment = (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
//        secondFragment.FragmentInteraction(msg);

    public void roomAlocation(View view) {
        Intent intent = new Intent(this,RoomAllocationMainActivity2.class);
        startService(intent);

    }


}