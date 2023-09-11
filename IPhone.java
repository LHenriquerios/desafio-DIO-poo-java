// iPhone.java
public class IPhone implements MusicPlayer, Phone, InternetBrowser {
    @Override
    public void play() {
        System.out.println("Tocando uma música");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecionando música: " + music);
    }

    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Fazendo chamada para: " + phoneNumber);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void startVoiceRecording() {
        System.out.println("Iniciando gravação de voz");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando página no navegador");
    }

    public static void main(String[] args) {
        IPhone myiPhone = new IPhone();

        // Exemplo de uso
        myiPhone.play();
        myiPhone.makeCall("11 99912-1234");
        myiPhone.displayPage("https://www.example.com");
    }
}
