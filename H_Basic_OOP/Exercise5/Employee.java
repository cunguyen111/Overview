package Java_Basic_And_OOP.H_Basic_OOP.Exercise5;

public class Employee {
    /*Giả sử một công ty tăng lương cho mỗi nhân viên theo tỷ lệ phần trăm nhất định. Hãy viết chương trình tính mức lương của nhân viên sau đợt tăng lương.

Quá trình thực hiện
Chúng ta cần tạo một lớp Employee với ba trường: name, currentSalary và newSalary. Vì công ty tăng lương theo một tỷ lệ phần trăm nhất định, chúng ta cần thiết lập newSalary ở phạm vi private để nó không bị sửa đổi ngẫu nhiên từ bên ngoài lớp.

Sau đó, ta sẽ sử dụng các phương thức setter và getter để tăng lương theo tỷ lệ phần trăm đã chỉ định và trả về mức lương đã tăng.

Đầu ra

Name: Felix
New Salary: 30256.235999999997
Name: Maria
New Salary: 1007437.744284 */

    public String name;
    private double currentSalary;
    private double newSalary;

    Employee(String name, double currentSalary){
        this.name = name;
        this.currentSalary = currentSalary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(double percentage){
        this.newSalary = this.currentSalary + (percentage / 100) * this.currentSalary;
    }

    public double getSalary(){
        return this.newSalary;
    }
}
