package com.example.springedu.controller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.example.springedu.domain.FileVO1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController1 {
	@RequestMapping("/uploadForm1")
	public void formFile() {	   
	}
	@RequestMapping("/upload1")
	public ModelAndView saveFile(FileVO1 vo) {
	     String fileName =  vo.getUploadFile().getOriginalFilename();

	     byte[] content = null;
	     ModelAndView mav = new ModelAndView();
	     mav.setViewName("uploadForm1");
	     try {
	    	 content =  vo.getUploadFile().getBytes();
	    	 File f = new File("c:/uploadtest/"+fileName);
	    	 if ( f.exists() ) {
	    		 mav.addObject("msg", fileName + " : 파일이 이미 존재해요!!");
	    	 } else {
	    		 FileOutputStream fos = new FileOutputStream(f);
	    		 fos.write(content);
	    		 fos.close();
	    		 mav.addObject("msg", fileName + ": 파일이 저장되었어요!!");
	    	 }
	     } catch (IOException e) {
	    	 e.printStackTrace();
	    	 mav.addObject("msg", "오류가 발생했어요!!");
	     }	    
	    return mav;
	}
}

