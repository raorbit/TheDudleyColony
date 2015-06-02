package com.admalamalinchock.thedudleycolony;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.admalamalinchock.thedudleycolony.game.Buildings.*;
import com.admalamalinchock.thedudleycolony.game.*;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BuildingsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BuildingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BuildingsFragment extends Fragment  {



    public static BuildingsFragment newInstance() {
        BuildingsFragment fragment = new BuildingsFragment();
      /*  Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
      args.putString(ARG_PARAM2, param2);
      fragment.setArguments(args);*/
        return fragment;
    }

    public BuildingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_buildings, container, false);
        RecyclerView recList = (RecyclerView) v.findViewById(R.id.buildingList);
        recList.setHasFixedSize(false);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);
        BuildingAdapter ba = new BuildingAdapter();
        recList.setAdapter(ba);
        return v;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {

        public void onFragmentInteraction(Uri uri);
    }
}