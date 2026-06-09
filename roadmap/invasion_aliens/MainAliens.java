package invasion_aliens;

public class MainAliens {

	
		public static void main(String[] args) {
			Alien bicho1=new Alien("Alien 1");
			Alien bicho2=new Alien("Alien 2");
			Alien bicho3=new Alien("Alien 3");

			bicho1.recibirDisparo();
			System.out.println(Alien.estadoInvasion());
			bicho1.recibirDisparo();
			System.out.println(Alien.estadoInvasion());
			bicho2.recibirDisparo();
			bicho2.recibirDisparo();
			System.out.println(Alien.estadoInvasion());
			bicho3.recibirDisparo();
			bicho3.recibirDisparo();
			System.out.println(Alien.estadoInvasion());
		}

}
