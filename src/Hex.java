public class Hex extends Decimal {
    private String number;
    private String hex="";
    Hex(String number){
        super();
        this.number=number;
        toHex();
    }
    private void toHex (){
        int length = number.length();
        length = length%4;
        switch (length){
            case 1:
                number = "000"+ number;
                break;
            case 2:
                number = "00"+ number;
                break;
            case 3:
                number = "0"+ number;
                break;
        }
        for(int i=0; i<=number.length()-4; i+=4){
            setSub(number.substring(i,i+4));
            hex+=toDecimal(0);
        }

    }
    public String getHex(){
        return hex;
    }
}
