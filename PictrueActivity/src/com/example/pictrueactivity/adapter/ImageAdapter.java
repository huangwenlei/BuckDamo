package com.example.pictrueactivity.adapter;

import java.util.List;
import java.util.zip.Inflater;

import com.example.pictrueactivity.R;
import com.example.pictrueactivity.vo.ImagePic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	
	private Context mContext;
	private List<ImagePic> images;
	
	public ImageAdapter(Context mContext,List<ImagePic> images){
		this.mContext = mContext;
		this.images = images;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return images.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	ViewHolder mHolder;
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView ==null){
			mHolder = new ViewHolder();
			convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);
			mHolder.mImage = (ImageView) convertView.findViewById(R.id.image);
			convertView.setTag(mHolder);
		}else{
			mHolder = (ViewHolder) convertView.getTag();
		}
		
		
		return convertView;
	}
	
	class ViewHolder{
		ImageView mImage;
	}

}
