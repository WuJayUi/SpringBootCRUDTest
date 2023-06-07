package com.fstop.test.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fstop.test.entity.test;
import com.fstop.test.service.exampleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/example")
@Slf4j
public class ExampleController {
	@Autowired
	exampleService examS;
//	@Autowired
//	ModelAndView mv;
//	private String error = "Pages";
	private String message = "Pages";

	@GetMapping("/test")
	public String index(Map<String, Object> model) {
		log.info("TEST controller");
		this.message = "新建腳色ID及姓名";
		model.put("message", this.message);
		return "test";
	}

	@PostMapping("/confirm")
	public String createUser(@RequestParam Map<String, Object> model, Map<String, Object> map) {
		
//		if(model.get("id") == null || model.get("name") == null ) {
//			log.info("TEST controller");
//			this.error = "ID或NAME不得為空";
//			map.put("error", this.error);
//			return "test";
//		}
		log.info("confirm");
		this.message = "確定要新建嗎?";
		map.put("message", this.message);
		map.put("id", model.get("id"));
		map.put("name", model.get("name"));
		return "confirm";
		
	}

//	@PostMapping("/confirm")
//	public ModelAndView aaa(@RequestParam Map<String, Object> model) {
//		ModelAndView mv = new ModelAndView();
//		mv.addAllObjects(model);
//		mv.setViewName("confirm");
//		return mv;
//	}

	@PostMapping("/result")
	public String saveUser(@RequestParam Map<String, Object> model, Map<String, Object> map) {
		log.info("result");
		this.message = "成功建立腳色";
//		String s = (String) model.get("id");
//		String y = (String) model.get("name");
//		test tx = new test();
//		tx.setId(s);
//		tx.setName(y);
		
		test tx = new test((String) model.get("id"),(String) model.get("name"));
		examS.createUser(tx);
		List<test> list = examS.getTestList();
		map.put("message", this.message);
		map.put("list", list);
		return "result";
	}

	@PostMapping("/update/{id}")
	public String updateUser(@PathVariable("id") String id, Map<String, Object> map) {
		log.info("update");
		this.message = "修改確認";
//		test tx = examS.getTestById(id);
//		map.put("tx", tx);
		test list = examS.getTestById(id);
		map.put("message", this.message);
		map.put("id", list.getId());
		map.put("name", list.getName());

		return "update";
	}

//	@GetMapping("/listAll")
//	public String listAll(Map<String, Object> map) {
//		List<test> list = examS.getTestList();
//		map.put("list", list);
//		return "result";
//	}

	@PostMapping("/exUpdate")
	public String exUpdate(@RequestParam Map<String, Object> model, Map<String, Object> map) {
		log.info("exUpdate");
		this.message = "所有角色";
		test tx = new test((String) model.get("id"), (String) model.get("name"));
		examS.upDateUser(tx);
		List<test> list = examS.getTestList();
		map.put("message", this.message);
		map.put("list", list);
		return "result";
//		return listAll(map);
	}

	@PostMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") String id, Map<String, Object> map) {
		examS.deleteUser(id);
		List<test> list = examS.getTestList();
		map.put("list", list);
		return "result";
	}

	@PostMapping("/all")
	public String allUser(@RequestParam Map<String, Object> model, Map<String, Object> map) {
		log.info("result");
		this.message = "所有腳色";
		List<test> list = examS.getTestList();
		map.put("message", this.message);
		map.put("list", list);
		return "result";
	}
}
