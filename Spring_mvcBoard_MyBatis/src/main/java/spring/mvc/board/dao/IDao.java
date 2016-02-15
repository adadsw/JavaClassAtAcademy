package spring.mvc.board.dao;

import java.util.ArrayList;
import java.util.Map;

import spring.mvc.board.dto.BDto;

public interface IDao {

	public int getCount();
	public int getMaxNum();//글쓰기-제목글인 경우
	public void updateReply(BDto dto);//글쓰기-답변글인 경우
	public ArrayList<BDto> getArticles(Map<String, Integer> map);
	public int insertArticle(BDto dto);
	public BDto getArticle(int num);
	public void addCount(int num);
	public int check(Map<String, Object> map); // 글 삭제 시 번호와 비밀번호가 일치하는지 확인
	public int checkReply(BDto dto); //글삭제 - 답글이 있는지 확인
	public int deleteArticle(int num); // 글 삭제
	public int updateArticle(BDto dto);

}
