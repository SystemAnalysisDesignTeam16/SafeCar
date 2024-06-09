import java.util.ArrayList;

public class PaketoAsfalisis {
    private int _id;
    private String _onoma;
    private double _timi;
    private String _asfalistiki;
    private String _perigrafi;
    private String _diarkeia;

    public PaketoAsfalisis(String onoma, double timi, String asfalistiki, String perigrafi, String diarkeia) {
        this._onoma = onoma;
        this._timi = timi;
        this._asfalistiki = asfalistiki;
        this._perigrafi = perigrafi;
        this._diarkeia = diarkeia;
    }

    public String getOnoma() {
        return _onoma;
    }

    public void setOnoma(String onoma) {
        this._onoma = onoma;
    }

    public double getTimi() {
        return _timi;
    }

    public void setTimi(double timi) {
        this._timi = timi;
    }
    
    public String getAsfalistiki() {
        return _asfalistiki;
    }

    public void setAsfalistiki(String asfalistiki) {
        this._asfalistiki = asfalistiki;
    }

    public String getPerigrafi() {
        return _perigrafi;
    }

    public void setPerigrafi(String perigrafi) {
        this._perigrafi = perigrafi;
    }
    
    public String getDiarkeia() {
    	return _diarkeia;
    }
    
    public void setDiarkeia(String diarkeia) {
    	this._diarkeia = diarkeia;
    }
}
