package com.example.a21f_9163.hostelManagementSystem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a21f_9163.R;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    private ArrayList<StudentModel> studentList;

    public AdapterRecyclerView(ArrayList<StudentModel> studentList) {

        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  =LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StudentModel studentModel = studentList.get(position);
        holder.studentName.setText(studentModel.getName());
        holder.studentReg.setText(studentModel.getRegistrationNumber());
        holder.studentDept.setText(studentModel.getBatch());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView studentName,studentReg,studentDept;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.button);
            studentReg = itemView.findViewById(R.id.reg2);
            studentDept = itemView.findViewById(R.id.dd2);
        }
    }
}
