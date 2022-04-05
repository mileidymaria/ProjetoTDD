package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrazoDeEntrega {
    private String origem;
    private String destino;

    private static final List<String> UF_NORDESTE = Arrays.asList("AL", "BA", "CE", "MA", "PB", "PE", "PI", "RN", "SE");
    private static final List<String> UF_NORTE= Arrays.asList("AC", "AP", "AM", "PA", "RO", "RR", "TO");
    private static final List<String> UF_CENTRO_OESTE = Arrays.asList("DF", "GO", "MT", "MS");
    private static final List<String> UF_SUDESTE = Arrays.asList("ES", "MG", "RJ", "SP");
    private static final List<String> UF_SUL = Arrays.asList("PR", "SC", "RS");

    private static final Map<String, Integer> UF_PRAZOS = new HashMap<>(27){{
        put("NORDESTE x NORDESTE", 5);
        put("NORDESTE x NORTE", 7);
        put("NORDESTE x CENTRO OESTE", 9);
        put("NORDESTE x SUDESTE", 10);
        put("NORDESTE x SUL", 15);

        put("NORTE x NORTE", 5);
        put("NORTE x NORDESTE", 7);
        put("NORTE x CENTRO OESTE", 9);
        put("NORTE x SUDESTE", 10);
        put("NORTE x SUL", 15);

        put("CENTRO OESTE x CENTRO OESTE", 5);
        put("CENTRO OESTE x NORTE", 7);
        put("CENTRO OESTE x NORDESTE", 9);
        put("CENTRO OESTE x SUDESTE", 10);
        put("CENTRO OESTE x SUL", 15);

        put("SUDESTE x SUDESTE", 5);
        put("SUDESTE x SUL", 7);
        put("SUDESTE x CENTRO OESTE", 5);
        put("SUDESTE x NORTE", 9);
        put("SUDESTE x NORDESTE", 10);

        put("SUL x SUL", 5);
        put("SUL x CENTRO OESTE", 11);
        put("SUL x NORTE", 15);
        put("SUL x NORDESTE", 11);
        put("SUL x SUDESTE", 7);
    }};

    public int verificaPrazo(){
        StringBuilder key = new StringBuilder();
        if(UF_CENTRO_OESTE.contains(this.origem)){
            key.append("CENTRO OESTE");
        }
        else if(UF_NORDESTE.contains(this.origem)){
            key.append("NORDESTE");
        }
        else if(UF_SUDESTE.contains(this.origem)){
            key.append("SUDESTE");
        }
        else if(UF_SUL.contains(this.origem)){
            key.append("SUL");
        }
        else{
            key.append("NORTE");
        }

        key.append(" x ");

        if(UF_CENTRO_OESTE.contains(this.destino)){
            key.append("CENTRO OESTE");
        }
        else if(UF_NORDESTE.contains(this.destino)){
            key.append("NORDESTE");
        }
        else if(UF_SUDESTE.contains(this.destino)){
            key.append("SUDESTE");
        }
        else if(UF_SUL.contains(this.destino)){
            key.append("SUL");
        }
        else{
            key.append("NORTE");
        }
        return UF_PRAZOS.get(key.toString());
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
