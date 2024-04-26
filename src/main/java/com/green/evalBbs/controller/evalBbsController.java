package com.green.evalBbs.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

@Controller
public class EvalBbsController {
	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/")	
	public String indexPage() {
		return "index";
		
	}
	@RequestMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", dao.getList());
		
		return "list";
	}
	@GetMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest request, String title, String content, String writer) {
		
		String title_= request.getParameter("title");
		String content_= request.getParameter("content");
		String writer_= request.getParameter("writer");
		dao.write(title_, content_, writer_);
		
		return "redirect:list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("bno") String bno, Model model) {
	    EvalBbsDto dto = dao.getDto(bno);
	    model.addAttribute("dto", dto);
	    return "detail";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("bno") String bno) {
	  
	    dao.delete(bno);
	    return "redirect:list";
	}

}
