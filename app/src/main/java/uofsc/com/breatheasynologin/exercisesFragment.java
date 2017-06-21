package uofsc.com.breatheasynologin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class exercisesFragment extends Fragment {
    private TextView tvDaily;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_daily,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        tvDaily = (TextView)view.findViewById(R.id.tvDaily);
    }
}
