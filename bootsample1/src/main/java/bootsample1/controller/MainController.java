package bootsample1.controller;

import java.io.File;
import java.util.Dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import bootsample1.model.TinTuc;
import bootsample1.service.TinTucService;





@Controller
public class MainController{
	
	@Autowired
	private TinTucService tinTucService;
	
	@GetMapping("/")
	public String showForm(){
		return "index";
	}
	
	@RequestMapping(value = "/getTinTuc",method = RequestMethod.GET)
	public String AddNewTinTuc(@RequestParam String txtTitle, @RequestParam String txtContent, @RequestParam String fileUpload)throws Exception{
				File f = new File(fileUpload);
				TinTuc tt = new TinTuc();
				tt.setLink(f.getAbsolutePath());
				tt.setContent(txtContent);
				tt.setTitle(txtTitle);
				tinTucService.save(tt);
			
		return "success";
	}
}
