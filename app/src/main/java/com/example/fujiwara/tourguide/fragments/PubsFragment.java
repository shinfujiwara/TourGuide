package com.example.fujiwara.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.fujiwara.tourguide.Content;
import com.example.fujiwara.tourguide.ContentAdapter;
import com.example.fujiwara.tourguide.R;

import java.util.ArrayList;

public class PubsFragment extends Fragment {

    public PubsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.temple_bar, R.string.pub1, R.drawable.temple_bar));
        content.add(new Content(R.string.buskers, R.string.pub2, R.drawable.buskers));

        ContentAdapter adapter = new ContentAdapter(getActivity(), content);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}