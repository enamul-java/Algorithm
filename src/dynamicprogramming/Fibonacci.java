/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

/**
 *
 * @author ehaque
 */
/* Java program for Memoized version */
/* Java program for Tabulated version */
public class Fibonacci {
	int fib(int n)
	{
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = f[i - 1] + f[i - 2];
		return f[n];
	}

	public static void main(String[] args)
	{
		Fibonacci f = new Fibonacci();
		int n = 40;
		System.out.println("Fibonacci number is"+ " " + f.fib(n));
	}
}
// This Code is Contributed by Saket Kumar
