public class Pelatis {
    private static int idCounter = 1;
    private int _id;
    private String _onoma;
    private String _hmerominiaGennisis;
    private String _dieuthinsi;
    private int _arDiplwmatos;

    public Pelatis(String onoma, String hmerominiaGennisis, String dieuthinsi, int arDiplwmatos) {
        this._id = idCounter++;
        this._onoma = onoma;
        this._hmerominiaGennisis = hmerominiaGennisis;
        this._dieuthinsi = dieuthinsi;
        this._arDiplwmatos = arDiplwmatos;
    }

    public int getId() {
        return _id;
    }

    public String getOnoma() {
        return _onoma;
    }

    public int getArDiplwmatos() {
        return _arDiplwmatos;
    }

    @Override
    public String toString() {
        return "Pelatis{" +
                "id=" + _id +
                ", Onoma='" + _onoma + '\'' +
                ", Imerominia Gennisis='" + _hmerominiaGennisis + '\'' +
                ", Dieuthinsi='" + _dieuthinsi + '\'' +
                ", Arithmos Diplwmatos=" + _arDiplwmatos +
                '}';
    }
}
