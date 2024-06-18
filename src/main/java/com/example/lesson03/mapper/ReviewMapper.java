package com.example.lesson03.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.lesson03.domain.Review;

@Mapper
public interface ReviewMapper {
	
	// ex01
	// input: (int)id
	// output: Review or null
	public Review selectReviewById(int id);
		
	// ex02
	public int insertReview(Review review);
	
	public int insertReviewAsfield(
			@Param("storeId")int storeId, 
			@Param("menu")String menu,
			@Param("userName")String userName, 
			@Param("point")Double point, 
			@Param("review")String review);
	
	// ex03
	public int updateReviewById(
			@Param("id") int id, 
			@Param("review") String review);
	
	// ex04
	public int deleteReviewById(int id);
}
