
public class NegativeDTester {

	public static void main(String[] args) {
		Circle f=new Circle();
		Circle g=new Circle();
		Circle h=new Circle();
		System.out.println("For circle f(error is triggered)=>");
		try {
			f.setMyDiameter(-22.3);
		} catch (NegativeDiameterException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Diameter of circle f: "+	f.getMyDiameter());		
		System.out.println("For circle g=>");

		try {
			g.setMyDiameter(31.4);
		} catch (NegativeDiameterException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("Diameter of circle g: "+	g.getMyDiameter());
		
		System.out.println("For circle h (default constructor)=>");
		System.out.println("Diameter of circle f: "+	f.getMyDiameter());
		System.out.println("Diameter of circle h: "+	h.getMyDiameter());
	}

}
