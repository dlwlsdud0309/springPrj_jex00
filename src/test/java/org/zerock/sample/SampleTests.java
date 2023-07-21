package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체(스프링의 빈)로 등록
//스프링이 실행되면서 어떤 설정 정보를 읽어 들여야 하는지를 명시
@Log4j //Lombok을 이용해서 로그를 기록하는 Logger를 변수로 생성
public class SampleTests {

	@Setter(onMethod_ = {@Autowired}) //해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시
	private Restaurant restaurant;
	
	@Test //JUnit에서 테스트 대상을 표시하는 어노테이션
	public void testExist() {
		
		assertNotNull(restaurant); //변수가 null이 아니어야만 테스트가 성공한다는 것을 의미
		
		log.info(restaurant);
		log.info("------------------");
		log.info(restaurant.getChef());
	}

}
