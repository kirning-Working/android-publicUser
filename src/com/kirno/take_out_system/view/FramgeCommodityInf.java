package com.kirno.take_out_system.view;

import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.DtoMainCommodity;
import com.kirno.take_out_system.entity.Commodity;

public class FramgeCommodityInf extends Fragment {

	/**
	 * 获取图片控件
	 */
	private ImageView imgView;
	/**
	 * 获取介绍控件
	 */
	private TextView txtIntroduce;
	/**
	 * 获取商店控件
	 */
	private TextView txtShop;
	/**
	 * 获取评论控件
	 */
	private ListView listView;
	/**
	 * 详细界面显示的数据
	 */
	private List<Commodity> infData;

	public FramgeCommodityInf() {
		infData = DtoMainCommodity.getInstance().getData();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_caiinf, container,
				false);
		// 获取控件
		imgView = (ImageView) rootView.findViewById(R.id.img);
		txtIntroduce = (TextView) rootView.findViewById(R.id.inf_introduce);
		txtShop = (TextView) rootView.findViewById(R.id.inf_infShop);
		listView = (ListView) rootView.findViewById(R.id.inf_talk);

		init();
		return rootView;
	}

	/**
	 * 获取值
	 */
	private void init() {
		for (Commodity com : infData) {
			if (com.getName() == "") {
				imgView.setImageResource(com.getImageId());
				txtIntroduce.setText(com.getIntroduce());
				txtShop.setText(com.getShop());
				ArrayAdapter<String> listAdapter = new ArrayAdapter<>(
						getActivity(), R.id.inf_talk, com.getTalk());
				listView.setAdapter(listAdapter);
			}
		}

	}

}
