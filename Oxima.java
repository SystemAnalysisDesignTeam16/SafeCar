public class Oxima {
    private static int idCounter = 1;
    private int _id;
    private String _plateNum;
    private String _marka;
    private String _model;
    private int _kivika;
    private String _xrwma;

    public Oxima(String plateNum, String marka, String model, int kivika, String xrwma) {
        this._id = idCounter++;
        this._plateNum = plateNum;
        this._marka = marka;
        this._model = model;
        this._kivika = kivika;
        this._xrwma = xrwma;
    }

    public int getId() {
        return _id;
    }

    public String getPlateNum() {
        return _plateNum;
    }

    public String getMarka() {
        return _marka;
    }

    public String getModel() {
        return _model;
    }

    @Override
    public String toString() {
        return "Oxima{" +
                "id=" + _id +
                ", Pinakida='" + _plateNum + '\'' +
                ", Marka='" + _marka + '\'' +
                ", Modelo='" + _model + '\'' +
                ", Kivika=" + _kivika +
                ", Xrwma='" + _xrwma + '\'' +
                '}';
    }
}
