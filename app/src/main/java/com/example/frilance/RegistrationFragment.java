package com.example.frilance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistrationFragment extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.registration_fragment,
                container, false);

        Button reg = view.findViewById(R.id.reg);

        EditText email = view.findViewById(R.id.emeil);
        EditText login = view.findViewById(R.id.login);
        EditText password = view.findViewById(R.id.password);
        EditText password_repeat = view.findViewById(R.id.password_repeat);

        Spinner type = view.findViewById(R.id.type);

        reg.setOnClickListener(this);


        return view;
    }

}