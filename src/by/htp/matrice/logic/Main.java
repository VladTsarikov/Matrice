package by.htp.matrice.logic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	
		int c = 0;
		int v = 0;
		int p = 0;
		int l = 0;
		int min;
		
		System.out.println("Enter the dimention of the matrix(NxN): ");
	Scanner sc1 = new Scanner(System.in);
	int n = sc1.nextInt();
	int[][] matrice = new int[n][n];
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			matrice[i][j] = -n + (int) (Math.random() * (n+n)+1);
		}
	}
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			System.out.print(matrice[i][j]);
		}
		System.out.println();
	}
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n-1; j++){
			if(matrice[i][j]<matrice[i][j+1]){
				c+=1;
				if(c>p){
					p=c;
				}
			}
			else{
				c = 0;
			}
		}
		c = 0;
	}
	p++;
	System.out.println("Наибольшее число возрастающих элементов матрицы: " + p);

	for(int i = 0; i < n; i++){
		for(int j = 0; j < n-1; j++){
			if(matrice[i][j]>matrice[i][j+1]){
				v+=1;
				if(v>l){
					l=v;
				}
			}
			else{
				v = 0;
			}
		}
		v=0;
	}
	l++;
	System.out.println("Наибольшее число убывающих элементов матрицы: " + l);

	min = matrice[0][0];
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			if(min>matrice[i][j]){
					min=matrice[i][j];
			}
		}
	}
	System.out.println("Минимальный элемент матрицы: " + min);
	
	System.out.println("Введите элемент для перестановки: ");
	Scanner sc2 = new Scanner(System.in);
	int e = sc2.nextInt();
	
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			if(matrice[i][j] == e){
				matrice[i][j] = min;
			}
		}
	}
	
	System.out.println("Матрица после перестановки: ");
	for(int i = 0; i < n; i++){
		for(int j = 0; j < n; j++){
			System.out.print(matrice[i][j]);
		}
		System.out.println();
	}
	}
}

