
package com.jspiders.spring_mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspiders.spring_mvc.pojo.AdminPOJO;
import com.jspiders.spring_mvc.pojo.StudentPOJO;
import com.jspiders.spring_mvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService service; 

	//Home Page Controller
	@GetMapping("/home")
	public String home(@SessionAttribute(name = "login", required = false)AdminPOJO admin, ModelMap map) {
		if (admin != null) {
			return "Home";
		}
		map.addAttribute("msg", "Session inactive. Login to proceed..!");
		return "Login";
	}
	
	//Add student controller
	@PostMapping("/add")
	public String addStudent(@RequestParam String name,
							@RequestParam String email,
							@RequestParam long contact,
							@RequestParam String address,
							ModelMap map) {
		
		StudentPOJO pojo=service.addStudent(name, email, contact, address);
		
		//success
		if(pojo != null) {
			map.addAttribute("msg","Data inserted successfully..!");
			List<StudentPOJO> students = service.findAllStudents();
			map.addAttribute("students", students);
			return "Add";
		}
		
		//failure
		map.addAttribute("msg","Data not inserted..!");
		List<StudentPOJO> students = service.findAllStudents();
		if (!students.isEmpty()) {
			map.addAttribute("students", students);
		}
		return "Add";
	}
	
	//Add Page Controller
	@GetMapping("/add")
	public String addPage(@SessionAttribute(name = "login", required = false)AdminPOJO admin, ModelMap map) {
		List<StudentPOJO> students = service.findAllStudents();
		if (!students.isEmpty()) {
			map.addAttribute("students", students);
			return "Add";
		}
		return "Add";
	}
	
	//Search Page Controller
	@GetMapping("/search")
	public String searchPage() {
		return "Search";
	}
	
	//Search Student Controller
	@PostMapping("/search")
	public String searchStudent(@RequestParam int id, ModelMap map) {
		
		StudentPOJO pojo = service.searchStudent(id);
		//success
		
		if (pojo != null) {
			map.addAttribute("student",pojo);
			map.addAttribute("msg", "Student Data Found..!");
			return "Search";
		}
		map.addAttribute("msg", "Student Data not found..!");
		//
		return "Search";
		
	}
	
	//Remove Page Controller
	@GetMapping("/remove")
	public String removePage(ModelMap map) {
		List<StudentPOJO> students = service.findAllStudents();
		
		//Success
		if (!students.isEmpty()) {
			map.addAttribute("students", students);
		return "Remove";
		}
		map.addAttribute("msg", "No Data Present..!");
		return "Remove";
	}
	
	//Remove Student Controller
	@PostMapping("/remove")
	public String removeStudent(@RequestParam int id, ModelMap map) {
		StudentPOJO pojo = service.removeStudent(id);
		List<StudentPOJO> students = service.findAllStudents();
		
		//success
		if (pojo != null) {
			map.addAttribute("msg", "Data removed successfully..!");
			map.addAttribute("students", students);
			return "Remove";
		}
		
		//failure
		map.addAttribute("msg", "Data does not exist..!");
		map.addAttribute("students", students);
		return "Remove";
	}
	
	//Update Page Controller
	@GetMapping("/update")
	public String updatePage() {
		return "Update";
	}
	
	//Update from controller
	
	
	//Update student Controller
	
	//Logout Controller
	@GetMapping("/logout")
	public String logout() {
		return "Login";
	}
}
