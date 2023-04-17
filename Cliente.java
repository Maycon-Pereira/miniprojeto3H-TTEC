public class Cliente {
    // Atributo
    private String nome;
    //Método
    public void falar(){
        System.out.print("falei");
    }
    // Getter e Setter
    public String getNome(){
        return this.nome;
    }
    public void setNome(String _nome){
        this.nome = _nome;
    }
}