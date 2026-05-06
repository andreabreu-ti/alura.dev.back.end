package alura.dev.back.end.nivel1.aula12;

public class PrincipalStrings {

    public static void main(String[] args) {

        String professor = "Jacqueline Oliveira";
        String disciplina = "Java e Programação Orientada a Objetos             ";
        String curriculo = "Pós-graduada em Engenharia e Arquitetura de Software; "
                + "Desenvolvedora backend Java desde 2010; ";

        // ================== trim() ==================
        System.out.println("---- trim() ----");
        System.out.println("Antes do trim: '" + disciplina + "'");
        System.out.println("Depois do trim: '" + disciplina.trim() + "'");

        // ================== toUpperCase() ==================
        System.out.println("\n---- toUpperCase() ----");
        System.out.println("Professor em maiúsculas: " + professor.toUpperCase());

        // ================== toLowerCase() ==================
        System.out.println("\n---- toLowerCase() ----");
        System.out.println("Professor em minúsculas: " + professor.toLowerCase());

        // ================== replace() ==================
        System.out.println("\n---- replace() ----");
        String curriculoModificado = curriculo.replace("Java", "Kotlin");
        System.out.println("Original : " + curriculo);
        System.out.println("Alterado : " + curriculoModificado);

        // ================== charAt() ==================
        System.out.println("\n---- charAt() ----");
        char primeiraLetra = professor.charAt(0);
        char ultimaLetra = professor.charAt(professor.length() - 1);
        System.out.println("Primeira letra do nome: " + primeiraLetra);
        System.out.println("Última letra do nome: " + ultimaLetra);

        // ================== substring() ==================
        System.out.println("\n---- substring() ----");
        String primeiraParte = disciplina.trim().substring(0, 4);
        String trecho = curriculo.substring(0, 25);
        System.out.println("Substring da disciplina: " + primeiraParte);
        System.out.println("Trecho do currículo: " + trecho);

        // ================== contains() ==================
        System.out.println("\n---- contains() ----");
        boolean contemJava = curriculo.contains("Java");
        boolean contemPython = curriculo.contains("Python");
        System.out.println("Currículo contém 'Java'? " + contemJava);
        System.out.println("Currículo contém 'Python'? " + contemPython);

        // ================== startsWith() ==================
        System.out.println("\n---- startsWith() ----");
        boolean iniciaComJava = disciplina.trim().startsWith("Java");
        boolean iniciaComPOO = disciplina.trim().startsWith("Programação");
        System.out.println("Disciplina começa com 'Java'? " + iniciaComJava);
        System.out.println("Disciplina começa com 'Programação'? " + iniciaComPOO);

        // ================== Exemplo combinado ==================
        System.out.println("\n---- Exemplo Combinado ----");
        String textoFinal = String.format(
                "Disciplina: %s | Professor: %s",
                disciplina.trim().toUpperCase(),
                professor.toLowerCase()
        );
        System.out.println(textoFinal);
    }
}
