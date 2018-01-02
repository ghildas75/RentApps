package cgodin.qc.ca.controllers;


import java.io.ByteArrayInputStream;
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
import cgodin.qc.ca.metier.IManager;
import cgodin.qc.ca.model.Category;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
@Autowired
private IManager adminMetier;
@RequestMapping(value="/index")	
public String index(Model model) {
	model.addAttribute("category",new Category());
    return "pageAdmin";
}

@RequestMapping(value="deleteCat")	
public String deleteCat(int idCat, Model model) {
	adminMetier.deleteCategoryByid(idCat);
	model.addAttribute("categorys", adminMetier.getAllCategory());
	return"listCat";
}
@RequestMapping(value="display")	

public String display(int idCat, Model model) {
	Category c= adminMetier.getCategoryById(idCat);
	model.addAttribute("category",c);
	return "pageAdmin";
}

@RequestMapping(value="/listCat")
public String listCat(Model model) {
	model.addAttribute("categorys", adminMetier.getAllCategory());
	return"listCat";
}


@RequestMapping(value="/saveIt")
public String saveCategory(@Valid Category c, BindingResult result, Model model,MultipartFile file) throws IOException {
	
	if(result.hasErrors()) {
		model.addAttribute("category",new Category());
		return "pageAdmin";
	  }
	verifyNoUpload(c, file);
	//update or edit if we have category in the fiels we make update no category just save 
	//update
	if(c.getIdCategory()!=0) {
			
		if (file.isEmpty()){
			Category c2=adminMetier.getCategoryById(c.getIdCategory());
			c.setPictures(c2.getPictures());
			                }
			
			else 
		adminMetier.updateCategory(c);
		model.addAttribute("categorys", adminMetier.getAllCategory());
		return "listCat";
			
		     }
	//save
	else 
	adminMetier.addCategory(c);
	model.addAttribute("category",new Category());
   return "pageAdmin";
	
	
}

private void verifyNoUpload(Category c, MultipartFile file) throws IOException {
	if (!file.isEmpty()) {
		c.setPictures(file.getBytes());
		c.setNamePicture(file.getOriginalFilename());
	        }
}
@RequestMapping(value="catPicture",produces=MediaType.IMAGE_JPEG_VALUE)
@ResponseBody
	public byte[] getPictureFromDataBase(int idCat) throws IOException {

	Category c=adminMetier.getCategoryById(idCat);
	return IOUtils.toByteArray(new ByteArrayInputStream(c.getPictures()));
	
}





}
