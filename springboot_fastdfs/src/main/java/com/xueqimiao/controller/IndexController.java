package com.xueqimiao.controller;

import com.xueqimiao.util.PmsUploadUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class IndexController {

	@RequestMapping("index")
    public String index(){
        return "index";
    }
	
	@RequestMapping(value="fileUpload",method=RequestMethod.POST)
	@ResponseBody
	public String fileUpload(@RequestParam("file") MultipartFile multipartFile) {
		String url = PmsUploadUtil.uploadImage(multipartFile);
		return url;
	}
	
}
