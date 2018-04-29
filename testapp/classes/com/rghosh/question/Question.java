package com.rghosh.question;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="question")
public class Question {
	
    //Unique question ID
	@Id
    @Column(name="id")
	private int questionUid;
	
	//Text of the question
	@Column(name="questiontext")
	private String questionText;
	
	//Options to be displayed to as answer
	private String options ;
	
	//Correct Option(s) as a question
	//may have more than one correct answer
    
    @Column(name="correctoption")
	private String correctOption;
	
	//Tag list for question classification
    
	private String tags ;
	
	//Difficulty level of the question
	//ToDo - limit value to 1-10
	private int level;
	
	
	public Question() {
		
	}
	
	


	public Question(int questionUid, String questionText, String options, String correctOption, String tags,
			int level) {
		super();
		this.questionUid = questionUid;
		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
		this.tags = tags;
		this.level = level;
	}




	public int getQuestionUid() {
		return questionUid;
	}


	public void setQuestionUid(int questionUid) {
		this.questionUid = questionUid;
	}


	public String getQuestionText() {
		return questionText;
	}


	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}


	public String getOptions() {
		return options;
	}


	public void setOptions(String options) {
		this.options = options;
	}


	public String getCorrectOption() {
		return correctOption;
	}


	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}


	public String getTags() {
		return tags;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}

	
}
