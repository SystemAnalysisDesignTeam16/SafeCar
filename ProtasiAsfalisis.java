public class ProtasiAsfalisis {
    private static int idCounter = 1;
    private int _id;
    private int _idPelatis;
    private int _idOximatos;
    private String _diarkeia;
    private double _kostos;

    public ProtasiAsfalisis(int idPelatis, int idOximatos, String diarkeia, double kostos) {
        this._id = idCounter++;
        this._idPelatis = idPelatis;
        this._idOximatos = idOximatos;
        this._diarkeia = diarkeia;
        this._kostos = kostos;
    }

    public int getId() {
        return _id;
    }
    
    public double get_kostos() {
		return _kostos;
	}

	@Override
    public String toString() {
        Pelatis owner = getOwner();
        Oxima vehicle = getVehicle();
        return "ProtasiAsfalisis{" +
                "id=" + _id +
                ", Idioktitis='" + owner.getOnoma() + '\'' +
                ", Oxima='" + vehicle.getMarka() + " " + vehicle.getModel() + " (" + vehicle.getPlateNum() + ")" +
                ", Diarkeia='" + _diarkeia + '\'' +
                ", Kostos=" + _kostos +
                '}';
    }

    private Pelatis getOwner() {
        for (Pelatis pelatis : Praktoras.pelatisList) {
            if (pelatis.getId() == _idPelatis) {
                return pelatis;
            }
        }
        return null; 
    }

    private Oxima getVehicle() {
        for (Oxima oxima : Praktoras.oximaList) {
            if (oxima.getId() == _idOximatos) {
                return oxima;
            }
        }
        return null; 
    }
}

