# spring-study👍

`Ctrl + k`   
커밋 창
커밋 메세지를 작성한 뒤 커밋을 진행  
`Ctrl + shift + k`  
푸쉬 창
변경 사항등을 잘 확인 한 뒤 푸쉬하도록 한다.   
*****  

_여러줄 한번에 주석처리_
`Ctrl + /`  (해제도 똑같음)

  *****  
MVC와 템플릿엔진  
-server에서 변형 후 웹에 전달  
API  
-data구조 포맷(ex. json)으로 클라이언트에 전달

  *****    
`shift + F6`  
변수이름 한번에 바꾸기, 근데 내컴에선 안됨

`Assertions.assertThat(member).isEqualTo(result);` //org.assertj.core.api  
member의 값이 result와 같으면 정상작동 (초록불)  
같지않으면 오류 뜸  
+) `import static org.assertj.core.api.Assertions.*;` 추가하면 Assertions 생략가능  


  
## Test
### Test 끝나고 data 클리어  
>1.MemoryMemberRepository.java에서  
>```
>public void clearStore() {
>        store.clear();
>    }
>```  
>2.MemoryMemberRepositoryTest.java에서
>```
>@AfterEach
>public void afterEach() {
>    repository.clearStore();
>}
>```

### Test 쉽게 만드는 방법  
`Ctrl + shift + t`  
Create New Test  

//given, when, then 문법 사용하기  

