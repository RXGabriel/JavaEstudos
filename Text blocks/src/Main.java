public class Main {
    public static void main(String[] args) {

        String html = "<a href=\"mailto:joao@gmail.com\">\n   joao@gmail.com  </a>\n" +
                "<a>\n   abc@algaworks.com</a><a>xyz@algaworks.com</a>" +
                "<strong>maria@algaworks.com</strong>";
        String nome = "João da Silva";

        String html2 = """
                <a href=\"mailto:joao@gmail.com\">
                joao@gmail.com %s  </a> 
                abc@algaworks.com
                """;
        System.out.println(html2);

    }
}