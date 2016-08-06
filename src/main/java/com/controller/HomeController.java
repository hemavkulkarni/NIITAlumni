package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{	
	    @RequestMapping("/")
	    public String Index()
	    {
	    	return ("index");
	    }
	    @RequestMapping("/Blogs")
	    public String blogs()
	    {
	    	return ("Blogs");
	    }@RequestMapping("/Forum")
	    public String forum()
	    {
	    	return ("Forum");
	    }@RequestMapping("/Login")
	    public String login()
	    {
	    	return ("Login");
	    }/*@RequestMapping("/Register")
	    public String register()
	    {
	    	return ("Register");
	    }*/
	    @RequestMapping("/About")
	    public String aboutus()
	    {
	    	return ("About");
	    }
	    @RequestMapping("/JoinUs")
	    public String joinus()
	    {
	    	return ("JoinUs");
	    }
	    @RequestMapping("/GetInfo")
	    public String getinfo()
	    {
	    	return ("GetInfo");
	    }
	    @RequestMapping("/Engage")
	    public String engage()
	    {
	    	return ("Engage");
	    }
	    @RequestMapping("/Benefits")
	    public String benefits()
	    {
	    	return ("Benefits");
	    }
}