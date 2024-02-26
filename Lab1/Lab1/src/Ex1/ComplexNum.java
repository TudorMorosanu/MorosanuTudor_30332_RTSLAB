package Ex1;

public class ComplexNum {

    private float re;
    private float im;
    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public float getIm() {
        return im;
    }

    public void setIm(float im) {
        this.im = im;
    }

    public ComplexNum(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public static ComplexNum add(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getRe()+num2.getRe(), num1.getIm()+num2.getIm());
    }

    public static ComplexNum substract(ComplexNum num1, ComplexNum num2){
        return new ComplexNum(num1.getRe()-num2.getRe(), num1.getIm()-num2.getIm());
    }

    public static ComplexNum multiply(ComplexNum num1, ComplexNum num2){
        float re = num1.getRe() * num2.getRe() - num1.getIm() * num2.getIm();
        float im = num1.getRe() * num2.getIm() + num1.getIm() * num2.getRe();
        return new ComplexNum(re, im);
    }

    public void display(){
        char sign;
        if(this.getIm() >= 0)
        {
            sign = '+';
        }
        else
        {
            sign = '-';
        }
        System.out.println(Float.toString(this.getRe()) + sign + Float.toString(this.getIm()) + 'i');
    }
}
