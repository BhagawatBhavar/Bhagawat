package com.te.abstraction;

import java.util.Scanner;

public class Customer {
	BMW car;
	Farrari car3;
	public void getcar(int a,int b) {
		if( a==1&& b==1) {
			Engine car1=new Engine(2000,100,2);
			car1.hourspower();
			car1.cc();
			car1.piston();
			this.car= new BMW("Red");
			car.accelrate();
			car.breke();
			car.color();
			
		}
		 else if(a==1&&b==2) {
			 Engine1 car2=new Engine1(2000,100,2);
				car2.hourspower();
				car2.cc();
				car2.piston();
				this.car=new BMW("Red");
				car.accelrate();
				car.breke();
				car.color();
			
		}
		 else if(a==2&&b==2) {
			 Engine1 car2=new Engine1(2000,100,2);
				car2.hourspower();
				car2.cc();
				car2.piston();
				this.car3=new Farrari("Black");
				car3.accelrate();
				car3.breke();
				car3.color();
		
	}
		 else if(a==2&&b==1) {
			 Engine car1=new Engine(2000,100,2);
				car1.hourspower();
				car1.cc();
				car1.piston();
				this.car3=new Farrari("black");
				car3.accelrate();
				car3.breke();
				car3.color();
		
	}
	}
   
        
}
