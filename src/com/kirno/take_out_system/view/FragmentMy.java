package com.kirno.take_out_system.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.ctrl.CtrlButton;

/**
 * ÎÒµÄÃæ°å
 * 
 * @author qq303_000
 * 
 */
public class FragmentMy extends Fragment {
	CtrlButton ctrl = CtrlButton.getInstance();
	public FragmentMy() {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater
				.inflate(R.layout.fragment_my, container, false);

		ListView list = (ListView) rootView.findViewById(R.id.my_list);

		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					ctrl.openActivity(getActivity(), ActivityAllOrder.class);					
				}

			}
		});

		return rootView;
	}

}
