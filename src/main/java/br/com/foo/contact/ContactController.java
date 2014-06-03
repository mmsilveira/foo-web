package br.com.foo.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( value = "contact" )
class ContactController {

	@Autowired
	IContactService service;
	
	@RequestMapping( method = RequestMethod.GET )
	@ResponseBody
	public List<Contact> getAll() {
		return service.getAll();
	}
	
}
