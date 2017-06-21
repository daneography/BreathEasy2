package uofsc.com.breatheasynologin;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class exercisesFragment extends Fragment {
    private TextView tvName, tvIntervention;
    private SharedPreferences pref;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_exercises,container,false);
        initViews(view);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        pref = getActivity().getPreferences(0);
        tvName.setText("Welcome : "+pref.getString(Constants.NAME,"Defaul User"));


    }

    private void initViews(View view){
        tvName = (TextView)view.findViewById(R.id.tvName);
        tvIntervention = (TextView)view.findViewById(R.id.tvIntervention);
    }
}
