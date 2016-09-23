package mx.edu.utng.examplefactorypokemones;

/**
 * Created by volibear on 13/09/16.
 */
public class FabricaDePokemon {
    private Pokemon pokemon;
    public Pokemon crearPokemon(String tipo){
        if (tipo == null) {
            return null;
        } else {
            if (tipo.equalsIgnoreCase("Fuego")) {
                return new Fuego();
            } else {
                if (tipo.equalsIgnoreCase("Agua")) {
                    return new Agua();
                } else {
                    if (tipo.equalsIgnoreCase("Yerba")) {
                        return new Yerba();
                    } else {
                        if (tipo.equalsIgnoreCase("Normal")){
                            return new Normal();
                        }
                        return null;
                    }

                }
            }
        }
    }
}
