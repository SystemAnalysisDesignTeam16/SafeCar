public class EkthesiPragmatognomosinis {
	private static int idCounter = 1;
	private int _id;
	private String _imerominiaAtiximatos;
	private String _toposAtiximatos;
	private int _arDiplwmatosOdigouA;
	private int _arDiplwmatosOdigouB;
	private String _ipaitios;
	private String _megethosZimias;
	private String _fwtografies;

	public EkthesiPragmatognomosinis(String imerominiaAtiximatos, String toposAtiximatos, int arDiplwmatosOdigouA, int arDiplwmatosOdigouB, String ipaitios, String megethosZimias, String fwtografies) {
		this._id = idCounter++;
		this._imerominiaAtiximatos = imerominiaAtiximatos;
		this._toposAtiximatos = toposAtiximatos;
		this._arDiplwmatosOdigouA = arDiplwmatosOdigouA;
		this._arDiplwmatosOdigouB = arDiplwmatosOdigouB;
		this._ipaitios = ipaitios;
		this._megethosZimias = megethosZimias;
		this._fwtografies = fwtografies;
	}

	public void printData() {
		System.out.println("-------------------");
		System.out.println("Arithmos Ekthesis: " + _id);
		System.out.println("Imerominia Atiximatos: " + _imerominiaAtiximatos);
		System.out.println("Topos Atiximatos: " + _toposAtiximatos);
		System.out.println("Arithmos Diplwmatos Odigou A: " + _arDiplwmatosOdigouA);
		System.out.println("Arithmos Diplwmatos Odigou B: " + _arDiplwmatosOdigouB);
		System.out.println("Ipaitios: " + _ipaitios);
		System.out.println("Megethos Zimias: " + _megethosZimias);
		System.out.println("Fwtografia: " + _fwtografies);
	}
}