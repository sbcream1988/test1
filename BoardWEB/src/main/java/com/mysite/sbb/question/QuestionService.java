package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mysite.sbb.DataNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public Page<Question> getList(int page){
		List<Sort.Order> sorts = new ArrayList<>();
		sorts.add(Sort.Order.desc("createDate"));
		Pageable pagable = PageRequest.of(page, 10, Sort.by(sorts));
		return this.questionRepository.findAll(pagable);
	}
	
	public void create(String subject, String content) {
		Question question = new Question();
		question.setSubject(subject);
		question.setContent(content);
		question.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(question);
	}
	
	public Question getQuestion(Integer id) {
		Optional<Question> oq = this.questionRepository.findById(id);
		if(oq.isPresent()) {
			return oq.get();
		}else {
			throw new DataNotFoundException("객체 없음");
		}
	}
	
	
}
