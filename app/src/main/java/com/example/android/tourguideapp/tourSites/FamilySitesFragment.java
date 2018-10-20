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
public class FamilySitesFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<Site> mSites;

    public FamilySitesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_family_sites, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.family_site_recycler_view);
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
        mSites.add(new Site(R.drawable.pier_39_image                        , getStrRes(R.string.pier39Name)                      , getStrRes(R.string.pier39Description)));
        mSites.add(new Site(R.drawable.metreon_image                        , getStrRes(R.string.metreonName)                     , getStrRes(R.string.metreonDescription)));
        mSites.add(new Site(R.drawable.san_francisco_zoo_image              , getStrRes(R.string.sanFranciscoZooName)             , getStrRes(R.string.sanFranciscoZooDescription)));
        mSites.add(new Site(R.drawable.exploratorium_image                  , getStrRes(R.string.exploratoriumName)               , getStrRes(R.string.exploratoriumDescription )));
        mSites.add(new Site(R.drawable.california_academy_of_sciences_image , getStrRes(R.string.californiaAcademyOfSciencesName) , getStrRes(R.string.californiaAcademyOfSciencesDescription)));
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

