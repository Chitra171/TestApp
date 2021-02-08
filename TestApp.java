package day10;

import java.io.IOException;

class AgeException extends RuntimeException
    {
	int age;

   public AgeException(int age) {
		super();
		this.age = age;
	}
 }

     class CheckAge
 {
	void Age(int Age)throws Exception
	{
		if(Age>18) {
			throw new Exception("you can Vote");
		}
		else
			System.out.println("you cannot Vote");
	}
}


    public class TestApp {

	@Override
		public String toString() {
			return "TestApp []";
		}
    

	public static void main(String[] args) throws Exception
	
	{
    CheckAge a=new CheckAge();
    a.Age(17);
	}

}
    
