package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class BoardWebApplicationTests {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Test
//	@Transactional // 두 개 이상 메소드가 있어야 동작
	void contextLoads() {

		
		
//		Question q1 = new Question();
//		q1.setSubject("질문이 있습니다");
//		q1.setContent("슬랙, 노션, 디스코드 뭘 써야하나요?");
//		q1.setCreateDate(LocalDateTime.now());
//		//데이터 베이스에 insert 기능을 실행
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링 부트 모델 질문입니다");
//		q2.setContent("모델이란 무엇인가요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//		
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		System.out.println(all.size());
//		
//		Question q = all.get(0);
//		System.out.println(q);	//주소
//		System.out.println(q.getContent());
//		System.err.println(q.getSubject());
//		System.out.println(q.getCreateDate());
//		
//		//Select * from question where id = ?
//		Optional<Question> oq = questionRepository.findById(1);
//		Question q = oq.get();
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent());
//		System.out.println(q.getCreateDate());
//		
//		if(oq.isPresent()) {
//			Question q1 = oq.get();
//			assertEquals("sbb란 무엇인가요", q1.getSubject());
//		}
//		
//		Question q2 = oq.get();
//		assertEquals("sbb란 무엇인가요", q2.getSubject());
//		
//		
//		//Select * from question where subject = ?
//		//find필드명 findBySubject() 메소드
//		
//		Question q = this.questionRepository.findBySubject("sbb란 무엇인가요");
//		assertEquals(1, q.getId());
//		
//		//select * from question subject = ? and content = ?
//		
//		Question q = this.questionRepository.findBySubjectAndContent("sbb란 무엇인가요", "sbb에 대해서 알고 싶습니다"	);
//		System.out.println(q.getSubject());
//		System.out.println(q.getContent());
//		System.out.println(q.getId());		
//		
//		//findBySubjectOrContent
//		
//		
//		//findBySubjectLike
//		
//		List<Question> qList = this.questionRepository.findBySubjectLike("%sbb%");
//		Question q1 = qList.get(0);
//		System.out.println(q1.getSubject());
//		System.out.println(q1.getContent());
//		
//		//findBySubjectOrderByCreateDateASC
//		List<Question> qList = this.questionRepository.findBySubjectOrderByCreateDateAsc("스프링 부트 모델 질문입니다");
//		for(Question q : qList) {
//			System.out.println(q.getId() + ", " + q.getContent() + ", " + q.getSubject());
//		}
//		
//		
//		//수정
//		Optional<Question> oq = this.questionRepository.findById(1);
//		Question q = oq.get();
//		q.setSubject("수정된 제목");
//		q.setContent("내용도 수정");
//		this.questionRepository.save(q);
//		
//		//삭제
//		Optional<Question> oq = this.questionRepository.findById(1);
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		
//		Optional<Question> oq = this.questionRepository.findById(2);
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("답변은 여러개 등록 가능합니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
//		
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		Answer a = oa.get();
//		System.out.println(a.getQuestion().getId() + ", " + a.getQuestion().getSubject());
//		
//		Optional<Question> oq = this.questionRepository.findById(2);
//		Question q = oq.get();
//		List<Answer> aList= q.getAnswerList();
//		
//		for(Answer a:aList) {
//			System.out.println(a.getContent());
//			System.out.println(a.getCreateDate());
//			System.out.println(a.getQuestion().getContent());
//		}
//
//		
//		for(int i = 1; i <=300; i++) {
//			String subject = String.format("테스트데이터입니다:[%03d]", i);
//			String content = "내용 없음";
//			this.questionService.create(subject, content);
//		}
		
	}

}
