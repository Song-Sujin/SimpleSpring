package study.spring.simplespring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 이 클래스를 컨트롤러로서 지정함
// -> import org.springframework.stereotype.Controller;
@Controller
public class ParamsController
{
	// 첫 페이지의 역할을 하는 메서드
	// -> import org.springframework.web.bind.annotation.RequestMapping;
	// -> import org.springframework.web.bind.annotation.RequestMethod;
	@RequestMapping(value="/params/home.do", method=RequestMethod.GET)
	public String home()
	{
		// "/src/main/webapp/WEB-INF/views/params/home.jsp"파일을 View로 지정한다.
		return "params/home";
	}
	
	// GET 방식의 파라미터를 전송받기 위한 컨트롤러 메서드
	// 변수값을 View에게 전달할 필요가 있는 경우 Model 파라미터를 정의한다.
	@RequestMapping(value="/params/get.do", method=RequestMethod.GET)
	public String get(Model model,
			// GET, POST 파라미터 받기
			@RequestParam(value="answer", defaultValue="0") int ans)	// answer라는 이름의 파라미터를 int형 변수에 저장하도록 정의. 값이 없을 경우 기본값 0
	{
		String result = null;
		
		if(ans == 300)
			result = "정답입니다";
		else
			result = "오답입니다";
		
		// 파라미터값을 View에게 전달한다.
		model.addAttribute("ans", ans);
		model.addAttribute("result", result);
		
		// "/src/main/webapp/WEB-INF/views/params/get.jsp" 파일을 View로 지정한다.
		return "params/get";
	}

}
