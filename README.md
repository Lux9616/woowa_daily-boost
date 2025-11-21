# 💙 Daily Boost

## 📌 프로젝트 소개
감정 상태에 따라 맞춤형 격려 메시지를 제공하는 웹 애플리케이션입니다.

## 🎯 기능 요구사항
- 7가지 감정 카테고리 선택 (우울, 불안, 피곤, 외로움, 화남, 기쁨, 의욕)
- 카테고리별 랜덤 격려 메시지 제공
- 반응형 UI (모바일/태블릿/데스크톱)
- RESTful API 제공

## 🛠 기술 스택
### Backend
- Java 17
- Spring Boot 3.5.7
- Spring Data JPA
- H2 Database

### Frontend
- HTML5
- CSS3 (Bootstrap 5.3.0)
- JavaScript (ES6+)

## 📁 프로젝트 구조
```
Daily-Boost/
├── src/                          # Backend
│   ├── main/
│   │   ├── java/
│   │   │   └── com/woowa/dailyboost/
│   │   │       ├── DailyBoostApplication.java
│   │   │       ├── domain/
│   │   │       │   ├── Category.java
│   │   │       │   └── Message.java
│   │   │       ├── repository/
│   │   │       │   └── MessageRepository.java
│   │   │       ├── service/
│   │   │       │   └── MessageService.java
│   │   │       ├── controller/
│   │   │       │   └── MessageController.java
│   │   │       └── exception/
│   │   │           ├── GlobalExceptionHandler.java
│   │   │           └── MessageNotFoundException.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/
└── frontend/                     # Frontend
    ├── index.html
    ├── css/
    │   └── style.css
    └── js/
        └── app.js

## 🚀 실행 방법

### 1. Backend 실행
```bash
# 프로젝트 루트 디렉토리에서
./gradlew bootRun

# 또는 IDE에서 DailyBoostApplication.java 실행
```

서버가 `http://localhost:8080`에서 실행됩니다.

### 2. Frontend 실행
```bash
# frontend 디렉토리로 이동
cd frontend

# 브라우저에서 index.html 열기
open index.html

# 또는 Live Server 등의 도구 사용
```

## 🔗 API 명세

### 헬스체크
```
GET /api/messages/health
```

### 전체 메시지 조회
```
GET /api/messages
```

### 랜덤 메시지 조회
```
GET /api/messages/random/{category}

Parameters:
- category: SAD, ANXIOUS, TIRED, LONELY, ANGRY, HAPPY, MOTIVATED

Response:
{
  "id": 1,
  "content": "힘든 하루였군요. 하지만 당신은 오늘도 해냈어요. 💙",
  "category": "SAD",
  "categoryDescription": "우울해요",
  "emoji": "😢",
  "createdAt": "2025-11-18T10:00:00"
}
```

### 카테고리별 메시지 조회
```
GET /api/messages/category/{category}
```

### 카테고리별 메시지 개수
```
GET /api/messages/count/{category}
```

### 메시지 등록 (관리자)
```
POST /api/messages
Content-Type: application/json

{
  "content": "새로운 격려 메시지",
  "category": "HAPPY"
}
```

### 메시지 삭제 (관리자)
```
DELETE /api/messages/{id}
```

## 📊 데이터베이스

### Message 엔티티
| 필드 | 타입 | 설명 |
|------|------|------|
| id | Long | 메시지 ID (PK) |
| content | String | 메시지 내용 |
| category | Category | 감정 카테고리 (Enum) |
| createdAt | LocalDateTime | 생성 시간 |

### Category Enum
```java
SAD,        // 😢 우울해요
ANXIOUS,    // 😰 불안해요
TIRED,      // 😫 피곤해요
LONELY,     // 😔 외로워요
ANGRY,      // 😠 화나요
HAPPY,      // 😊 기뻐요
MOTIVATED   // 🔥 의욕적
```

## 🎨 주요 기능

### 1. 감정 카테고리 선택
- 7가지 감정 상태 중 선택
- 직관적인 이모지 + 텍스트 UI

### 2. 격려 메시지
- 카테고리별 5개씩 총 35개 메시지
- 랜덤 알고리즘으로 중복 없이 제공
- 부드러운 애니메이션 효과

### 3. 반응형 디자인
- 모바일 우선 설계
- 다양한 화면 크기 대응
- 터치 최적화

## 📅 개발 기간
2025.11.18 ~ 2025.11.21 (4일)

## 👤 개발자
- GitHub: [@Lux9616](https://github.com/Lux9616)
- 우아한테크코스 8기 프리코스 4주차 과제

## 📄 라이선스
MIT License
