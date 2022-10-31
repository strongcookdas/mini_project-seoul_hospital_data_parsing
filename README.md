# 10/14_서울시 병원 데이터 처리

# 📢 서울시 병원 데이터 처리

## 1. 데이터

[서울시 병의원 위치 정보.csv](https://drive.google.com/file/d/1mgfjKNkboPUX_9AOWc_Qil0z9MwASQej/view?usp=sharing)

## 2. 목표

<aside>
💡 서울시 병원 데이터를 읽고, db에 입력하여 데이터를 처리 할 수 있다.

</aside>

## 3. 공공데이터 모델링 실습

### 요구사항 분석

1. 병원 분류의 개수
2. 병원 분류 별 병원 개수
3. 서울의 구별로 각 병원의 개수
4. 병원이 가장 많은 구
5. 세부 분과 별로 병원의 개수

### 개념적 설계

| 컬럼명 | 설명 | Type | ex |
| --- | --- | --- | --- |
| id(Pk) |  | VARCHAR(8) | A1120837 |
| address | 전체 주소 | VARCHAR(90) | ~~ |
| district | 서울특별시 00구 | VARCHAR(15) | 서울특별시 강남구 |
| category | ...나중에 추가 작성병원분류
c | VARCHAR(1) | A: 종합병원
B: 병원
C: 의원
D: 요양병원
E: 한방병원
G: 한의원
I: 기타
M: 치과병원
N: 치과의원
R: 보건소 |
| emergency_room | 응급실운영여부
1 운영
2 운영안함 | INT | 1 또는 2 |
| name | 해당 병원의 이름 | VARCHAR(40) | 가로수치과의원 |
| subdivision | 세부과목 | VARCHAR(45) | 치과, 내과, 정형외과.. |

## 3. JAVA를 통해 SQL 파일 만들기

### 과정 개요

1. 파일 만들기
2. .csv에서 line별로 읽어오기 – 끊고
3. JavaObject Hospital()
4. line별로 읽어와서 필요한 정보만 뽑아서 Object에 담기- setSubdivision()
5. 생성자에서 setDistrict()호출 - address.split(“ “) → [0] + “ “ + [1] 서울특별시 금천구
6. subdivision은 병원이름(name)을 기준 (, 등) - 이 단어가 포함 되어 있으면 ex) 피부과가 포함 되어 있으면 피부과