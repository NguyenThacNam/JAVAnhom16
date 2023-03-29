import java.util.Scanner;

public class HinhTru {  // tao thuoc tinh cua hinh tru
    public final float PI = 3.14f;
    public float banKinh;
    public float dienTich;
    public float chieuCao;
    public float dienTichHT;
    public float theTich;

Scanner sc = new Scanner(System.in); 
public void setBanKinh()
{
    System.out.print("Nhap ban kinh: ");
    banKinh = sc.nextInt();
}
public void setChieuCao()
{
    System.out.print("Nhap chieu cao: ");
    chieuCao = sc.nextInt();
}


public void theTich()
{
    theTich = PI  * banKinh * banKinh * chieuCao;
}

public void DThinhTru()
{
    dienTichHT = 2 * PI * banKinh * chieuCao;
}


public void ThongTinHinhTru()
{
    System.out.printf("Hinh tru co ban kinh bang %f - dien tich bang %f - the tich bang %f", banKinh,dienTichHT , theTich);
}
    
}
