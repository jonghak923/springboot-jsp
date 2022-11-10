package com.jonghak.springbootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * - war로 패키징할 경우 생김
 * - tomcat에 war를 배포해서 실행하기 위해 필요 (WebApplicationInitializer)
 * - 굳이 추가로 건드릴 필요는 없음
 *
 *
 * * 스프링부터에서 JSP 사용하기
 *
 * - 제약 사항
 *  1. JAR 프로젝트로 만들 수 없음, WAR 프로젝트로 만들어야 함
 *  2. Java -JAR로 실행할 수는 있지만 “실행가능한 JAR 파일”은 지원하지 않음
 *  3. 언더토우(JBoss에서 만든 서블릿 컨테이너)는 JSP를 지원하지 않음
 *  4. Whitelabel 에러 페이지를 error.jsp로 오버라이딩 할 수 없음.
 *
 * - WAR package 및 실행
 *  1. ./mvnw.cmd package
 *  2. C:\Users\hak92\.jdks\corretto-11.0.12\bin\java -jar .\target\spring-boot-jsp-0.0.1-SNAPSHOT.war
 *
 * - 참고
 *  1. https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-jsp-limitations
 *  2. https://github.com/spring-projects/spring-boot/tree/v2.1.1.RELEASE/spring-boot-samples/spring-boot-sample-web-jsp (샘플 프로젝트)
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootJspApplication.class);
    }

}
