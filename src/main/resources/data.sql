-- SAD 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('힘든 하루였군요. 하지만 당신은 오늘도 해냈어요. 💙', 'SAD', NOW()),
('우울한 날도 있는 법이에요. 내일은 더 나을 거예요.', 'SAD', NOW()),
('당신의 감정은 소중해요. 충분히 슬퍼할 자격이 있어요.', 'SAD', NOW()),
('지금은 어둡지만, 해는 반드시 떠오릅니다. 🌅', 'SAD', NOW()),
('혼자가 아니에요. 당신을 응원하는 사람이 있어요.', 'SAD', NOW());

-- ANXIOUS 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('깊게 숨을 쉬어보세요. 당신은 지금 이 순간을 이겨낼 수 있어요.', 'ANXIOUS', NOW()),
('불안은 일시적이에요. 곧 지나갈 거예요. 💪', 'ANXIOUS', NOW()),
('완벽하지 않아도 괜찮아요. 최선을 다하는 것만으로도 충분해요.', 'ANXIOUS', NOW()),
('하나씩 천천히. 서두를 필요 없어요.', 'ANXIOUS', NOW()),
('당신은 이미 많은 것을 이겨냈어요. 이번에도 할 수 있어요.', 'ANXIOUS', NOW());

-- TIRED 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('충분히 쉬세요. 휴식도 생산성의 일부예요. 😴', 'TIRED', NOW()),
('오늘 하루 수고했어요. 이제 좀 쉬어도 돼요.', 'TIRED', NOW()),
('피곤한 건 열심히 살았다는 증거예요.', 'TIRED', NOW()),
('몸이 보내는 신호를 무시하지 마세요. 잠시 멈춰도 괜찮아요.', 'TIRED', NOW()),
('내일을 위해 오늘은 푹 쉬세요. 🛌', 'TIRED', NOW());

-- LONELY 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('혼자라고 느껴질 때, 이 메시지가 함께하고 있어요. 💙', 'LONELY', NOW()),
('외로움은 연결을 갈망하는 마음이에요. 곧 누군가를 만날 거예요.', 'LONELY', NOW()),
('지금은 혼자지만, 당신은 사랑받을 자격이 있어요.', 'LONELY', NOW()),
('외로움도 지나가요. 조금만 기다려주세요.', 'LONELY', NOW()),
('당신을 생각하는 사람이 분명 있어요. 🌟', 'LONELY', NOW());

-- ANGRY 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('화낼 자격이 있어요. 하지만 자신을 다치게 하진 마세요.', 'ANGRY', NOW()),
('분노도 감정이에요. 인정하고 천천히 내려놓으세요. 🔥', 'ANGRY', NOW()),
('화가 나는 건 당연해요. 잠시 멈추고 숨을 고르세요.', 'ANGRY', NOW()),
('이 감정도 지나갈 거예요. 조금만 기다려주세요.', 'ANGRY', NOW()),
('분노 뒤에 숨은 감정을 들여다보세요. 무엇이 진짜 문제인가요?', 'ANGRY', NOW());

-- HAPPY 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('오늘의 기쁨을 마음껏 즐기세요! 🎉', 'HAPPY', NOW()),
('행복한 순간을 오래오래 기억하세요. ✨', 'HAPPY', NOW()),
('이 기분 너무 좋죠? 이 순간을 소중히 하세요!', 'HAPPY', NOW()),
('당신의 웃음이 누군가에게 희망이 될 수 있어요. 😊', 'HAPPY', NOW()),
('행복은 나누면 배가 돼요. 주변 사람들과 함께하세요!', 'HAPPY', NOW());

-- MOTIVATED 카테고리
INSERT INTO messages (content, category, created_at) VALUES
('지금 이 에너지로 세상을 바꿔보세요! 🚀', 'MOTIVATED', NOW()),
('당신의 열정이 느껴져요. 계속 달려가세요!', 'MOTIVATED', NOW()),
('시작이 반이에요. 이미 절반은 성공한 거예요! 💪', 'MOTIVATED', NOW()),
('할 수 있다는 믿음이 가장 강력한 무기예요.', 'MOTIVATED', NOW()),
('멈추지 마세요. 당신은 훌륭하게 해내고 있어요! 🔥', 'MOTIVATED', NOW());