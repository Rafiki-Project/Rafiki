package com.iti.eg.rafikilauncher;

import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.widget.GridView;
import android.widget.Toast;

public class RafikiMainActivity extends Activity {

	class Pac{
		Drawable icon;
		String name;
		String label;
	}
	Pac[] pacs;
	PackageManager pm;
	GridView drawerGrid;
	DrawerAdapter appsDrawer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rafiki_main);
		pm = getPackageManager();
		drawerGrid = (GridView) findViewById(R.id.content);
		set_pacs();
		appsDrawer = new DrawerAdapter(getApplicationContext(), pacs);
		drawerGrid.setAdapter(appsDrawer);
	}
	public void set_pacs(){
		final Intent mainIntent = new Intent(Intent.ACTION_MAIN,null);
		mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
		List<ResolveInfo> pacsList = pm.queryIntentActivities(mainIntent, 0);
		pacs= new Pac[pacsList.size()];
		for(int i=0;i<pacsList.size();i++){
			pacs[i]= new Pac();
			pacs[i].icon =pacsList.get(i).loadIcon(pm);
			pacs[i].label= pacsList.get(i).loadLabel(pm).toString();
			pacs[i].name = pacsList.get(i).activityInfo.packageName;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rafiki_main, menu);
		return true;
	}

}
