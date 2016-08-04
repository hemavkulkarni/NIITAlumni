package com.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Model.Blog;
import com.service.BlogService;

@Controller
public class BlogController {
	@Autowired
	ServletContext req;

	@Autowired
	BlogService service;

	@RequestMapping("/BlogView")
	public ModelAndView viewBlog() {
		// System.out.println("in view all");
		List<Blog> blogList = service.getList();
		// System.out.println("end view all");
		return new ModelAndView("BlogView", "blogList", blogList);

	}

	@RequestMapping("/admin/blogViewApprove")
	public ModelAndView viewBlogApprove() {
		// System.out.println("in view all");
		List<Blog> blogList = service.getListApprove();
		// System.out.println("end view all");
		return new ModelAndView("BlogViewApprove", "blogList", blogList);

	}

	@RequestMapping(value = "/BlogAdd", method = RequestMethod.GET)
	public ModelAndView addBlog(@ModelAttribute("command") Blog blogBean, BindingResult result) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$");

		ModelAndView model = new ModelAndView("BlogAdd");
		model.addObject("blog", blogBean);
		// System.out.println("Hello1");
		return model;

	}

	@RequestMapping(value = "/BlogSave", method = RequestMethod.POST)

	public ModelAndView saveBlog(@ModelAttribute("blog") Blog blogBean, BindingResult result) {
		service.addBlog(blogBean);
		return new ModelAndView("BlogAdd");
	}

	@RequestMapping("/admin/BlogDelete")
	public String deleteBlog(@RequestParam("blogid") int blogid) {
		service.deleteBlog(blogid);
		return "redirect:ViewAll";

	}

	@RequestMapping("/admin/blogApprove")
	public ModelAndView approveBlog(@RequestParam int blogid, @ModelAttribute Blog blog) {
		Blog blogObject = service.getBlogbyId(blogid);
		// System.out.println("EditMovie:"+movieObject.getMoviename());
		return new ModelAndView("BlogApprove", "blog", blogObject);
	}

	@RequestMapping("/admin/updateBlog")
	public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog, BindingResult result) {
		service.approveBlog(blog);
		return new ModelAndView("redirect:BlogView");

	}

	@RequestMapping("/BlogViewRecord")
	public ModelAndView getRecord(@RequestParam int blogid, @ModelAttribute Blog blog) {
		System.out.println("Hello");
		Blog blogObject = service.getBlogbyId(blogid);
		System.out.println("Hello");
		return new ModelAndView("BlogViewRecord", "blogObject", blogObject);
	}
}