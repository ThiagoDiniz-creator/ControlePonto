public class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo(){
        if(this.idFunc == 2){
            return "Gerente";
        } else if(this.idFunc == 6){
            return "Operador";
        }else if(this.idFunc == 9){
            return "Secretaria";
        } else{
            return "Sem cargo";
        }
    }

    @Override
    public String toString() {
        return this.getCargo() + " " + this.nome;
    }
}
