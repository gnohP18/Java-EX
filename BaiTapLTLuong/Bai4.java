package BaiTapLTLuong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai4 {
	public int nhapso() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(luongvao);
		String s=br.readLine();
		return Integer.parseInt(s);
	}
	public static void main(String[] args) {
		Bai4 dt = new Bai4();
		int cot=10;
		int dong=10;
		int [][] mang= new int [cot][dong];
		int [] mangmax= new int [dong];
		try
		{
			 do
			 {
				 System.out.println("Nhap so nguyen duong n m ");
				 cot=dt.nhapso();
				 dong=dt.nhapso();
				 for (int i=0;i<cot;i++)
					 for(int j=0;j<dong;j++)
					 {
						 mang[i][j]=dt.nhapso();
					 }
			 }
			 while (cot<=0&&dong<=0);
			 }catch (Exception e) {System.out.println("loi "+e);}
		for (int i=0;i<cot;i++)
		{
			 for(int j=0;j<dong;j++)
			 {
				 System.out.print(mang[i][j]+" ");
				 
			 }
			 System.out.println();
		}
		int p=1;
		for (int i=0;i<cot;i++)
		{
			if(mang[0][i]%3==0)
			{
				p=p*mang[0][i];
			}
		}
		System.out.println("tich la "+p);
		for (int i=0;i<dong;i++)
		{
			int max=mang[0][i];
			for (int j=0;j<cot;j++)
			{
				if(max<mang[i][j]) max=mang[i][j];
			}
			mangmax[i]=max;
		}
		for(int i=0;i<dong;i++)
		{
			System.out.print(mangmax[i]+" ");
		}
		System.out.println();
		int [] mangmax2= new int [dong-1];
		for(int i=0;i<mangmax2.length;i++)
		{
			mangmax2[i]=mangmax[i+1];
		}
		for(int i=0;i<mangmax2.length;i++)
		{
			System.out.print(mangmax2[i]+" ");
		}
	}
}
