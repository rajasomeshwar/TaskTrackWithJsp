package MyWebApplicaation.MyFirstProjectDemo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthicationSerivce {
	public boolean Authicate(String name,String password)
	{
		boolean IsValidName=name.equalsIgnoreCase("RunTime");
		boolean IsValidPassword=password.equalsIgnoreCase("Delete");
		return IsValidName && IsValidPassword;
	}

}
