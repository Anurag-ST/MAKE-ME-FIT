 package anurag;

public class diet {
	void showDiet(int a)
	{
		if(a<18)
		{
		System.out.print("To gain weight\n");
		System.out.print("1.Don't drink water before meals. This can fill your stomach and make it harder to get in enough calories.\r\n" + 
				"2.Eat more often. Squeeze in an additional meal or snack whenever you can, such as before bed.\r\n" + 
				"3.Drink milk. Drinking whole milk to quench thirst is a simple way to get in more high-quality protein and calories.\r\n" + 
				"4.Try weight gainer shakes. These are very high in protein, carbs and calories.\r\n" + 
				"5.Use bigger plates. ");
	}
		else if(a>25)
		{
			System.out.print("To reduce weight\n");
			System.out.print("1.Avoid sugar and sugar-sweetened drinks\n2.Eat more protein\n3.Avoid foods that contain trans fat\n4.Don’t drink too much alcohol\n5.Reduce your stress levels\n");
		}
		else
		{
			System.out.print("Your body is fit\n");
			System.out.print("\n1.Choose and prepare foods with less salt and added sugars.\n2.Get enough fiber by regularly eating foods high in fiber.\n3.Limit foods high in unhealthy fats such as cholesterol, saturated fat, and trans fat.\n\n");
		}
	}
}

