package sportsz.betway.com;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.michaelrocks.paranoid.Obfuscate;
import sportsz.betway.com.databinding.FragmentBtwAmericanFootballBinding;
@Obfuscate
public class BtwAmericanFootballFragment extends Fragment {

    private FragmentBtwAmericanFootballBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBtwAmericanFootballBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.bBtwAFootballBack.setOnClickListener(v -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwMenu));

    }

}