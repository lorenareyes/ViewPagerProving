package com.example.viewpagerproving;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
	
	private MyPagerAdapter adapterViewPager;
	ViewPager viewPager = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
	}


	public static class MyPagerAdapter extends FragmentStatePagerAdapter {
		private static int NUM_ITEMS = 3;

		public MyPagerAdapter(FragmentManager fragmentManager) {
			super(fragmentManager);
		}

		// Returns total number of pages
		@Override
		public int getCount() {
			return NUM_ITEMS;
		}

		// Returns the fragment to display for that page
		@Override
		public Fragment getItem(int position) {
			switch (position) {
			case 0:
				return new Fragment_A();
			case 1: 
				return new Fragment_B();
			case 2: 
				return new Fragment_C();
			default:
				return null;
			}
		}
		
		public CharSequence getPageTitle(int position){
			switch (position) {
			case 0:
				return "Tab 1";
			case 1: 
				return "Tab 2";
			case 2: 
				return "Tab 3";
			default:
				return null;
			}			
		}

	}

}
