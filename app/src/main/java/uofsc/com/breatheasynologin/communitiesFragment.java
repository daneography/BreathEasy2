package uofsc.com.breatheasynologin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class communitiesFragment extends Fragment {
    private TextView tvCommunities;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_communities,container,false);
        initViews(view);
        return view;
    }

    private void initViews(View view){
        tvCommunities = (TextView)view.findViewById(R.id.tvCommunities);
    }
}

