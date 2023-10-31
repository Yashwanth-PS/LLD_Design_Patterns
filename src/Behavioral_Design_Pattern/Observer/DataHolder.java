package Behavioral_Design_Pattern.Observer;
public class DataHolder { // Data Holder Class
    private String Data;
    public DataHolder(String data) {
        Data = data;
    }
    public String getData() {
        return Data;
    }
    public void setData(String data) {
        Data = data;
    }
}