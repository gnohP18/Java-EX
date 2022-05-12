package BaiTapLTLuong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai1 {
	public String nhapchuoi() throws IOException
	{
		InputStreamReader luongvao= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(luongvao);
		//BufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}
	public void Daochuoi(String s)
	{
		String chuoinew = "";
		for( int i= s.length()-1; i>=0; i--)
		{
			chuoinew = chuoinew + s.charAt(i);
		}
		System.out.println(chuoinew);
	}
	public void DoiSangHoa(String s)
	{
		s=s.toUpperCase();
		System.out.println(s);
	}
	public void DoiSangThuong(String s)
	{
		s=s.toLowerCase();
		System.out.println(s);
	}
	public void DoiVuaHoaVuaThuong(String s)
	{
		char[] schar=s.toCharArray();
		for (int i=0;i<schar.length;i++)
		{
			if(schar[i]>=97&&schar[i]<=122)
			{
				schar[i]-=32;
			}
			else if(schar[i]<97&&schar[i]>32)
			{
				schar[i]+=32;
			}
		}
		s=String.valueOf(schar);
		System.out.println(s);
	}
	public void DemSoTu(String s)
	{
		int dem=1;
		char[] schar=s.toCharArray();
		for (int i=0;i<schar.length;i++)
		{
			if (schar[i]==32) dem++;
		}
		System.out.println("So tu trong chuoi la "+dem);
	}
	public void DemTanSuatTu(String s)
	{
		int counter[] = new int[256];
        for (int i = 0; i <  s.length(); i++)
            counter[s.charAt(i)]++;
        char array[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i] = s.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("so lan xuat hien cua " + s.charAt(i)
                        + " trong xau:" + counter[s.charAt(i)]);
        }
	}
	public static void main(String ag[])
	{
		Bai1 dt = new Bai1();
		String s = "";
		try {
				System.out.print("Nhap chuoi ");
				s =dt.nhapchuoi();
		}
		catch (Exception e) {}
		dt.Daochuoi(s);
		dt.DoiSangHoa(s);
		dt.DoiSangThuong(s);
		dt.DoiVuaHoaVuaThuong(s);
		dt.DemSoTu(s);
		dt.DemTanSuatTu(s);
	}
}