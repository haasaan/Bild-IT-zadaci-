package Zadaci_22_08_2016;

public class TestRegularPolygon {

	public static void main(String[] args) {
		// Pravimo novi objekat tj vise nizova kojima cemo proslijediti neke
		// vrijednosti tj vrijednosti iz konstruktora tj datafieldove koje smo
		// prosledili ako argumenete konstruktorima i dodjeliti im sada
		// vridjenosti
		RegularPolygon[] regularPolygons = new RegularPolygon[3];
		regularPolygons[0] = new RegularPolygon();
		regularPolygons[1] = new RegularPolygon(6, 4);
		regularPolygons[2] = new RegularPolygon(10, 4, 5.6, 8.7);
		// For petlja krece od nula ide do 3
		for (int i = 0; i < 3; i++) {
			// Printamo nase parametre poligona implementirajuci gettere iz
			// RegularPolygon klase
			System.out.printf("Polygon #%d area = %.3f perimeter = %.3f\n", i, regularPolygons[i].getArea(),
					regularPolygons[i].getPerimeter());
		}
	}

}
