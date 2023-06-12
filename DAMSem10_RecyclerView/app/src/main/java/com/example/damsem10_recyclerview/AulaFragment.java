package com.example.damsem10_recyclerview;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damsem10_recyclerview.placeholder.PlaceholderContent;

/**
 * A fragment representing a list of Items.
 */
public class AulaFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AulaFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AulaFragment newInstance(int columnCount) {
        AulaFragment fragment = new AulaFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            // En este caso se utiliza un Adaptador Personalizado
            // Se está asociando el Adaptador al recyclerView
            // Esto se puede visualizar en el fichero: MyAulaRecyclerViewAdapter

            recyclerView.setAdapter(new MyAulaRecyclerViewAdapter(PlaceholderContent.ITEMS));
        }
        // Finalmente retornará la lista
        return view;
    }
}