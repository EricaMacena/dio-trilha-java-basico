public class App {
    
    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void parar();
        void avancar();
        void retroceder();
    }

    public interface AparelhoTelefonico {
        void fazerChamada(String numeroTelefone);
        void receberChamada(String numeroTelefone);
        void enviarMensagem(String numeroTelefone, String mensagem);
        void receberMensagem(String numeroTelefone, String mensagem);
    }

    public interface NavegadorNaInternet {
        void abrirURL(String url);
        void exibirPagina();
        void atualizarPagina();
        void adicionarAosFavoritos();
    }

    public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

        // Implementação dos métodos de ReprodutorMusical
        public void tocar() {
            System.out.println("Tocando música...");
        }

        public void pausar() {
            System.out.println("Música pausada.");
        }

        public void parar() {
            System.out.println("Música parada.");
        }

        public void avancar() {
            System.out.println("Próxima faixa.");
        }

        public void retroceder() {
            System.out.println("Faixa anterior.");
        }

        // Implementação dos métodos de AparelhoTelefonico
        public void fazerChamada(String numeroTelefone) {
            System.out.println("Ligando para " + numeroTelefone + "...");
        }

        public void receberChamada(String numeroTelefone) {
            System.out.println("Recebendo ligação de " + numeroTelefone + "...");
        }

        public void enviarMensagem(String numeroTelefone, String mensagem) {
            System.out.println("Enviando mensagem para " + numeroTelefone + ": " + mensagem);
        }

        public void receberMensagem(String numeroTelefone, String mensagem) {
            System.out.println("Recebendo mensagem de " + numeroTelefone + ": " + mensagem);
        }

        // Implementação dos métodos de NavegadorNaInternet
        public void abrirURL(String url) {
            System.out.println("Abrindo URL: " + url);
        }

        public void exibirPagina() {
            System.out.println("Exibindo página.");
        }

        public void atualizarPagina() {
            System.out.println("Atualizando página.");
        }

        public void adicionarAosFavoritos() {
            System.out.println("Página adicionada aos favoritos.");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        iPhone meuIphone = app.new iPhone();
        
        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.parar();
        meuIphone.avancar();
        meuIphone.retroceder();
        
        // Testando AparelhoTelefonico
        meuIphone.fazerChamada("123456789");
        meuIphone.receberChamada("987654321");
        meuIphone.enviarMensagem("123456789", "Olá, como vai?");
        meuIphone.receberMensagem("987654321", "Estou bem, obrigado!");
        
        // Testando NavegadorNaInternet
        meuIphone.abrirURL("https://www.exemplo.com");
        meuIphone.exibirPagina();
        meuIphone.atualizarPagina();
        meuIphone.adicionarAosFavoritos();
    }
}
