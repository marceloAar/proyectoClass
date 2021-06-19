//Marcelo Aceituno R
//Full Stack JAVA 0034
//Proyecto Class
public class ProjectTest {

	public static void main(String[] args) {
		
		Project pro1 = new Project();
		
		pro1.setNombre("NASA");
		pro1.setDescripcion("Administración Nacional de Aeronáutica y el Espacio.");
		pro1.setInitialCost(20000);
		System.out.println(pro1.elevatorPitch());
		
		Project pro2 = new Project();
		pro2.setNombre("SPACEX");
		pro2.setDescripcion("Space Exploration Technologies Corp.");
		pro2.setInitialCost(11000);
		System.out.println(pro2.elevatorPitch());
		
		Project pro3 = new Project();
		pro3.setNombre("JAXA");
		pro3.setDescripcion("Agencia Japonesa de Exploración Aeroespacial.");
		pro3.setInitialCost(15000);
		System.out.println(pro3.elevatorPitch());

	}
}
