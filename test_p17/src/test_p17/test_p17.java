package test_p17;

import test_p17.Car;

public class test_p17 {
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		car1.setNumGas(1234,20.5);
		
		int number = car1.getNum();
		double gasonline = car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		System.out.println("�����O" + number + "�A�T�o�q�O"+gasonline);
		

	}

}
class Car
{
	int num;
	double gas;
	int getNum()
	{

		System.out.println("�լd����");
		return num;
	}
	double getGas()
	{
		
		System.out.println("�լd�T�o�q");	
		return gas;
	}
	void setNumGas(int n ,double g)
	{
		num = n;
		gas = g;
		
		System.out.println("�N�����]��" + num + "�A�T�o�q�]��"+gas);
	}

	
	}