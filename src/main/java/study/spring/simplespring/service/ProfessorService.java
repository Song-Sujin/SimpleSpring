package study.spring.simplespring.service;

// 기본적인 비즈니스 로직을 정의한 인터페이스

// CRUD 기능을 가정한 인터페이스
public interface ProfessorService
{
	public String addData();
	public String getDataItem();
	public String getDataList();
	public String editData();
	public String deleteData();

}
