# 🌿 Daily Boost — 매일의 한 문장으로 숨 쉬는 앱

> “하루에 한 번, 나를 위로해주는 한 문장.”  
> 우테코 4주차 해커톤 제한 협업 미션을 위한 프로젝트입니다.

---

## 🎯 프로젝트 개요
Daily Boost는 사용자가 하루에 한 번 위로가 되는 메시지를 받을 수 있는 간단한 웹 서비스입니다.  
“AI 없이 인간이 만든 위로”를 주제로, 작지만 따뜻한 경험을 전달하는 것을 목표로 합니다.

---

## ✨ 핵심 기능 (MVP)
- 랜덤 메시지 1개 표시
- 카테고리별 필터링 (공부 / 휴식 / 관계 / 업무 등)
- 사용자 커스텀 메시지 추가
- (선택) 즐겨찾기, 히스토리 기능

---

## 🧩 기술 스택
| 구분 | 기술 |
|------|------|
| Backend | Spring Boot, JPA, H2 (→ MySQL 확장 예정) |
| Frontend | React (또는 Android) |
| Build/Deploy | Gradle, Vercel, Heroku |

---

## 📅 일정 (2주)
| 구분 | 기간 | 내용 |
|------|------|------|
| Week 1 | 11/6 ~ 11/10 | 기획 / API 설계 / 기본 기능 구현 |
| Week 2 | 11/11 ~ 11/16 | 연동 / 배포 / README / 발표 준비 |

---

## 🚀 실행 방법 (로컬)
## 로컬 실행 방법
```bash
git clone https://github.com/Lux9616/woowa_daily-boost.git
cd daily-boost
./gradlew bootRun
```

브라우저에서 http://localhost:8080 접속
H2 Console: http://localhost:8080/h2-console
