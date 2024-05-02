# 프로그래머스 문제풀이 스터디

## 📅스터디 기간
- 기초 : 2024년 01월 15일 ~ 2024년 01월 31일
- 입문 : 2024년 02월 01일 ~ 2024년 02월 25일
- Lv.1 : 2024년 03월 04일 ~ 2024년 03월 31일(정답률 높은 순으로 진행, 하루 5문제 풀고 push)
- Lv.2 : 2024년 05월 06일 ~ 2024년 05월 31일(정답률 높은 순으로 진행, 하루 2문제 풀고 push)

## 🎯스터디 목표
- ~~[프로그래머스 코딩 기초 트레이닝](https://school.programmers.co.kr/learn/challenges/training?order=acceptance_desc) 모든 문제 풀기~~(완료)
- ~~[프로그래머스 코딩테스트 입문](https://school.programmers.co.kr/learn/challenges/beginner?order=acceptance_desc&page=1) 모든 문제 풀기~~(완료)
- ~~[프로그래머스 Lv.1](https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&page=1&levels=1&languages=java) 모든 문제 풀기~~(완료)
- [프로그래머스 Lv.2](https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&page=1&languages=java&levels=2) 모든 문제 풀기
- 각자가 사용하는 언어의 문법과 코딩테스트 문제에 익숙해지기
- github에 익숙해지고 커밋 습관 만들기
- 각자의 코드를 공유하고 의견을 나누며 더 나은 코드에 대해 생각하기

## 📓 커밋 컨벤션
- 커밋 컨벤션을 준수하여 커밋메시지를 의미있게 작성한다.
- 타입과 해당 문제의 제목을 적는다. ex) `add: 문자열 출력하기`
- `add` : 문제 풀이 or 추가했을 때
- `fix`: 문제 오류를 수정했을 때
- `remove` : 코드(파일) 삭제했을 때
- `rename` : 파일명을 변경했을 때
- `refactor` : 리팩토링 했을 때
- `test` : 문제 발생 시 테스트 커밋했을 때

## 🌱스터디 초기 세팅
1. 자신의 이메일 계정으로 들어가서 Collaborator를 수락한다.
2. 터미널에서 다음과 같이 입력해 저장소를 `clone`한다.
```
git clone https://github.com/3uomlkh/programmersStudy.git
```
3. 자신의 이름으로 브랜치를 생성한다.
```
git branch {브랜치이름}
```
4. 생성한 브랜치로 이동한다.
```
git checkout {브랜치이름}
```
5. IDE에서 저장소를 열고 `본인이름/lv.0` 폴더에 파일을 생성해 코드를 작성한다.

## 🍀스터디 진행방식
- 매일 프로그래머스에서 day1 분량에 해당하는 문제를 모두 풀고 개인 브랜치에 `push`한다.
- `main` 브랜치로 `Pull requests`를 보낸다.
- `PR` 작성 시 제목은 이름, 월, 주차, 문제진도를 포함한다. ex) `[채원] 1월 1주차 코테 기초 Day1`
- 다른 사람의 코드를 보며 자유롭게 코드리뷰를 한다.
- 주말에 `채원`이 문제풀이 현황을 확인 후 `merge`한다.
- 새 주차가 시작되면 main 브랜치와의 싱크를 맞춘 후 문제를 푼다.
- 난이도가 올라가거나 궁금한 점이 생기면 디스코드로 의견을 나눈다.
- 설명하고 싶은 부분이나 새로 알게 된 부분은 주석을 활용한다.

## ⚠️주의할 점
- 굳이 올리지 않아도 될 파일이 올라가지 않도록 `gitignore`를 통해 관리한다.
- 반드시 자신의 브랜치로 이동 후 코드를 작성한다.
- `push`하기 전에 모든 문제를 풀었는지, 오류가 없는지 꼭 확인한다.
- 파일명은 문제명으로 하되, 띄어쓰기는 `_`으로 바꾼다. ex) `문자열_바꾸기`
