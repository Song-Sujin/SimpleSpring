package study.spring.simplespring.vo;

import java.util.Random;

public class Calc4
{
	private int x;
	private int y;
	
	// 객체 생성 후 init()메서드가 실행되어야 멤버 변수가 초기화 된다.
	public void init()
	{
		// 랜덤객체 생성
		Random r = new Random(System.currentTimeMillis());
		// 랜덤한 int값을 생성한다.
		x = r.nextInt();
		y = r.nextInt();
	}
	
	public int sum()
	{
		return this.x + this.y;
	}

}
