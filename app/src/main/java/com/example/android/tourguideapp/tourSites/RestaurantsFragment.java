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
public class RestaurantsFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private List<Site> mSites;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.restaurants_recycler_view);
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
        mSites.add(new Site(R.drawable.cliff_house_image        , getStrRes(R.string.cliffHouseName)      , getStrRes(R.string.cliffHouseDescription)));
        mSites.add(new Site(R.drawable.house_of_prime_rib_image , getStrRes(R.string.houseOfPrimeRibName) , getStrRes(R.string.houseOfPrimeRibDescription)));
        mSites.add(new Site(R.drawable.tommys_joynt_image       , getStrRes(R.string.tommysJoyntName)     , getStrRes(R.string.tommysJoyntDescription)));
        mSites.add(new Site(R.drawable.zuni_cafe_image          , getStrRes(R.string.zuniCafeName)        , getStrRes(R.string.zuniCafeDescription)));
        mSites.add(new Site(R.drawable.tadich_grill_image       , getStrRes(R.string.tadichGrillName)     , getStrRes(R.string.tadichGrillDescription)));
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


