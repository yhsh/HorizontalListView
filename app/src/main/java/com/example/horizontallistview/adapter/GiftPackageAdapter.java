package com.example.horizontallistview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.horizontallistview.R;


/**
 * 可领取礼包列表的adapter
 *
 * @author xiayiye5
 * 2020年6月5日19:45:58
 */
public class GiftPackageAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return 13;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GiftPackageHolder giftPackageHolder;
        if (convertView == null) {
            giftPackageHolder = new GiftPackageHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gift_package, null);
            giftPackageHolder.tvJsWorld = convertView.findViewById(R.id.tv_js_world);
            giftPackageHolder.tvReward = convertView.findViewById(R.id.tv_reward);
            convertView.setTag(giftPackageHolder);
        } else {
            giftPackageHolder = (GiftPackageHolder) convertView.getTag();
        }
        giftPackageHolder.tvJsWorld.setText("新版机锋世界" + position);
        giftPackageHolder.tvReward.setText(new StringBuilder("有").append(position).append("个公会奖励可领取"));
        return convertView;
    }

    class GiftPackageHolder {
        TextView tvJsWorld, tvReward;
    }
}
