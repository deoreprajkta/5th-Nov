package Collection;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic<Integer> x = new Generic<Integer>();
        x.a = 58;
        
      //  x.a = '@'; // run time error showing
       x.b = 87;
       System.out.println(x.b);
       
       Generic<String> y = new Generic<String>();
       
       y.b="Prajuniket";
       System.out.println(y.b);
	}

}
