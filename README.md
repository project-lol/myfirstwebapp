> https://github.com/in28minutes/master-spring-and-spring-boot/blob/main/11-web-application/Step19.md

- 프론트 컨트롤러 
  - 서브렛으로 요청을 처리하다보니, 공통적으로 처리해야하는 요청들도 있었다.(인증같은것들) 이런 공통적인 요청을 한번에 처리할 수 있도록 만들어주기 위해서, 사용하게 되었다.
- 디스패처 서블릿 
  - 디스패처 서블린이 프론트 컨트롤러 역할을 한다.
  - 일단 모든 요청을 먼저 받는다. 
  - 그 다음 URL을 확인하고, 이것을 처맇ㄹ 수 있는 컨트롤러를 찾고, 요청을 보낸다. 
  - 만약 login을 하려고 했다면, login.jsp로 어떻게 매핑을 할까? 뷰 리졸버를 통해서. 
  - 순서 
    - localhost:8080/login 으로 접속을 한다. 
    - 적절한 컨트롤러의 메서드를 확인한다. -> /login -> LoginController.gotoLoginPage 
    - 컨트롤러의 메서드를 실행한다. -> 데이터를 모델에 넣는다. -> view name을 반환한다. -> login 
    - 적절한 View를 찾아낸다 -> /WEB-INF/jsp/login/jsp 
    - View를 실행한다. 
- 요청이 있을 때, 메서드를 확인해서 특정 메서드에만 동작하도록 만드는 방법 : 
  - @RequestMapping(value="login", method = RequestMethod.GET) -> 이렇게하면 GET이라는 메서드에만 동작하는 컨트롤러 메서드가 됨.