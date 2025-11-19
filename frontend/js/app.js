// API 엔드포인트
const API_BASE_URL = 'http://localhost:8080/api/messages';

// 카테고리별 이모지 매핑
const EMOJI_MAP = {
    'SAD': '😢',
    'ANXIOUS': '😰',
    'TIRED': '😫',
    'LONELY': '😔',
    'ANGRY': '😠',
    'HAPPY': '😊',
    'MOTIVATED': '🔥'
};

// 카테고리별 설명
const CATEGORY_DESC = {
    'SAD': '우울해요',
    'ANXIOUS': '불안해요',
    'TIRED': '피곤해요',
    'LONELY': '외로워요',
    'ANGRY': '화나요',
    'HAPPY': '기뻐요',
    'MOTIVATED': '의욕적'
};

/**
 * 격려 메시지 가져오기
 * @param {string} category - 감정 카테고리
 */
async function getMotivation(category) {
    // UI 요소
    const messageContainer = document.getElementById('message-container');
    const loading = document.getElementById('loading');
    const emojiElement = document.getElementById('emoji');
    const messageElement = document.getElementById('message');
    const categoryElement = document.getElementById('category');

    try {
        // 메시지 숨기고 로딩 표시
        messageContainer.style.display = 'none';
        loading.style.display = 'block';

        // API 호출
        const response = await fetch(`${API_BASE_URL}/random/${category}`);

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const data = await response.json();

        // 로딩 숨기고 메시지 표시
        loading.style.display = 'none';
        messageContainer.style.display = 'block';

        // 메시지 내용 업데이트
        emojiElement.textContent = EMOJI_MAP[category];
        messageElement.textContent = data.content;
        categoryElement.textContent = `${CATEGORY_DESC[category]} · ${formatDate(data.createdAt)}`;

        // 애니메이션 재시작
        messageContainer.style.animation = 'none';
        setTimeout(() => {
            messageContainer.style.animation = 'slideIn 0.5s ease-out';
        }, 10);

    } catch (error) {
        console.error('Error fetching motivation:', error);

        // 에러 처리
        loading.style.display = 'none';
        messageContainer.style.display = 'block';

        emojiElement.textContent = '😢';
        messageElement.textContent = '메시지를 불러오는데 실패했습니다. 잠시 후 다시 시도해주세요.';
        categoryElement.textContent = '오류 발생';
    }
}

/**
 * 날짜 포맷팅
 * @param {string} dateString - ISO 날짜 문자열
 * @returns {string} 포맷된 날짜
 */
function formatDate(dateString) {
    if (!dateString) return '';

    const date = new Date(dateString);
    const now = new Date();

    // 같은 날이면 시간만
    if (date.toDateString() === now.toDateString()) {
        return date.toLocaleTimeString('ko-KR', {
            hour: '2-digit',
            minute: '2-digit'
        });
    }

    // 다른 날이면 날짜
    return date.toLocaleDateString('ko-KR', {
        year: 'numeric',
        month: 'long',
        day: 'numeric'
    });
}

/**
 * 페이지 로드 시 실행
 */
document.addEventListener('DOMContentLoaded', () => {
    console.log('💙 Daily Boost loaded');
    console.log('Philosophy: "관찰하고, 기록하고, 함께 있습니다."');
    console.log('- Inspired by Amelia Episodes 10-13');
});

// 터치 피드백
document.addEventListener('DOMContentLoaded', () => {
    const buttons = document.querySelectorAll('.btn-category');

    buttons.forEach(button => {
        // 터치 시작
        button.addEventListener('touchstart', function() {
            this.style.transform = 'scale(0.95)';
        }, { passive: true });

        // 터치 끝
        button.addEventListener('touchend', function() {
            this.style.transform = '';
        }, { passive: true });
    });
});

// 화면 회전 감지
window.addEventListener('orientationchange', () => {
    // 회전 후 레이아웃 재조정
    setTimeout(() => {
        window.scrollTo(0, 0);
    }, 100);
});

// 모바일 뷰포트 높이 보정 (주소창 때문에)
function setVH() {
    let vh = window.innerHeight * 0.01;
    document.documentElement.style.setProperty('--vh', `${vh}px`);
}

setVH();
window.addEventListener('resize', setVH);
window.addEventListener('orientationchange', setVH);