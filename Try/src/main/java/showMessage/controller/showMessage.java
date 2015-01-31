package showMessage.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class showMessage {

	@RequestMapping(value = "/showMessage.html", method = RequestMethod.GET)
    public String indexpage(Locale locale, Model model, HttpSession session) {
            //logger.info("Welcome home! The client locale is {}.", locale);
  
			model.addAttribute("message", "Welcome");
                    
            return"showMessage";
            }
    }

