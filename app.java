import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Climatizador a = new Climatizador("Portátil i2.5", 2500);
        Climatizador b = new Climatizador("Home", 3500);
        Climatizador c = new Climatizador("Portátil i5", 5000);
        Climatizador d = new Climatizador("i8", 8000);
        Climatizador e = new Climatizador("Portátil i9", 9000);
        Climatizador f = new Climatizador("Portátil i11", 11000);
        Climatizador g = new Climatizador("Portátil i15", 15000);
        Climatizador h = new Climatizador("SBi20", 20000);
        Climatizador i = new Climatizador("SCi20", 20000);
        Climatizador j = new Climatizador("SLi20", 20000);
        Climatizador k = new Climatizador("Atlas", 25000);
        Climatizador l = new Climatizador("SBi30", 30000);
        Climatizador m = new Climatizador("SCi30", 30000);
        Climatizador n = new Climatizador("Eros", 36000);
        Climatizador o = new Climatizador("Apollo", 44000);
        Climatizador p = new Climatizador("Hercules", 51000);
        Climatizador q = new Climatizador("Titan", 70000);
        Climatizador r = new Climatizador("Zeus", 95000);

        Scanner teclado = new Scanner(System.in);
        Climatizador[] climas = new Climatizador[18];
        climas[0]=a;
        climas[1]=b;
        climas[2]=c;
        climas[3]=d;
        climas[4]=e;
        climas[5]=f;
        climas[6]=g;
        climas[7]=h;
        climas[8]=i;
        climas[9]=j;
        climas[10]=k;
        climas[11]=l;
        climas[12]=m;
        climas[13]=n;
        climas[14]=o;
        climas[15]=p;
        climas[16]=q;
        climas[17]=r;
        System.out.print("Digite metragem: ");
        double metragem=teclado.nextInt();
        System.out.print("Digite altura: ");
        double altura=teclado.nextInt();
        double vazaoNecessaria=altura*metragem*50;
        System.out.println(vazaoNecessaria);//vazão que o ambiente precisa para ser climatizado
        int tamanho = climas.length-1;//para percorrer no while
        int contador = 0;//Para limitar apenas duas opções de orçamento
        while(tamanho>=0){
            if (climas[tamanho].testaVazao(vazaoNecessaria)==0){
                tamanho--;
            }else{
                System.out.println("Sua àrea precisa de "+climas[tamanho].testaVazao(vazaoNecessaria)+" Climatizador modelo: "+climas[tamanho].nome);
                //tamanho=-1;
                tamanho--;
                contador++;
            }
            if (contador>=2) {
                return;
            }
        }
    }
}
