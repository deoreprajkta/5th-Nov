package Inheritance;

import Inheritance.Child;
import Inheritance.Subchild;


	public class Subchild  extends Child {
		
		static void Child() {
			System.out.println("Notebook");
		}
		protected  void laptop() {
			System.out.println("laptop");
		}
		
		
		public static void main (String[] args) {
			
			Subchild x = new Subchild();
			x.Bike();
			x.Home();
			x.car();
			Child();
			x.Money();
			x.farm();
			x.Home2();
			x.Mobile();
			
			System.out.println();
			Subchild y = new Subchild();
			y.add();
			Subchild t = new Subchild();
			t.add();
		}

		private void add() {
			// TODO Auto-generated method stub
			
		}

	}


