package BaiTapLTLuong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai2 {
	public int nhapso() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(luongvao);
		String s=br.readLine();
		return m=Integer.parseInt(s);
	}
	int m;
	int[] a= new int[100];
	int dem=1;
	int num=1000;
	int[] fibo= new int [num];
	public void TongCacChuSo(int n)
	{
		int s=0;
		
		while(n!=0)
		{
			s+=n%10;
			a[dem]=n%10;
			n/=10;
			dem++;
		}
		System.out.println("Tong cac chu so la "+s);
	}
	
	public void InSoDaoNguoc()
	{
		for(int i=1;i<dem;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	int flag=0;
	int fibonacci(int n) {
		
	    int f0 = 0;
	    int f1 = 1;
	    int fn = 1;
	    int i;
	 
	    if (n < 0) {
	        return -1;
	    } else if (n == 0 || n == 1) {
	        return n;
	    } 
	    else {
	        for (i = 2; i < n; i++) {
	            f0 = f1;
	            f1 = fn;
	            fn = f0 + f1;
	            if(fn==m) flag=1;
	        }
	    }
	    
	    return fn;
	}
	public void check()
	{
		if(m==0||m==1)flag=1;
		boolean kt=true;
		if(flag==0) kt =false;
		System.out.println("kt fibo= "+kt);
	}
	public void kiemtradoixung()
	{
		boolean kt=true;
		for(int i=1;i<dem;i++)
		{
			if(a[i]!=a[dem-i]) kt =false;
		}
		System.out.println("kiem tra doi xung "+ kt);
	}
	public static void main(String[] args) {
		Bai2 dt = new Bai2();
		int n=0;
		try
		{
			 do
			 {
				 System.out.print("Nhap 1 so nguyen duong n ");
				 n=dt.nhapso();
			 }
			 while (n<=0);
			 }catch (Exception e) {System.out.println("loi "+e);}
		dt.TongCacChuSo(n);
		dt.InSoDaoNguoc();
		dt.fibonacci(1000);
		dt.check();
		dt.kiemtradoixung();
	}

}
