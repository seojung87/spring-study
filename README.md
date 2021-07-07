# spring-study👍

`Ctrl + k`   
커밋 창
커밋 메세지를 작성한 뒤 커밋을 진행  
`Ctrl + shift + k`  
푸쉬 창
변경 사항등을 잘 확인 한 뒤 푸쉬하도록 한다.   

  *****  
## Spring 강의 지식
>MVC와 템플릿엔진  
>-server에서 변형 후 웹에 전달  
>API  
>-data구조 포맷(ex. json)으로 클라이언트에 전달

>`@Autowired`  
>스프링이 memberService를 스프링container에 있는 memberService를 가져다 연결시켜줌  
>Service랑 Controller 연결
>
>>**class이름에 맞춰서 붙여주기 (정형화된 패턴)**   
>>`@Service`  
>>스프링container에 MemberService 등록  
>>`@Repository`  
>>`@Controller`  

<img src="C:\Users\jenny\OneDrive\바탕 화면\캡쳐\spring_container.png"  width="700" height="370">  


  *****    
## intelliJ 단축키 간단 정리
>`shift + F6`  
>변수이름 한번에 바꾸기, 근데 내컴에선 안됨
>
>`Assertions.assertThat(member).isEqualTo(result);` //org.assertj.core.api  
>member의 값이 result와 같으면 정상작동 (초록불)  
>같지않으면 오류 뜸  
>+) `import static org.assertj.core.api.Assertions.*;` 추가하면 Assertions 생략가능  
>
>**여러줄 한번에 주석처리**  
>`Ctrl + /`  (해제도 똑같음)
>
>>**변수 추출**  
>>`Ctrl + Alt + V`  
>>**파라미터 추출**  
>>`Ctrl + Alt + P`  
>>**메소드 추출**  
>>`Ctrl + Alt + M`  

  *****  
## Test
### Test 끝나고 data 클리어  
>1.MemoryMemberRepository.java에서  
>```
>public void clearStore() {
>        store.clear();
>}
>```  
>2.MemoryMemberRepositoryTest.java에서⭐
>```
>@AfterEach
>public void afterEach() {
>    repository.clearStore();
>}
>//MemoryMemberRepository변수.clearstore();
>```

### Test 쉽게 만드는 방법  
`Ctrl + shift + t`  
Create New Test  

//given, when, then 문법 사용하기  

### Test와 MemoryRepository 통일하기  
>member repository를 외부에서 넣음
>```
>@BeforeEach
>public void beforeEach() {
>    memoryRepository = new MemoryMemberRepository();
>    memberService = new MemberService(memoryRepository);
>}
>```
*****  
## 직접 spring bin 등록  
```
@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
```

