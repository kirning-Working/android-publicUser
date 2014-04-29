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
	 * ��ȡͼƬ�ؼ�
	 */
	private ImageView imgView;
	/**
	 * ��ȡ���ܿؼ�
	 */
	private TextView txtIntroduce;
	/**
	 * ��ȡ�̵�ؼ�
	 */
	private TextView txtShop;
	/**
	 * ��ȡ���ۿؼ�
	 */
	private ListView listView;
	/**
	 * ��ϸ������ʾ������
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
		// ��ȡ�ؼ�
		imgView = (ImageView) rootView.findViewById(R.id.img);
		txtIntroduce = (TextView) rootView.findViewById(R.id.inf_introduce);
		txtShop = (TextView) rootView.findViewById(R.id.inf_infShop);
		listView = (ListView) rootView.findViewById(R.id.inf_talk);

		init();
		return rootView;
	}

	/**
	 * ��ȡֵ
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
