package com.example.springedu.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController3 {
	@Autowired
	ServletContext context; 
	@RequestMapping("/uploadForm3")
	public void formFile() {
	}

	/*@Value("${file.upload.path}")
	private String filepath;*/

	@RequestMapping("/upload3")
	public ModelAndView saveFile(MultipartRequest mreq) {
		ModelAndView mav = new ModelAndView();
		List<MultipartFile> list = mreq.getFiles("mfile");
		System.out.println(list.size()+"개가 업로드 됨");
		String resultStr = "";
		String path = "/uploadtest/multi";
		File isDir = new File(path);
		if (!isDir.isDirectory()) {
			isDir.mkdirs();
		}
		mav.setViewName("uploadForm3");
		for (MultipartFile mfile : list) {
			String fileName = mfile.getOriginalFilename();
			try {
				/* CASE 1 */
				File f = new File("/uploadtest/multi/" + fileName);
				/* CASE 2
				String fileInfo = "src/main/resources/static/images/"+fileName;
				File f = new File(fileInfo);
				*/
				if (f.exists()) {
					resultStr += fileName + " : 파일이 이미 존재해요!!<br>";
				} else {
					/* CASE 1 */
					//mfile.transferTo(f);
					/* CASE 2 */
					FileOutputStream fos = new FileOutputStream(f);
					fos.write(mfile.getBytes());
					fos.close();
					resultStr += fileName + " : 파일이 저장되었어요!!<br>";
				}
			} catch (IOException e) {
				e.printStackTrace();
				resultStr += fileName + " : 오류가 발생했어요!!<br>";				
			}
		}
		mav.addObject("msg", resultStr);	
		return mav;
	}
}
