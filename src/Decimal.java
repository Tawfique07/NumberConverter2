public abstract class Decimal {
    private String sub;

    private int[] binary = new int[4];

    Decimal(){
        binary[0]=8;
        binary[1]=4;
        binary[2]=2;
        binary[3]=1;
    }
    protected String toDecimal(int start){
        String decimal;
        int dec=0;
        for(int i=start, j=0; i<=3; i++,j++){
            int num= (int) sub.charAt(j);
            num-=48;
            if(num==1){
                dec+=binary[i];
            }
        }
        char hex = 'A';
        if(dec<10){
            decimal = Integer.toString(dec);
        }
        else {
            decimal = Character.toString(hex+(dec-10));
        }
        return decimal;
    }

    protected void setSub(String sub) {
        this.sub = sub;
    }

}
