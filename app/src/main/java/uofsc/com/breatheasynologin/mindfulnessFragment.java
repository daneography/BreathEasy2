package uofsc.com.breatheasynologin;

import android.app.ActionBar;
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
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
                Intent intent1 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent1.putExtra("week 1 selected", message);
                getActivity().startActivity(intent1);
                goToExercises();
                break;

            case R.id.btnWeek2:
                Intent intent2 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent2.putExtra("week 2 selected", message);
                getActivity().startActivity(intent2);
                goToExercises();
                break;
            case R.id.btnWeek3:
                Intent intent3 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent3.putExtra("week 3 selected", message);
                getActivity().startActivity(intent3);
                goToExercises();
                break;
            case R.id.btnWeek4:
                Intent intent4 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent4.putExtra("week 4 selected", message);
                getActivity().startActivity(intent4);
                goToExercises();
                break;
            case R.id.btnWeek5:
                Intent intent5 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent5.putExtra("week 5 selected", message);
                getActivity().startActivity(intent5);
                goToExercises();
                break;
            case R.id.btnWeek6:
                Intent intent6 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent6.putExtra("week 6 selected", message);
                getActivity().startActivity(intent6);
                goToExercises();
                break;
            case R.id.btnWeek7:
                Intent intent7 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent7.putExtra("week 7 selected", message);
                getActivity().startActivity(intent7);
                goToExercises();
                break;
            case R.id.btnWeek8:
                Intent intent8 = new Intent(getActivity().getBaseContext(), MainMenuNavigation.class);
                intent8.putExtra("week 8 selected", message);
                getActivity().startActivity(intent8);
                goToExercises();
                break;
        }

    }

    public void goToExercises(){
        Fragment communities = new communitiesFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        getFragmentManager().popBackStack();
        ft.replace(R.id.frame_layout, communities).addToBackStack("tag");
        ft.commit();
    }


}
