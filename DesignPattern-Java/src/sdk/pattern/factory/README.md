# Factory 패턴 
인스턴스의 생성을 서브클래스에 위임하여 결합도를 낮추고, 클래스 생성에 생기는 변경점을 최소화 한다.  

패키지|이름|비고
-|-|-
framework|Card|추상 메소드 use만 정의되어 있는 추상클래스 
framework|CardFactory|메소드 create를 구현하고 있는 추상클래스. 전달된 타입에 따른 클래스를 생성  
card|IDcard|메소드 use를 구현하고 있는 클래스
card|NFCCard|메소드 use를 구현하고 있는 클래스 
card|IDCardFactory|메소드 create를 실제로 구현하는 클래스 

# 팩토리 
타입에 따라 카드 클래스를 실제로 생성합니다. 

```java
	@Override
	public Card create(String type, String owner) {

		switch (type) {
		case "id":
			return new IDCard(owner);
		case "nfc":
			return new NFCCard(owner);
		default:
			return null;
		}
	}
```