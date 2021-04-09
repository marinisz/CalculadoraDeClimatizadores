import java.text.DecimalFormat;
public class Climatizador {
    String nome;
    double vazao;

    Climatizador(String nome, int vazao){
        this.nome=nome;
        this.vazao=vazao;
    }

    public double testaVazao(double vazaoRecebida){
        double resp = 0;
        if(vazaoRecebida/this.vazao<0){
            resp=0;
        }
        else if((vazaoRecebida/this.vazao<1.5) && (vazaoRecebida/this.vazao>0.7)){
            resp=1;
        }
        else if (vazaoRecebida/this.vazao>1.5){
            double a = vazaoRecebida/this.vazao;
            double b = a/1-(a%1);
            resp = b;
        }
        return resp;
    }
}
