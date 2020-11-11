package kr.co.gdu.cash.mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.gdu.cash.vo.Member;

@Mapper
public interface MemberMapper {
	public Member selectMemberById(String id);
	public int insertMember(Member member);
}
