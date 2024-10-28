package com.example.mappingtool;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.mappingtool.databinding.FragmentFirstBinding;
import com.example.mappingtool.databinding.MapListFragBinding;

public class MapListFrag extends Fragment {

    private MapListFragBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = MapListFragBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//
        binding.returnList.setOnClickListener(v ->
                NavHostFragment.findNavController(MapListFrag.this)
                        .navigate(R.id.action_mapListFrag_to_FirstFragment)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}