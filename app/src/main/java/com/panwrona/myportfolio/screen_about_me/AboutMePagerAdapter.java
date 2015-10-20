package com.panwrona.myportfolio.screen_about_me;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.panwrona.myportfolio.screen_about_me.screen_about_me_fragment.AboutMeFragment;
import com.panwrona.myportfolio.screen_about_me.screen_education.EducationFragment;
import com.panwrona.myportfolio.screen_about_me.screen_experience.ExperienceFragment;

final class AboutMePagerAdapter extends FragmentPagerAdapter {
	private static final int ABOUT_ME_POSITION = 0;
	private static final int EXPERIENCE_POSITION = 2;
	private static final int EDUCATION_POSITION = 1;
	private static final int PAGE_COUNT = 3;

	private String tabTitles[] = new String[] { "About Me", "Education", "Experience"};

	public AboutMePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case ABOUT_ME_POSITION:
				return AboutMeFragment.newInstance();
			case EXPERIENCE_POSITION:
				return ExperienceFragment.newInstance();
			case EDUCATION_POSITION:
				return EducationFragment.newInstance();
			default:
				return AboutMeFragment.newInstance();
		}
	}

	@Override
	public int getCount() {
		return PAGE_COUNT;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabTitles[position];
	}
}
