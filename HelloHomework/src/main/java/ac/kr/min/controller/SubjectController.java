package ac.kr.min.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ac.kr.min.model.Subject;
import ac.kr.min.service.SubjectService;

@Controller
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	
	@RequestMapping(value = "/semester", method = RequestMethod.GET)
	public String showSubject(Model model) {
		System.out.println("abc");
		List<Subject> sem = subjectService.getSubjectsBySemester();
		model.addAttribute("subjects", sem);

		for(int i=0;i<sem.size();i++) {
		System.out.println(sem.get(i).getYear()+""+sem.get(i).getGrades());
		}
		return "semester";
	}
	
	
	
	@RequestMapping("/division")
	public String showSubjectsBySelect(Model model) {

	

		List<Subject> se = subjectService.getSubjectsByDivision();

		model.addAttribute("subjects", se);

		

		return "division";

	}
	@RequestMapping("/detail")
	public String showSubjects(Model model, @RequestParam(value="year") String year,

			@RequestParam(value="semester") String semester) {

		

		List<Subject> subjects = subjectService.getSubjectBySelect(Integer.parseInt(year), Integer.parseInt(semester));

		model.addAttribute("subjects", subjects);

		

		return "detail";

	}
	@RequestMapping("/insert")
	public String doCreate(Model model, @Valid  Subject Subject, BindingResult result) {

		System.out.println("subject"+Subject.getCourse_id()+","+Subject.getName());
		if (result.hasErrors()) {

			System.out.println("===Form data does not validated");

			List<ObjectError> errors = result.getAllErrors();

			for (ObjectError error : errors) {

				System.out.println(error.getDefaultMessage());

			}
			return "enrolment";
		}
		subjectService.insert(Subject);
		model.addAttribute("success", "success");
		return "home";
	}
	@RequestMapping(value = "/enrolment", method = RequestMethod.GET)
	public String enrolment(Locale locale, Model model) {
		model.addAttribute("Subject", new Subject());

		return "enrolment";
	}

	@RequestMapping("/show_enrolment")

	public String showSubjectsBySelect(Model model, @RequestParam(value="year") String year) {

	

		List<Subject> subjects = subjectService.getEnrolment(Integer.parseInt(year));

		model.addAttribute("subjects", subjects);


		

		return "show";

	}

	
	
	

}
