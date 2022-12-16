package com.ezdev.sfy.service;

import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezdev.sfy.dto.*;

@Service
public class ReviewMapper {
    @Autowired
    private SqlSession sqlSession;
	
	 
    public int insertReview(ReviewDTO redto) {
    	return sqlSession.insert("insertReview", redto);
    }
    public int deleteReview(int review_no) {
    	return sqlSession.delete("deleteReview", review_no);
    }
    public int updateReview(ReviewDTO redto) {
    	return sqlSession.update("updateReview", redto);
    }
    public ReviewDTO getReview(int review_no) {
    	return sqlSession.selectOne("getReview", review_no);
    }
}
