package com.example.javaweek12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.javaweek12.fragments.FragmentAdd;
import com.example.javaweek12.fragments.FragmentList;

public class TabPagerAdapter extends FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentList();
            case 1:
                return new FragmentAdd();
            default:
                return new FragmentList();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
