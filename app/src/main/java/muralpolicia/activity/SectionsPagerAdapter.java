package muralpolicia.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IrbeinTepes on 11/15/2017.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    List<Fragment> tabs = new ArrayList<>();
    List<String> tabsName = new ArrayList<>();

    public void addFragment(Fragment fragment, String title) {
        tabs.add(fragment);
        tabsName.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsName.get(position);
    }
}