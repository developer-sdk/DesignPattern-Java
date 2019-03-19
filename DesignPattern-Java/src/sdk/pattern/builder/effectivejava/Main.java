package sdk.pattern.builder.effectivejava;

public class Main {

	public static void main(String[] args) {
		// EffectiveJava의 빌더 페턴 2가지 
		// set 을 이용하는 방법 
		NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
		builder.calories(100);
		builder.sodium(35);
		builder.carbohydrate(27);
		NutritionFacts cocaCola1 = builder.build();

		// 메소드 체인을 이용하는 방법 
		// 각 줄마다 builder를 타이핑하지 않아도 되어 편리하다.
		NutritionFacts cocaCola2 = new NutritionFacts
		    .Builder(240, 8)    // 필수값 입력
		    .calories(100)
		    .sodium(35)
		    .carbohydrate(27)
		    .build();           // build() 가 객체를 생성해 돌려준다.

		System.out.println(cocaCola1);
		System.out.println(cocaCola2);
	}
}
