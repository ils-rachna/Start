package LoginController;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes
public class UserLoginController {

	 @RequestMapping(value = "/Welcome", method = RequestMethod.GET)
	    
	 public String addContact(@ModelAttribute("contact") UserLoginData contact, ModelMap model) {
	         
		 
		  String un="Rachana", pass="Synapse";
		 
		  if(contact.getUsername().equals(un) && contact.getPassword().equals(pass))
		  {
			  System.out.println("Welcome " + contact.getUsername());
			  
			  		 
			  String name=contact.getUsername();
				 
				 model.addAttribute("Name",name );
			  
			  	return "/Welcome";  
		  }
		  else
				 return "/Login";  

		  
	 }
	 
	 

	
}
