package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DetailsActivity extends AppCompatActivity {
    @BindView(R.id.detailsFirstHalfImageView)
    ImageView mSiteImage;
    @BindView(R.id.detailsSecondHalfTextView)
    TextView mSiteDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setViews((Site) getIntent().getSerializableExtra(Site.INTENT_TAG));

    }

    private void setViews(Site site) {
        setTitle(site.getName());
        mSiteImage.setImageResource( site.getImageResourceId() );
        mSiteDescription.setText( site.getDescription() );
    }
}
