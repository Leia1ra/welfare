# 통합복지웹앱
> 목적 : (2024 열린데이터광장 공공데이터 활용 창업경진대회) 아이디어</br> 
> 조부모/자식의 복지 시설을 한눈에 확인 및 각종 복지 서비스를 한눈에 조회

## 참고 자료
### 공모전 관련
1. [공모전 링크](https://data.seoul.go.kr/together/cpthb/cpthbHistView.do?bbsCd=10020&seq=1a391f0884c83af5f670f4aa27b500a1&usrId=undefined&ditcCd=2023&ver=1&page=gallery)
2. 공공데이터 링크
   1. [국토교통부_노인복지시설](https://www.data.go.kr/data/15056929/openapi.do)
   2. [국토교통부_아동복지시설](https://www.data.go.kr/data/15058758/openapi.do)
   3. [한국사회보장정보원_사회복지시설정보서비스 현황](https://www.data.go.kr/data/15001848/openapi.do#tab_layer_detail_function)
   4. [한국사회보장정보원_지자체복지서비스](https://www.data.go.kr/data/15108347/openapi.do#/tab_layer_detail_function)
   5. [한국사회보장정보원_중앙부처복지서비스](https://www.data.go.kr/data/15090532/openapi.do)

### 스택관련
1. React Library
    - 선정 사유
      - 필요한 데이터는 공공 데이터로서 RestAPI를 통하여 접근하므로, 별도의 서버가 필요 없다고 판단
      - Path 관리 : React-Router-Dom
      - state 관리 : Redux
      - Ajax : Axios
2. Spring Framework    
    - 선정 사유
      - React의 Ajax API를 사용 시 CORS 문제 해결을 위함,

## 변수 관련
### 환경변수
> API 환경 또는 API 호출 조건에 따라 인증키가 적용되는 방식이 다를 수 있습니다.
  포털에서 제공되는 Encoding/Decoding 된 인증키를 적용하면서 구동되는 키를 사용하시기 바랍니다.
- React와 관련된 API에 관한 경로는 `.env` 파일을 통해 환경변수를 설정해야 한다.
  - `REACT_APP_REST_API` : 현재 사용하고 있는 Spring Server의 IP 주소를 적는다
  - `process.env.{변수명}` interface를 통해 필요한 값을 불러온다.
- Spring과 관련된 API의 Key값과 경로는 `application.properties`에 있음
  - `api.encodeKey` : OpenAPI 측에서 제공하는 인코딩된 키값
  - `api.decodeKey` : OpenAPI 측에서 제공하는 디코딩된 키값

### 프로젝트 전역 변수
  - 혹여나 Open API에 접근할 URL 경로가 여러 파일에서 사용될 예정이라면 Value Object를 만들 것을 권장 
#### RestAPI EndPoint
- 중앙부처복지서비스(XML)
  - 일일 traffic(100건)
  - URL(http://apis.data.go.kr/B554287/NationalWelfareInformations)
  - 요청주소(http://apis.data.go.kr/B554287/NationalWelfareInformations/NationalWelfarelist)
- 지자체 복지서비스(XML)
  - 일일 traffic(10건)
  - URL(http://apis.data.go.kr/B554287/LocalGovernmentWelfareInformations)
  - 요청주소(http://apis.data.go.kr/B554287/LocalGovernmentWelfareInformations)