package cgodin.qc.ca.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import cgodin.qc.ca.metier.IAnnoncerMetier;
import cgodin.qc.ca.model.ProductForRent;

@Controller
@RequestMapping(value="/adminad")
public class AnnonceController {
	@Autowired
	private  IAnnoncerMetier annoncerMetier;
	@RequestMapping(value="/home")
	public String home (Model model) {
		model.addAttribute("prod",new ProductForRent());
		model.addAttribute("prods",annoncerMetier.getallProduct());
		model.addAttribute("categorys", annoncerMetier.getAllCategory());
		return "MyAdds";
		}
	
	@RequestMapping(value="/listAd")
	public String listerAd(Model model) {
	model.addAttribute("prods", annoncerMetier.getallProduct());
	model.addAttribute("categorys", annoncerMetier.getAllCategory());
	 return "listAd";
	}
	
	@RequestMapping(value="/deleteAd")	
	public String deleteCat(int idAd, Model model) {
		annoncerMetier.deleteProduct(idAd);
		 return "listAd";
	}
	
	@RequestMapping(value="/display")	
     public String display(int idAd, Model model) {
		ProductForRent p= annoncerMetier.getProductById(idAd);
		model.addAttribute("prod",p);
		model.addAttribute("categorys", annoncerMetier.getAllCategory());
		//metier.updateCategory(c);
		//model.addAttribute("categorys", metier.getAllCategory());
		return "MyAdds";
	}
	
	@RequestMapping(value="/saveAds")
	public String saveAdds(@Valid ProductForRent p, BindingResult result, Model model,MultipartFile file) throws IOException {
		
		if(result.hasErrors()) {
			model.addAttribute("prod",new ProductForRent());
		    model.addAttribute("categorys", annoncerMetier.getAllCategory());
			return "MyAdds";
			
		      }
		
	if (!file.isEmpty()) {
			//get temporary path from user
	   
		String path=System.getProperty("java.io.tmpdir");
		p.setPicture(file.getOriginalFilename());
	    
		int id_picture = 0;
		if(p.getIdProduct()==0) {
		id_picture=annoncerMetier.addProduct(p, p.getCategory().getIdCategory());	
		    }
		else {
			annoncerMetier.updateProduct(p);
		     }
		file.transferTo(new File(path+"/"+"ad"+id_picture+file.getOriginalFilename()));
	}
		
		else {
			if(p.getIdProduct()==0) 
			annoncerMetier.addProduct(p, p.getCategory().getIdCategory());
			else
				annoncerMetier.updateProduct(p);
		}
			
	model.addAttribute("prod",new ProductForRent());
	model.addAttribute("prods",annoncerMetier.getallProduct());
	model.addAttribute("categorys",annoncerMetier.getAllCategory());
	return "listAd";
		}
	
	
	@RequestMapping(value="adPicture",produces=MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
		public byte[] getPictureFromUser(int idAd) throws IOException {
		ProductForRent p=annoncerMetier.getProductById(idAd);
		File f=new File(System.getProperty("java.io.tmpdir")+"/"+"ad"+idAd+p.getPicture());
		return IOUtils.toByteArray(new FileInputStream(f));
		
	}

	
}
