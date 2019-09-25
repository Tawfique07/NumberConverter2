public class Octal extends Decimal {
    private String number;
    private String octal="";
    Octal(String number){
        super();
        this.number=number;
        toOctal();
    }
    private void toOctal (){
        int length = number.length();
        length = length %3;
        switch (length){
            case 1:
                number = "00"+ number;
                break;
            case 2:
                number = "0"+ number;
                break;
        }
        for(int i=0; i<=number.length()-3; i+=3){
            setSub(number.substring(i,i+3));
            octal+=toDecimal(1);
        }
    }
    public String getOctal(){
        return octal;
    }
}
