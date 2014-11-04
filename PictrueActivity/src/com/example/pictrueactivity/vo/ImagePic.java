package com.example.pictrueactivity.vo;

import java.io.Serializable;

public class ImagePic implements Serializable{
		
	private String imageStr;

	public ImagePic(String imageStr) {
		super();
		this.imageStr = imageStr;
	}

	public ImagePic() {
		super();
	}

	public String getImageStr() {
		return imageStr;
	}

	public void setImageStr(String imageStr) {
		this.imageStr = imageStr;
	}
	
	
}
