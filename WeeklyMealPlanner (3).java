//CO-1 : Operators - Ternary operator , Logical operators , Relational operator ; Format specifiers
//Co-2 : Control Statements - For loops , Switch conditions
//Co-3 : Arrays

import java.util.Scanner;

public class WeeklyMealPlanner{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
String[] breakfastOptions = {"Dosa", "Idly", "Poori", "Upma"};
String[] lunchOptions = {"Tomato rice", "Rice & Palak Paneer", "Chicken biryani"};
String[] dinnerOptions = {"Curd rice", "Chapati", "Parota"};

String[] finalBreakfasts = new String[7];
String[] finalLunches = new String[7];
String[] finalDinners = new String[7];

for (int i=0; i<days.length; i++) {
System.out.printf("%nDAY: " + days[i] + "%n");

System.out.printf("%nBreakfast Options:%n");
for(int j=0; j<breakfastOptions.length; j++) {
System.out.println((j+1) + ". " + breakfastOptions[j]);
}
System.out.print("Choose Breakfast (1-4): ");
int bChoice = sc.nextInt();
finalBreakfasts[i] = (bChoice>=1 && bChoice<=4) ? breakfastOptions[bChoice-1] : "Idly";

System.out.printf("%nLunch Options:%n");
for (int j=0; j<lunchOptions.length; j++) {
System.out.println((j+1) + ". " + lunchOptions[j]);
}
System.out.print("Choose Lunch (1-3): ");
int lChoice = sc.nextInt();
finalLunches[i] =(lChoice>=1 && lChoice<=3) ? lunchOptions[lChoice-1] : "Tomato rice";

System.out.printf("%nDinner Options:%n");
for(int j=0; j<dinnerOptions.length; j++) {
System.out.println((j+1) + ". " + dinnerOptions[j]);
}
System.out.printf("Choose Dinner (1-3): ");
int dChoice = sc.nextInt();
finalDinners[i] = (dChoice>=1 && dChoice<=3) ? dinnerOptions[dChoice-1] : "Curd rice"; 
}

System.out.printf("%nWEEKLY MEAL PLAN%n");
for (int i=0; i<days.length; i++) {
System.out.println(i+1 + " " + days[i]);
System.out.println("  Breakfast: " + finalBreakfasts[i]);
System.out.println("  Lunch:     " + finalLunches[i]);
System.out.println("  Dinner:    " + finalDinners[i]);
}

System.out.printf("%nGENERATED GROCERY LIST%n");

for (int i=0; i<7; i++) {
            
String bIngredients = "";
switch (finalBreakfasts[i]) {
case "Dosa":
bIngredients = "Rice & Black gram";
break;
case "Idly":
bIngredients = "Rice & Black gram";
break;
case "Poori":
bIngredients = "Wheat flour, oil";
break;
case "Upma":
bIngredients = "Upma rava, oil, carrots, Aromatics";
break;
}
System.out.println(bIngredients + " (for " + finalBreakfasts[i] + ")");

String lIngredients = "";
switch (finalLunches[i]) {
case "Tomato rice":
lIngredients = "Tomatoes, Rice, Spices, oil";
break;
case "Rice & Palak Paneer":
lIngredients = "Rice, Paneer, Palak, oil";
break;
case "Chicken biryani":
lIngredients = "Chicken, Rice, Spices, Oil, Aromatics";
break;
}
System.out.println(lIngredients + " (for " + finalLunches[i] + ")");

String dIngredients = "";
switch (finalDinners[i]) {
case "Curd rice":
dIngredients = "Curd, rice, pomegranates, chillies";
break;
case "Chapati":
dIngredients = "Wheat flour, oil";
break;
case "Parota":
dIngredients = "Maida, oil";
break;
}
System.out.println(dIngredients + " (for " + finalDinners[i] + ")");
}
}
}
