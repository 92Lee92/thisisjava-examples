package ch09.verify.q7;

public class Chatting {
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
	
	void startChat(String chatId) {
//		String nickName = null;
//		nickName = chatId;		// 변경하면 안됨
		String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
}

// 로컬 변수를 로컬 클래스에서 사용할 경우  final 특성을 갖게 되기 때문에 그 값을 변경할 수 없다.