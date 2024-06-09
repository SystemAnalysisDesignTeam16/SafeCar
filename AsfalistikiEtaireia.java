import java.util.ArrayList;

public class AsfalistikiEtaireia {
	private static int idCounter = 1;
	private int _id;
	private String _epwnimia;
	private ArrayList<PaketoAsfalisis> _listaPaketwn;

	public AsfalistikiEtaireia(String epwnimia) {
		this._id = idCounter++;
		this._epwnimia = epwnimia;
	}

	public void setEpwnimia(String aEpwnimia) {
		this._epwnimia = aEpwnimia;
	}

	public String getEpwnimia() {
		return _epwnimia;
	}

}