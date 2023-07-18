package org.zerock.sample;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class}) //지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체(스프링의 빈)로 등록
@Log4j
public class SampleTests {

}
