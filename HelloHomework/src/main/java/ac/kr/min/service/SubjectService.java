package ac.kr.min.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.kr.min.dao.SubjectDAO;
import ac.kr.min.model.Subject;

@Service
public class SubjectService {

	@Autowired
	private SubjectDAO subjectDao;
	
	public List<Subject> getSubjectsBySemester(){
		
		return subjectDao.getSubjectsBySemester();
	}
	public List<Subject> getSubjectsByDivision() {
		// TODO Auto-generated method stub
		return subjectDao.getSubjectsByDivision();
	}
	public List<Subject> getSubjectBySelect(int year, int semester){
		return subjectDao.getSubjectBySelect(year, semester);
	}
	public void insert(Subject subject) {
		subjectDao.insert(subject);
	}
	public List<Subject> getEnrolment(int parseInt) {
		return subjectDao.getEnrolment(parseInt);
		
	}
}
