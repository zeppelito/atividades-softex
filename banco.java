

package itau.banco;

public class account{
    public String user;
    private int login;
    private int senha;
    public int transacao;

    public String set_usuario(String inserir_usuario){
        this.user = inserir_user;
    }
    public String get_usuario(){
        return user;
    }
    private int set_login(int fazer_login, int senha){
        this.login = fazer_login;
        this.senha = senha;
        
    }

}

---------------------------------------------------------

package transacao.banco;

public class pix{
    public String user;
    public int transacao;

    public String set_usuario(String inserir_usuario){
        this.user = inserir_user;
    }
    public String get_usuario(){
        return user;
    }
    public int set_transacao(int fazer_transacao){
        this.transacao = fazer_transacao;
    }

}