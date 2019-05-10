import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {
    public static void main(String[] args) {

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();
        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");


        Map<String, List<String>> listaDeApelidos = new HashMap<>();
        listaDeApelidos.put("João", apelidosJoao);
        listaDeApelidos.put("Miguel", apelidosMiguel);
        listaDeApelidos.put("Maria", apelidosMaria);
        listaDeApelidos.put("Lucas", apelidosLucas);

        System.out.println(listaDeApelidos.size());

        for (String umaChave : listaDeApelidos.keySet()) {
            List pessoa = listaDeApelidos.get(umaChave);
            String pessoaEApelidos = umaChave + " - " + pessoa;
            System.out.println(pessoaEApelidos);

        }
    }
}
