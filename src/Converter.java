public class Converter extends Binary {
    private Octal octal;
    private Hex hex;
    Converter(int number){
        super(number);
        octal = new Octal(getBinary());
        hex = new Hex(getBinary());
    }

    public String toOctal(){

        if(Mark){
            return "-"+ octal.getOctal();
        }
        else{
            return octal.getOctal();
        }
    }

    public String toHex (){

        if(Mark){
            return "-"+ hex.getHex();
        }
        else{
            return hex.getHex();
        }
    }

    public String toBinary(){
        if(Mark){
            return "-"+getBinary();
        }
        else {
            return getBinary();
        }
    }
}
