package study.spring.simplespring.service.impl;

import org.springframework.stereotype.Service;

import study.spring.simplespring.service.ProfessorService;

// 인터페이스에 대한 구현체 정의
// 여기서는 실제 DB연동이 아닌 CRUD를 가정한 것이므로 단순한 문자열만 리턴 하도록 한다.
@Service
public class ProfessorServiceImpl implements ProfessorService
{

	@Override
	public String addData()
	{
		return "교수데이터를 추가합니다.";
	}

	@Override
	public String getDataItem()
	{
		return "교수데이터의 상세정보를 조회합니다.";
	}
	
	@Override
	public String getDataList()
	{
		return "교수목록을 조회합니다.";
	}

	@Override
	public String editData()
	{
		return "교수데이터를 수정합니다.";
	}

	@Override
	public String deleteData()
	{
		return "교수데이터를 삭제합니다.";
	}

}
