package ac.kr.min.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ac.kr.min.model.Subject;

@Repository
public class SubjectDAO {
	 private JdbcTemplate jdbcTemplate;

	    @Autowired
	    public void setDataSource(DataSource dataSource){
	        jdbcTemplate=new JdbcTemplate(dataSource);
	    }
	    
	    public List<Subject> getSubjectsBySemester(){
	    	String sqlStatement = "select year, semester, sum(grades) from course group by year, semester";
	    	return jdbcTemplate.query(sqlStatement, new RowMapper<Subject>() {

				@Override
				public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

					Subject subject = new Subject();
					
					subject.setGrades(rs.getInt("sum(grades)"));
					subject.setSemester(rs.getInt("semester"));
					subject.setYear((rs.getInt("year")));

					return subject;

				}
			});
	    }
	    
	    public List<Subject> getSubjectsByDivision(){
	    	String sqlStatement = "select division, sum(grades) from course group by division";
	    	return jdbcTemplate.query(sqlStatement, new RowMapper<Subject>() {

				@Override
				public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

					Subject subject = new Subject();
					
					subject.setGrades(rs.getInt("sum(grades)"));
					subject.setDivision(rs.getString("division"));

					return subject;

				}
			});
	    }
	    
	    public List<Subject> getSubjectBySelect(int year, int semester) {

			String sqlStatement = "select * from course where year=? and semester=?";

			return jdbcTemplate.query(sqlStatement, new Object[] { year,semester }, new RowMapper<Subject>() {

				@Override
				public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {

					Subject subject = new Subject();
					subject.setCourse_id(rs.getString("course_id"));
					subject.setGrades(rs.getInt("grades"));
					subject.setSemester(rs.getInt("semester"));
					subject.setName(rs.getString("name"));
					subject.setDivision(rs.getString("division"));
					subject.setYear((rs.getInt("year")));

					

					return subject;

				}

			});

		}
	    
	    public boolean insert(Subject subject) {

			String course_id = subject.getCourse_id();
			int grades = Integer.parseInt(subject.getGrades());
			int semester = Integer.parseInt(subject.getSemester());
			String name = subject.getName();
			String division = subject.getDivision();
			int year = Integer.parseInt(subject.getYear());

			String sqlStatement = "insert into course (year,semester,course_id,name,division,grades) values (?, ?, ?, ?, ?, ?)";
			return (jdbcTemplate.update(sqlStatement, new Object[] {year, semester, course_id, name, division, year}) == 1);

		}

		public List<Subject> getEnrolment(int parseInt) {
			String sqlStatement = "select * from course where year=?";

			return jdbcTemplate.query(sqlStatement, new Object[] { parseInt }, new RowMapper<Subject>() {
				public Subject mapRow(ResultSet rs, int rowNum) throws SQLException {
					
					System.out.println("get1:"+ rs.getString("course_id")+","+rs.getInt("grades"));
					Subject subject = new Subject();
					subject.setCourse_id(rs.getString("course_id"));
					subject.setGrades(rs.getInt("grades"));
					subject.setSemester(rs.getInt("semester"));
					subject.setName(rs.getString("name"));
					subject.setDivision(rs.getString("division"));
					subject.setYear((rs.getInt("year")));
					System.out.println("get: "+ subject.getCourse_id()+","+subject.getName());
					return subject;

				}

			});
			
		}
}
