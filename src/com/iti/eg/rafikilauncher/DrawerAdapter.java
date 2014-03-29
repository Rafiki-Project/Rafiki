package com.iti.eg.rafikilauncher;

import com.iti.eg.rafikilauncher.RafikiMainActivity.Pac;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class DrawerAdapter extends BaseAdapter {
	Context mainActivityContext;
	RafikiMainActivity.Pac[] pacsforAdapter;
	public DrawerAdapter(Context context, RafikiMainActivity.Pac pacs[]){
		mainActivityContext = context;
		pacsforAdapter = pacs;
	}
	@Override
	public int getCount() {
		return pacsforAdapter.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int pos, View arg1, ViewGroup arg2) {
		ImageView imageview= new ImageView(mainActivityContext);
		imageview.setImageDrawable(pacsforAdapter[pos].icon);
		imageview.setLayoutParams(new GridView.LayoutParams(65,65));
		imageview.setPadding(3, 3, 3, 3);
		return imageview;
	}

}
