package com.example.android.tourguideapp.tourSites;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguideapp.R;
import com.example.android.tourguideapp.RecyclerViewAdapter;
import com.example.android.tourguideapp.Site;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HistoricalSitesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<Site> mSites;


    public HistoricalSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_historical_site, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.historical_site_recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mSites, getContext());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSites = new ArrayList<>();
        initSites();
    }

    /**
     * Fill the mSites list with Site instances
     */
    private void initSites(){
        mSites.add(new Site(R.drawable.golden_gate_bridge_image , getStrRes(R.string.goldenGateBridgeName) , getStrRes(R.string.goldenGateBridgeDescription)));
        mSites.add(new Site(R.drawable.alcatraz_image           , getStrRes(R.string.alcatrazName)         , getStrRes(R.string.alcatrazDescription) ));
        mSites.add(new Site(R.drawable.fort_mason_image         , getStrRes(R.string.fortMasonName)        , getStrRes(R.string.fortMasonDescription)));
        mSites.add(new Site(R.drawable.coit_tower_image         , getStrRes(R.string.coitTowerName)        , getStrRes(R.string.coitTowerDescription)));
        mSites.add(new Site(R.drawable.ferry_building_image     , getStrRes(R.string.ferryBuildingName)    , getStrRes(R.string.ferryBuildingDescription)));
    }

    /**
     * Gets a string from the string resource file in a more concise way
     * @param resourceIdNumber
     * @return the string from the string resource directory
     */
    private String getStrRes(int resourceIdNumber){
        return getActivity().getString(resourceIdNumber);
    }
}

