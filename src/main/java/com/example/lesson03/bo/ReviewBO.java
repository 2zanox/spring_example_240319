package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.domain.Review;
import com.example.lesson03.mapper.ReviewMapper;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;
	
	// ex01
	
	// input: (int)id
	// output: Review(단건) or null
	public Review getReviewById(int id) {
		return reviewMapper.selectReviewById(id);
	}
	
	// ex02
	
	// input: Review
	// output: 성공한 행의 개수(int)
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsfield(int storeId, String menu,
			 String userName, Double point, String review) {
		return reviewMapper.insertReviewAsfield(storeId, menu, userName, point, review);
	}
	
	// ex03
	
	// input: id, review
	// output: 성공한 행의 개수(int)
	public int updateReviewById(int id, String review) {
		return reviewMapper.updateReviewById(id, review);
	}
	
	// ex04
	
	// input: id
	// output: 리턴타입(int or void) -> void = X
	public void deleteReviewById(int id) {
		reviewMapper.deleteReviewById(id);
	}
	
}
