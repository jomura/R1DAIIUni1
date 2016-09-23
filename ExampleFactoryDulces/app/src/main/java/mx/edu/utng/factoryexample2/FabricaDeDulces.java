package mx.edu.utng.factoryexample2;

/**
 * Created by volibear on 8/09/16.
 */
public class FabricaDeDulces {

    private Dulce dulce;

    public Dulce crearDulce(String tipo) {
        if (tipo == null) {
            return null;
        } else {
            if (tipo.equalsIgnoreCase("Paleta")) {
                return new Paleta();
            } else {
                if (tipo.equalsIgnoreCase("Chicle")) {
                    return new Chicle();
                } else {
                    if (tipo.equalsIgnoreCase("Caramelo")) {
                        return new Caramelo();
                    } else {
                        if (tipo.equalsIgnoreCase("Gomita")){
                            return new Gomita();
                        }
                        return null;
                    }

                }
            }
        }

    }
}
