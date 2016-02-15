package spring.mvc.board.dao;

import java.util.ArrayList;

import spring.mvc.board.dto.BDto;

public interface IDao {

	public int getCount();
	public ArrayList<BDto> getArticles(int start, int end);
	public int insertArticle(BDto dto);
	public BDto getArticle(int num);
	public int addCount(int num);
	public int check(int num, String passwd); // 글 삭제 시 번호와 비밀번호가 일치하는지 확인
	public int deleteArticle(int num); // 글 삭제
	public int updateArticle(BDto dto);
}
