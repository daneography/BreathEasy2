package uofsc.com.breatheasynologin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.id.message;


public class mindfulnessFragment extends Fragment implements View.OnClickListener {
    private AppCompatButton btnWeek1,btnWeek2,btnWeek3,btnWeek4,btnWeek5,btnWeek6,btnWeek7,btnWeek8;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_mindfulness,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){

        btnWeek1 = (AppCompatButton)view.findViewById(R.id.btnWeek1);
        btnWeek2 = (AppCompatButton)view.findViewById(R.id.btnWeek2);
        btnWeek3 = (AppCompatButton)view.findViewById(R.id.btnWeek3);
        btnWeek4 = (AppCompatButton)view.findViewById(R.id.btnWeek4);
        btnWeek5 = (AppCompatButton)view.findViewById(R.id.btnWeek5);
        btnWeek6 = (AppCompatButton)view.findViewById(R.id.btnWeek6);
        btnWeek7 = (AppCompatButton)view.findViewById(R.id.btnWeek7);
        btnWeek8 = (AppCompatButton)view.findViewById(R.id.btnWeek8);

        btnWeek1.setOnClickListener(this);
        btnWeek2.setOnClickListener(this);
        btnWeek3.setOnClickListener(this);
        btnWeek4.setOnClickListener(this);
        btnWeek5.setOnClickListener(this);
        btnWeek6.setOnClickListener(this);
        btnWeek7.setOnClickListener(this);
        btnWeek8.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnWeek1:
                Intent intent = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent.putExtra("week 1 selected", message);
                getActivity().startActivity(intent);
                goToExercises();
                break;

            case R.id.btnWeek2:

                break;
            case R.id.btnWeek3:

                break;
            case R.id.btnWeek4:

                break;
            case R.id.btnWeek5:

                break;
            case R.id.btnWeek6:

                break;
            case R.id.btnWeek7:

                break;
            case R.id.btnWeek8:

                break;
        }

    }

    public void goToExercises(){

    }


}
