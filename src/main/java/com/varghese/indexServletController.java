package com.varghese;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller // index used as index Servlet Controller//

public class indexServletController { /*CONTROLLER*/
	
	@RequestMapping("index") // HTML index Page its view
	//public String index(String name, HttpSession session ) { //Model(db) date is String name,session Spring way of writing
	//public String index(@RequestParam("uname") String login, HttpSession session) { /*RequestParam Annotation used for java developer can follow camelcase name. So user can give any name like login etc*/	
	//public ModelAndView index(@RequestParam("uname") String login, HttpSession session) {
	
	public ModelAndView index(userDetails ud) { // userDetails Class
	
		//HttpSession session = request.getSession();
		//String s = request.getParameter("name");
		//session.setAttribute("username", s); /* index.jsp page as $ username its JSTL JSP Standard Tag Library. Tag Library Expression Language */
		
		// DB pass data to view used MV method in order get response
	//	ModelAndView mav = new ModelAndView();
		//mav.addObject("username", login);
		//mav.setViewName("index");
		//session.setAttribute("username", login);/*MODEL OR MODEL*/
		
		// modelview
		ModelAndView mav = new ModelAndView(); // poj class, jsp change to ${details.name},${details.age}, ${details.address}
		mav.addObject("details", ud); // MODEL OBJECT 
		mav.setViewName("index"); // VIEW
	
		return mav;
   // return "index"; /* (VIEW)1. index JASPER PAGE Which downLoaded MAVEN REPO And Config in POM file */ 
    /*2.index.jsp we should not give its against principal of spring MVC its CALLED  SEPERATION OF CONCERN it can be added refer 3 */
    /*3. application. Properties admin/index it file location of each index view*/
    

 }
}

