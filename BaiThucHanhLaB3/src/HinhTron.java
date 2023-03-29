import java.util.Scanner;

public class HinhTron { 
    public final float PI = 3.14f;
    public float bankinh;
    public float chuvi;
    public float dientich;

    Scanner sc = new Scanner(System.in); 
    public void setbankinh()
    {
        System.out.print("Nhap ban kinh: ");
        bankinh = sc.nextInt();
    }
    public void Tinhchuvi()
    {
        chuvi =  PI * (bankinh + bankinh);
    }

    public void Tinhdientich()
    {
        dientich = PI * bankinh * bankinh;
    }
    
    public void ThongTinHinhTron()
    {
        System.out.printf("Hinh tron co ban kinh bang %f - chu vi bang %f - dien tich bang %f", bankinh, chuvi, dientich);
    }
    
}
