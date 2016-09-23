package mx.edu.utng.exampleprototypecodigosdebarra;

/**
 * Created by volibear on 14/09/16.
 */
public class CodigoDeBarras implements Clonable {

    private String codigo;

    public CodigoDeBarras(){

    }
    public CodigoDeBarras (String codigo){
        this.codigo = codigo;
    }
    public Clonable clonar(){
        CodigoDeBarras codigoclonado = new CodigoDeBarras(codigo);
        return codigoclonado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
