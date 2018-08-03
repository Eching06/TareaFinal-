
package Automovil;


public class ObAuto {
    private String Marc;
    private String Model;
    private String Col;
    private int Anio;
    private String Des;
    
    

    public ObAuto(String Marc, String Model, String Col, int Anio, String Des) {
        setMarc(Marc);
        setModel(Model);
        setCol(Col);
        setAnio(Anio);
        setDes(Des);
    }
    
    public ObAuto(){}

    public String getMarc() {
        return Marc;
    }

    public void setMarc(String Marc) {
        this.Marc = Marc;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getCol() {
        return Col;
    }

    public void setCol(String Col) {
        this.Col = Col;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
    
    public String toString(){
        return "Marca: "+getMarc()+" Modelo: "+getModel()/*+" Año: "+getAnio()+" Descripción: "+getDes()*/;
    }
    
    

    
}
