package com.as.test.tag;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
//add test tag
public class MainActivity extends Activity {

	private TagListView mTagListView;
	private final List<Tag> mTags = new ArrayList<Tag>();
	private final String[] titles = { "1111", "2222222222", "0", "55555555555555555",
			"333ʿ", "7777","88888888", "9999", "74110", "00000000000", "1111" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_tag_activity);

		mTagListView = (TagListView) findViewById(R.id.tagview);
		setUpData();
		mTagListView.setTags(mTags);

		mTagListView.setOnTagClickListener(new TagListView.OnTagClickListener() {

			@Override
			public void onTagClick(TagView tagView, Tag tag) {
				for (int i = 0; i < mTags.size(); i++) {
					Tag t = mTags.get(i);
					if (t.getId() == tag.getId()) {
//						t.setChecked(!tag.isChecked());
						t.setTitle("111");
					}
				}
				mTagListView.setTags(mTags);
			}
		});
	}

	private void setUpData() {
		for (int i = 0; i < 10; i++) {
			Tag tag = new Tag();
			tag.setId(i);
			tag.setChecked(false);
			tag.setTitle(titles[i]);
			tag.setBackgroundResId(R.drawable.tag_bg2);
			mTags.add(tag);
		}
	}
}
