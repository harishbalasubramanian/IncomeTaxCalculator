/*Author: Harish B
 1/4/2018
 Feel free to fork and extend
 however, copy this comment into the program too.*/
import java.util.Scanner;
public class taxer {
	public static double mooney;
	public static void main(String[] args) {
		System.out.println("DISCLAIMER: This may not be your exact income tax.");
		System.out.println("This is just a good approximation.");
		System.out.println("When it says for example, 1.23E8, it really means 1.23*10^8.");
		System.out.println("Do not type any letters until it tells you too.");
		Scanner stuffie = new Scanner (System.in);
		System.out.println("Are you filing your income tax as a head of household? Please enter Y for yes or N for no.");
		String indi = stuffie.nextLine();
		if (indi.equalsIgnoreCase("Y")) {
			System.out.println("What is your annual salary? Just type the number");
			double money = stuffie.nextDouble();
			if (money>=0 && money <=13600 ) {
				mooney = (Math.round(money * 10)/100.0)-18000;
				if (mooney<0) {
					mooney=0;
				}
				System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>13600 && money <=51800) {
				
				 mooney = (Math.round((money-13600) * 12)/100.0)+1360-18000;
				 if (mooney<0) {
						mooney=0;
				}
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>51800 && money <=82500) {
				 mooney = (Math.round((money-51800) * 22)/100.0)+5944-18000;
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>82500 && money <=157500) {
				 mooney = (Math.round((money-82500) * 24)/100.0)+12698-18000;
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>157500 && money <=200000) {
				 mooney = (Math.round((money-157500) * 32)/100.0)+30698-18000;
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>200000 && money <=500000) {
				 mooney = (Math.round((money-200000) * 35)/100.0)+44298-18000;
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else if (money>500000) {
				 mooney = (Math.round((money-500000) * 37)/100.0)+149298-18000;
				 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
			}else{
				System.out.println("Unfortunately, I can't calculate your income tax.");
			}
		}else if (indi.equalsIgnoreCase("N")) {
			System.out.println("Are you filing your income tax jointly? Please enter Y for yes or N for no.");
			String spou = stuffie.nextLine();
			if (spou.equalsIgnoreCase("Y")) {
				System.out.println("What is your annual salary? Just type the number");
				double money = stuffie.nextDouble();
				if (money>=0 && money <=19050 ) {
					mooney = (Math.round(money * 10)/100.0)-24000;
					if (mooney<0) {
						mooney=0;
					}
					System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>19050 && money <=77400) {
					 mooney = (Math.round((money-19050) * 12)/100.0)+1905-24000;
					 if (mooney<0) {
							mooney=0;
						}
					System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>77400 && money <=165000) {
					 mooney = (Math.round((money-77400) * 22)/100.0)+8907-24000;
					 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>165000 && money <=315000) {
					 mooney = (Math.round((money-165000) * 24)/100.0)+28179-24000;
					 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>315000 && money <=400000) {
					mooney = (Math.round((money-315000) * 32)/100.0)+64179-24000;
					System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>400000 && money <=600000) {
					 mooney = (Math.round((money-400000) * 35)/100.0)+91379-24000;
					 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else if (money>600000) {
					 mooney = (Math.round((money-600000) * 37)/100.0)+161379-24000;
					 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
				}else{
					System.out.println("Unfortunately, I can't calculate your income tax.");
				}
			
			}else if (spou.equalsIgnoreCase("N")) {
				System.out.println("Are you filing your income tax by yourself? Please enter Y for yes or N for no.");
				String plan = stuffie.nextLine();
				if (plan.equalsIgnoreCase("Y")) {
					System.out.println("What is your annual salary? Just type the number");
					double money = stuffie.nextDouble();
					if (money>=0 && money <=9525 ) {
						 mooney = (Math.round(money * 10)/100.0)-12000;
						 if (mooney<0){
							 mooney=0;
						 }
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>9525 && money <=38700) {
						 mooney = (Math.round((money-9525) * 12)/100.0)+952.5-12000;
						 if (mooney<0){
							 mooney=0;
						 }
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>38700 && money <=82500) {
						 mooney = (Math.round((money-38700) * 22)/100.0)+4453.5-120000;
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>82500 && money <=157500) {
						 mooney = (Math.round((money-82500) * 24)/100.0)+14089.5-12000;
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>157500 && money <=200000) {
						 mooney = (Math.round((money-157500) * 32)/100.0)+32089.5-12000;
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>200000 && money <=500000) {
						 mooney = (Math.round((money-200000) * 35)/100.0)+45689.5-12000;
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else if (money>500000) {
						 mooney = (Math.round((money-500000) * 37)/100.0)+150689.5-12000;
						 System.out.println("Your income tax is $"+ mooney+" if you claim your standard deduction.");
					}else{
						System.out.println("Unfortunately, I can't calculate your income tax.");
					}
				
				}else if (plan.equalsIgnoreCase("N")) {
					System.out.println("You will now exit the program");
				}else {
					System.out.println("Because you said "+plan+", which was not what I asked you to say, you will now exit the program.");
				}
			}else {
				System.out.println("Because you said "+spou+", which was not what I asked you to say, you will now exit the program.");
			}
			
		}else{
			System.out.println("Because you said "+indi+", which was not what I asked you to say, you will now exit the program.");
		}
		
		System.out.println("Have a nice day.");
	}
}