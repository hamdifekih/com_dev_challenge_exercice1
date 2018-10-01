package com.dev.challenge;

public class challenge {
	
	public void displayMagicalNumber(int pIMin, int pIMax) {
		
		if(pIMin==pIMax) {
			System.out.println(pIMin+" and "+pIMin+" are equals.");

		}
		else if(pIMax >pIMin  ) {
			for(int t=pIMin+1;t<pIMax;t++) {
				if(t%3==0 && t%5==0) {
					System.out.println("S H");

					
				}else if (t%3==0) {
						System.out.println('H');

					}else if (t%5==0) {
						System.out.println('S');

					}
					else {
						System.out.println(t);

					}
			}
		}else if (pIMax < pIMin ) {
			for(int t=pIMax+1;t<pIMin;t++) {
				
				if(t%3==0 && t%5==0) {
					System.out.println("S H");

					
				}else if (t%3==0) {
					System.out.println('H');

				}else if (t%5==0) {
					System.out.println('S');

				}
				else {
					System.out.println(t);

				}
		}
		}
	}
}
