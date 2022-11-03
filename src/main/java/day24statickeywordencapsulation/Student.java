package day24statickeywordencapsulation;

// Encapsulation : "Data Hiding" - data  gizleme
// Data'yı Niçin gizlersiniz? Data'yı dış etkenlerden korumak için
// Data'yı nasıl gizlersiniz? Access Modifier'ı Private yaparak gizlerim.
// Data'yı gizledikten sonra başka class'lardan okumak istersen ne yaparsın?
// "get" method'lar (getters) oluşturarak gizlediğimiz data'ları okunur hale getire biliriz.
// Data'ı gizledikten sonra başka Class'lardan değiştirmek istersen ne yaparsın?
// "set" method'lar (setters) oluşturarak gizlediğimiz data'ları değiştire biliriz.

// Variable'ın data type'ı ile get method'un return type'ı aynı olmalıdır.
// get method'ları isimlendirirken "get + <Variabel name>" ancak variable'ın data type'ı boolean ise
// is + <Variable name>

// set method() sadece değiştirir bırakır ve yeni bir şey vermez. o yüzden void kullanılır.



public class Student {

    public String stdName = "Tom Hanks";
    private String stdId = "TH202201";
    private double gpa = 3.8;
    private boolean retired = false;

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public boolean isRetired() {
        return retired;



    }
}
