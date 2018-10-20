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
public class AnnualEventsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<Site> mEvents;

    public AnnualEventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_annual_events, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.annual_events_recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mEvents, getContext());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEvents = new ArrayList<>();
        initEvents();
    }

    /**
     * Fill the mSites list with Site instances
     */
    private void initEvents(){
        mEvents.add(new Site(R.drawable.how_weird_street_fair_image, getStrRes(R.string.howWeirdStreeFaireName)             , getStrRes(R.string.howWeirdStreeFaireDescription)));
        mEvents.add(new Site(R.drawable.bay_to_breakers_image      , getStrRes(R.string.bayToBreakersName)                  , getStrRes(R.string.bayToBreakersDescription)));
        mEvents.add(new Site(R.drawable.outside_lands_image        , getStrRes(R.string.outsideLandsName)                   , getStrRes(R.string.outsideLandsDescription)));
        mEvents.add(new Site(R.drawable.san_francisco_pride_image  , getStrRes(R.string.sanFranciscoPrideName)              , getStrRes(R.string.sanFranciscoPrideDescription)));
        mEvents.add(new Site(R.drawable.chinese_new_year_image     , getActivity().getString(R.string.chineseNewYearName), getActivity().getString(R.string.chineseNewYearDescription)));
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


