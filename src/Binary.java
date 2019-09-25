public abstract class Binary {

    private int number;
    private String binary="";
    private StringBuilder input;
    protected boolean Mark = false;

    Binary(int number){
        setNumber(number);
        input = new StringBuilder();
        toBinary(this.number);
    }
    private void setNumber(int number){
        if(number < 0){
            this.number = Math.abs(number);
            Mark = true;
        }
        else{
            this.number=number;
        }
    }


    private void toBinary(int number){
        String temp;
        for(int i=number; i!=0; i/=2){
            temp = Integer.toString(i%2);
            binary += temp;
        }
        input.append(binary);
        input.reverse();
        binary = input.toString();
    }

    public abstract String toHex();
    public abstract String toOctal();

    protected String getBinary(){
        return binary;
    }
}
