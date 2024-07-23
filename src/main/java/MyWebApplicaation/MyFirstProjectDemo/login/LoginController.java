package MyWebApplicaation.MyFirstProjectDemo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	private AuthicationSerivce Authicate;
	LoginController(AuthicationSerivce Authicate)
	{
		super();
		this.Authicate=Authicate;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
@RequestMapping(value="/",method=RequestMethod.GET)
	public String loginPage()
	{
		return "login";
	}
	
 	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginPage(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
	    
 		if(Authicate.Authicate(name, password))
 		{
 			model.put("name", name);
 			model.put("password", password);
 			return "welcome";
 		}
 		model.put("error","Invalid Username or Password. Please Try Again");
		return "login";
	}
//	

	@RequestMapping("/test")
	public String test(@RequestParam String s,ModelMap model)
	{
		
		 model.put("name",s);
		return "temp";
		
	}
}
