package uofsc.com.breatheasynologin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.widget.TextView;


public class settingsFragment extends Fragment implements View.OnClickListener{
    private AppCompatButton btn_profile;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_settings,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        btn_profile = (AppCompatButton) view.findViewById(R.id.btn_profile);

        btn_profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn_profile:
                Fragment profile = new ProfileFragment();
                FragmentTransaction ft1 = getFragmentManager().beginTransaction();
                getFragmentManager().popBackStack();
                ft1.replace(R.id.constraintLayout, profile).addToBackStack("tag");
                ft1.commit();
        }
    }
}
