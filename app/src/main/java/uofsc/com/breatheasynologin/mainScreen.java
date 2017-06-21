package uofsc.com.breatheasynologin;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class mainScreen extends Fragment implements View.OnClickListener {
    private AppCompatButton btnSettings, btnMindfulness, btnDaily, btnCommunities;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main_screen,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){

        btnSettings = (AppCompatButton)view.findViewById(R.id.btnSettings);
        btnCommunities = (AppCompatButton)view.findViewById(R.id.btnCommunities);
        btnDaily = (AppCompatButton)view.findViewById(R.id.btnDaily);
        btnMindfulness = (AppCompatButton)view.findViewById(R.id.btnMindfulness);


        btnSettings.setOnClickListener(this);
        btnCommunities.setOnClickListener(this);
        btnDaily.setOnClickListener(this);
        btnMindfulness.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnSettings:
//                goToSettings();
                break;
            case R.id.btnCommunities:
                goToCommunities();
                break;
            case R.id.btnDaily:
                goToDaily();
                break;
            case R.id.btnMindfulness:
                goToMindfulness();
                break;
        }

    }

    private void goToCommunities() {
        Fragment communities = new communitiesFragment();
        FragmentTransaction ft3 = getFragmentManager().beginTransaction();
        getFragmentManager().popBackStack();
        ft3.replace(R.id.constraintLayout, communities).addToBackStack("tag");
        ft3.commit();

    }

    private void goToDaily() {
        Fragment daily = new dailyFragment();
        FragmentTransaction ft2 = getFragmentManager().beginTransaction();
        getFragmentManager().popBackStack();
        ft2.replace(R.id.constraintLayout, daily).addToBackStack("tag");
        ft2.commit();
    }

    private void goToMindfulness() {
        Fragment mindfulness = new mindfulnessFragment();
        FragmentTransaction ft1 = getFragmentManager().beginTransaction();
        getFragmentManager().popBackStack();
        ft1.replace(R.id.constraintLayout, mindfulness).addToBackStack("tag");
        ft1.commit();

    }

//    private void goToSettings(){
//        Fragment settings = new ProfileFragment();
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.constraintLayout,settings);
//        ft.commit();
//    }
}
