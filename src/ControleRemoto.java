public class ControleRemoto implements Controlador{
    //Atributos
    private int volume; 
    private boolean ligado;
    private boolean tocando;

    //Método construtor
    public ControleRemoto(){ // quando eu instancio o meu objeto, ele começa com esses valores de entrada
        this.SetVolume(50);
        this.SetLigado(true);
        this.SetTocando(false);
    }
    //Métodos especiais
    private void SetVolume(int v){ // posso sim trabalha com metodo get e sett privado - mas quando for manuser ele no objeto nao podemos usar set nem get - vamos puxar o nome do método e inserir valores
        this.volume = v;
    }
    private int GetVolume(){
        return this.volume;
    }
    private void SetLigado(boolean l){
        this.ligado = l;
    }
    private boolean GetLigado(){
        return this.ligado;
    }
    private void SetTocando(boolean t){
        this.tocando = t;
    }
    private boolean GetTocando(){
        return this.tocando;
    }
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'ligar'");
        this.SetLigado(true);
    }
    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'desligar'");
        this.SetLigado(false);
    }
    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'abrirMenu'");
        System.out.println("Está ligado?: " + this.GetLigado());
        System.out.println("Está tocando?: " + this.GetTocando());
        System.out.println("Volume: " + this.GetVolume());
        for(int i=0; i<this.GetVolume(); i+=10){
            System.out.print("[]");
        }

    }
    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'fecharMenu'");
        System.out.print("Fechando menu....");
    }
    @Override
    public void aumentarVolume() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'aumentarVolume'");
        if (this.GetLigado()){
            this.SetVolume(this.GetVolume()+1);
          System.out.println("O volume aumentou para: " + this.GetVolume());
        }
        else{
            System.out.println("Impossível aumentar volume com a TV desligada!");
        }
    }
    @Override
    public void diminuirVolume() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'diminuirVolume'");
        if (this.GetLigado()){
            this.SetVolume(this.GetVolume()-1);
            System.out.println("O volume diminuiu para: " + this.GetVolume());
        }
        else{
            System.out.println("Impossível diminuir volume com a TV desligada!");
        }
        
    }
    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'ligarMudo'");
        if(this.GetLigado() && this.GetVolume() > 0){
            this.SetVolume(0);
        }
    }
    @Override
    public void desligarMudo(){
        if(this.GetLigado() && this.GetVolume() == 0){
            this.SetVolume(50);
        }
    }
    @Override
    public void play() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'play'");
        if(this.GetLigado() && !(this.GetTocando())){
            this.SetTocando(true);
        }
        else{
            System.out.println("Não foi possível dar play, a TV está desligada!");
        }
    }
    @Override
    public void pause() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'pause'");
        if(this.GetLigado() && this.GetTocando()){
            this.SetTocando(false);
        }
        else{
            System.out.println("Não foi possível pausar, a TV está desligada!");
        }
    }
    

    //método especifícos
}
