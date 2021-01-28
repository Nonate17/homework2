
public class Homework2 {

	public static void main(String[] args) {
		System.out.println(true && false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1 < 5 );
		System.out.println(5 >= 4 && 1> 3);
		System.out.println(10 < 4 || 1 > 4);
		System.out.println(12 >= 2 && 1 < 24);
		System.out.println("hello".charAt(0) == 'h');
		boolean isHotOutside = true;
				System.out.println(isHotOutside);
		boolean isWeekday = false;
		System.out.println(isWeekday);
		boolean hasMoneyInPocket = true;
		System.out.println(hasMoneyInPocket);
		double costOfMilk = 2.19;
		System.out.println(costOfMilk);
		double moneyInWallet = 20.19;
		System.out.println(moneyInWallet);
		int thirstLevel = 8;
		System.out.println(thirstLevel);
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldBuyIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday; 
		System.out.println(willGoSwimming);
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);				
				
		
	}

}
