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
import sportsz.betway.com.databinding.FragmentBtwMenuBinding;
@Obfuscate
public class BtwMenuFragment extends Fragment {

    private FragmentBtwMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBtwMenuBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.bBtwExit.setOnClickListener(view25 -> requireActivity().finish());
        binding.bBtwPrivacy.setOnClickListener(view26 -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwPrivacy));
        binding.bBtwAmericanFootball.setOnClickListener(view27 -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwAmericanFootball));
        binding.bBtwVolleyball.setOnClickListener(view28 -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwVolleyball));
        binding.bBtwTennis.setOnClickListener(view29 -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwTennis));
        binding.bBtwFootball.setOnClickListener(view30 -> Navigation.findNavController(requireView()).navigate(R.id.navigation_btwFootball));
    }


}