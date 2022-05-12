package BaiTapLTLuong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai3 {
	public int nhapso() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(luongvao);
		String s=br.readLine();
		return Integer.parseInt(s);
	}
	static int[] mang;
	public static void Sole()
	{
		for(int i=0;i<mang.length;i++)
		{
			if (mang[i]%2==1)
			{
				System.out.print(mang[i]+" ");
			}
		}
		System.out.println();
	}
	public static void KiemtraK(int k)
	{
		boolean kt=false;
		for(int i=0;i<mang.length;i++)
		{
			if(mang[i]==k)
			{
				kt=true;
				System.out.println("vi tri "+(i+1));
				break;
			}
		}
		if(kt==false) System.out.println("So "+k+" khong co trong mang nay");
	}
	public static void BubbleSort()
	{
		for (int i=0;i<mang.length;i++)
		{
			for (int j=i+1;j<mang.length;j++)
			{
				if(mang[i]>mang[j])
				{
					int tam=mang[i];
					mang[i]=mang[j];
					mang[j]=tam;
				}
			}
			
		}
		System.out.println("Sau khi sap xep");
		for (int i=0;i<mang.length;i++)
		{
			System.out.print(mang[i]+" ");
		}
		System.out.println();
	}
	public static void ChenPVaoMang(int p)
	{
		int newlength=mang.length;
		newlength++;
		int[] mangmoi=new int[newlength];
		int vitri=0;
		for(int i=0;i<mang.length;i++)
		{
			if(mang[i]<p&&mang[i+1]>p)
			{
				vitri=i+1;
			}
		}
		for (int i = 0; i < vitri; i++)
	        mangmoi[i] = mang[i];
		mangmoi[vitri]=p;
		for (int i = vitri+1; i < newlength; i++)
	        mangmoi[i] = mang[i-1];
		System.out.println();
		System.out.println("Mang moi");
		for (int i=0;i<newlength;i++)
		{
			System.out.print(mangmoi[i]+" ");
		}
	}
	public static void main(String[] args) {
		Bai3 dt = new Bai3();
		
		int n=0;
		int k=0;
		int p=0;
		try
		{
			 do
			 {
				 System.out.println("Nhap so nguyen duong n k p");
				 n=dt.nhapso();
				 k=dt.nhapso();
				 p=dt.nhapso();
				 int[] a= new int [n];
				 for(int i=0;i<n;i++)
					{
						a[i]=dt.nhapso();
					}
				 mang=a;
			 }
			 while (n<=0);
			 }catch (Exception e) {System.out.println("loi "+e);}
		//for(int i=0;i<n;i++)
		//{
		//	System.out.print(mang[i]+" ");
		//}
		dt.Sole();
		dt.KiemtraK(k);
		dt.BubbleSort();
		dt.ChenPVaoMang(p);
	}
}
