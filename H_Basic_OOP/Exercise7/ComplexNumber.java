package Java_Basic_And_OOP.H_Basic_OOP.Exercise7;

public class ComplexNumber {
    /*Xây dựng chương trình tính tổng hai số phức. Số phức là số được biểu diễn dưới dạng tổng của hai phần, phần thực và phần ảo. Ví dụ số phức 5 + 8i, phần thực là 5, phần ảo là 8i. Tổng của hai số phức là một số phức có các phần thực và ảo là tổng tương ứng của các phần của hai số phức đó. */

    private double real;
    private double imag;

    ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public double getReal(){
        return real;
    }

    public double getImag(){
        return imag;
    }

}
