package com.kirno.take_out_system.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SimpleAdapter;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.TextView;

import com.kirno.take_out_system.R;
import com.kirno.take_out_system.dto.DtoAllOrder;
import com.kirno.take_out_system.entity.Order;

/**
 * 显示所有订单的界面
 * 
 * @author qq303_000
 * 
 */
public class ActivityAllOrder extends ListActivity {

	private List<Map<String, Object>> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		inintList();
		SimpleAdapter simp = new SimpleAdapter(this, list,
				R.layout.fragment_all_order, 
						new String[] {"all_order_orderNumber", "all_order_orderDate","all_order_OrderSum" }, 
						new int[] {	R.id.all_order_orderNumber, R.id.all_order_orderDate,	R.id.all_order_orderSum });
		simp.setViewBinder(new ViewBinder() {

			@Override
			public boolean setViewValue(View view, Object data,
					String textRepresentation) {
				TextView textView = (TextView) view;
				switch (textView.getId()) {
				case R.id.all_order_orderNumber:
					textView.setText(String.valueOf(data));
					break;
				case R.id.all_order_orderDate:
					textView.setText((String) data);
					break;
				case R.id.all_order_orderSum:
					textView.setText(String.valueOf(data));
					break;
				}
				return true;
			}
		});
		setListAdapter(simp);
	}

	private void inintList() {
		list = new ArrayList<>();
		List<Order> orders = DtoAllOrder.getInstance().getData();
		for (Order order : orders) {
			Map<String, Object> temp = new HashMap<String, Object>();
			temp.put("all_order_orderNumber", order.getOrderNumber());
			temp.put("all_order_orderDate", order.getOrderDate());
			temp.put("all_order_OrderSum", order.getOrderSum());
			list.add(temp);
		}
	}

}
