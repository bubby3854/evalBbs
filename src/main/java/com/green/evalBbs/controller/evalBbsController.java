package com.green.evalBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class evalBbsController {

	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
<<<<<<< HEAD
	@GetMapping("/list")
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
