package com.rghosh.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Questionbankservice {
	
	@Autowired
	private QuestionbankRepository questionbankrepository;
	
	/*private List<Question> questionbank = Arrays.asList(new Question(1,"Question Text1", 
                                                               Arrays.asList("a","b","c","d"), 
                                                               Arrays.asList("a","d"),
                                                               Arrays.asList("comp sc","java", "REST"),
                                                               7),
			                                              new Question(2,"Question Text2", 
	                                                           Arrays.asList("a","b","c","d"), 
	                                                           Arrays.asList("a","c"),
	                                                           Arrays.asList("comp sc","java", "MVC"),
	                                                            7));
	*/
    //Get all the questions from Questionbank repository
	
	public List<Question> getQuestionbank() {
		
		List<Question> questions = new ArrayList<>();
		
		questionbankrepository.findAll().forEach(questions::add);
		return questions;
	}
// To Do 
	public void setQuestionbank(List<Question> questionbank) {
		// this.questionbank = questionbank;
	}
		
	//Create question
	public void addQuestion (Question question)		{
		questionbankrepository.save(question);
		
	}
	
	//Read Question from question bank
	public Question getQuestionbyId(int id) {
		
		return questionbankrepository.findOne(id);
	}
	
	//Delete Question from question bank
	public void deleteQuestionbyId(int id) {
		questionbankrepository.delete(id);
	}

}
