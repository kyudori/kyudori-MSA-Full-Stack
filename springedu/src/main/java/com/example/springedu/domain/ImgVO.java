package com.example.springedu.domain;

import org.springframework.web.multipart.MultipartFile;

public class ImgVO {
	private MultipartFile imgFile;
	//private String imgName;

	public MultipartFile getImgFile() {
		return imgFile;
	}
	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}
/*	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}	*/
}
