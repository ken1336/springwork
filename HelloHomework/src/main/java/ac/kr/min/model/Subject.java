package ac.kr.min.model;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;

import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Subject {
	@Max(value=2019, message="year must be lower than 2019 integer")
	@Min(value=2000, message="year must be higher than 2000 integer")
	private int year;
	
	@Max(value=2, message="year must be lower than 2 integer")
	@Min(value=0, message="year must be higher than 1 integer")
	private int semester;
	
	@Size(min=5, max=8, message="subjectCode must be between 5 and 8 chars")
	private String course_id;
	
	@NotNull
	private String name;
	@Size(min=2, max=4, message="type must be between 2 and 4 chars")
	private String division;
	
	@Max(value=3, message="year must be lower than 3 integer")
	@Min(value=1, message="year must be higher than 1 integer")
	private int grades;
	public String getYear() {
		return String.valueOf(year);
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public String getSemester() {
		return String.valueOf(semester);
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getGrades() {
		return String.valueOf(grades);
	}
	public void setGrades(int grades) {
		this.grades = grades;
	}


}
