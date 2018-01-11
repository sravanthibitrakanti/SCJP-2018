package chapter1;

//We can restrict a variable to having predefines values using enums
enum Coffesize{
	SMALL,BIG , HUGE 
}
public class EnumExamp {
 Coffesize size;
 public static void main(String args[]){
	 EnumExamp var =new EnumExamp();
	 var.size=Coffesize.BIG;
 }
}

