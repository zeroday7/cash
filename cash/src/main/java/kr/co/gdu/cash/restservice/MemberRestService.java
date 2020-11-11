package kr.co.gdu.cash.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.gdu.cash.restmapper.MemberRestMapper;

@Service
@Transactional
public class MemberRestService {
	@Autowired private MemberRestMapper memberRestMapper;
	public String getMemberId(String id) {
		return memberRestMapper.selectMemberId(id);
	}
}
