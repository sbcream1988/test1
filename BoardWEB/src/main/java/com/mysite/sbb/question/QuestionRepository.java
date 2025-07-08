package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	//findBySubject 제목으로 검색
	Question findBySubject(String subject);
	
	//findBySubjectAndContent 	select * from question where subject = ? and content = ?
	Question findBySubjectAndContent(String subject, String content);
	
	//findbySubjectLike
	List<Question> findBySubjectLike(String subject);
		
	//findBySubjectOrContent
	List<Question> findBySubjectOrContent(String subject, String Content);
	
	//findBySubjectOrderByCreateDateASC
	List<Question> findBySubjectOrderByCreateDateAsc(String subject);
	
	Page<Question> findAll(Pageable pageable);
}
