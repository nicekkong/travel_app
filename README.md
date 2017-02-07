# 여행정보 제공 어플리케이션

- 로컬 환경 설정

  1) 실행 환경 다음 변수 추가

``spring.active.profiles=local``
  
  2) /src/main/resources/local/logback.xml 에서 로그 파일 생성 경로 수정

``<property name="LOG_HOME" value="{로컬 환경에 실제 존재하는 경로}" />``
