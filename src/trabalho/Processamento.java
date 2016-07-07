package trabalho;

public class Processamento
{
    private int points;
    public Processamento(){
        points = 0;
    }
    public int setPoints(int points){
        this.points += points;
        if(this.points>=100){
            clearPoints();
            return 1;
        }
        return 0;
    }
    public int getPoints(){
        return this.points;
    }
    public void clearPoints(){
        this.points = 0;
    }
    public int procData(double chuva, double foliar, double temp){
        int retorno = 0;
        if(chuva > 0.254 && foliar > 10){
            if(temp>=20 && temp<=28.3) retorno = setPoints(11);
            if(temp>28.3) retorno = setPoints(8);
            if(temp<20) retorno = setPoints(6);
        }else if(chuva > 0.254 && foliar < 10){
            if(temp>=20 && temp<=28.3) retorno = setPoints(6);
            if(temp>28.3) retorno = setPoints(4);
            if(temp<20) retorno = setPoints(3);
        }else if(chuva < 0.254 && foliar > 10){
            if(temp>=20 && temp<=28.3) retorno = setPoints(6);
            if(temp>28.3) retorno = setPoints(6);
            if(temp<20) retorno = setPoints(4);
        }else if(chuva < 0.254 && foliar < 10){
            if(temp>=20 && temp<=28.3) retorno = setPoints(3);
            if(temp>28.3) return 0;
            if(temp<20) return 0;
        }
        return retorno;
    }
}
