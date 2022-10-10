public class MathFunc implements  MathCalculable{
    double num;
    MathFunc(double num){
        this.num=num;
    }
    @Override
    public double modul(double num) {
        return Math.abs(num);
    }

    @Override
    public double powerup(double num, int pwr) {
        return Math.pow(num,pwr);
    }
    public String krug(){
        return "Площадь круга = "+(powerup(num,2)*PI);
    }

    @Override
    public String toString() {
        return "MathFunc{" +
                "num = " + num +
                '}';
    }
}
