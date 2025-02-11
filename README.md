# 사다리 게임

## 요구 사항

- 1단계 : 기본 기능 구현
  - 사다리 게임에 참여할 사람 수 n을 입력받는다.
  - 사다리 높이 m을 입력받는다.
  - 각 사다리의 라인이 있을 확률은 1/2이다.
  - 사다리의 라인이 있다면 -를 표시하고 없다면 공백을 표시한다.
  - 사다리의 세로는 | 로 표시한다.
  - 완성된 사다리를 출력한다.
  - 메서드를 최대한 작게, 10줄 이하로 만들 것
  - 2차원 배열을 이용하여 해결할 것

- 2단계 : 리팩토링 맛보기
  - 기능 요구 사항은 1단계와 동일
  - 들여쓰기(indent) depth 1단계까지만 사용할 것
  - else 사용하지 말 것
  - naming convention 지킬 것

- 3단계 : 사다리 모양 개선
  - 사다리 게임에 참여할 플레이어의 이름을 ,로 구분해서 입력받는다.
  - 플레이어의 이름은 최대 5글자이다.
  - 같은 높이에 이웃해서 발판이 있으면 안된다.
  - 배열 대신 ArrayList, Generic 을 사용할 것
  - 이외 요구 사항은 2단계와 동일

## 학습 계획

- [x] 1, 2단계 요구 사항 분석, 정리하기
- [x] 1단계 구현하기
- [ ] String, StringBuilder, StringBuffer 공부하기
- [ ] coding convention 찾아보기
- [x] 3단계 요구 사항 분석, 정리하기
- [ ] 3단계 구현하기