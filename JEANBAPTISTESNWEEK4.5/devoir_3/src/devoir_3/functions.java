package devoir_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;



public class functions 
{
	public static void repeated()
	{
		System.out.println("Entrer une chaine de caracteres");
		Scanner src=new Scanner(System.in);
		String value =src.nextLine();
		char table[]=value.toCharArray();

		ArrayList commun = new ArrayList();
		for(int i=0; i<table.length; i++)
		{
			for (int j=i+1; j<table.length; j++)
			{
				if(table[i]==table[j])
				{
					if(!commun.contains(table[i]))
						commun.add(table[i]);							
				}
			}
		}if(commun.isEmpty())
			System.out.println("\n"+"Ce string n'a  aucun caractere repete plus d'une fois");
		else
		System.out.print("Les caracters repetes plus d'une fois sont "+commun);
	}
		
	public static void max()
	{
		System.out.println("Entrez la quantite de nombres qu'il y aura dans votre arraylist");
		Scanner src=new Scanner(System.in);
		int qte=src.nextInt();
		ArrayList <Integer> mylist=new ArrayList();
		System.out.println("Remplissez le tableau");
		for(int i=0;i<qte;i++)
		{
			System.out.println("Valeur "+(i+1)+": ");
			int valeur=src.nextInt();
			mylist.add(valeur);
		}
		System.out.println(mylist);
		System.out.print("Les deux nombres les plus grands sont ");
		for(int i=0; i<mylist.size()-1;i++)
		{
			for(int j=0;j<mylist.size()-1;j++)
			
			{
				if((mylist.get(j+1))>=(mylist.get(j)))
				{
					int temp =mylist.get(j);
					mylist.set(j,mylist.get(j+1));
					mylist.set(j+1,temp);
				}			
			}
		}
		System.out.print(mylist.get(0)+" et "+mylist.get(1));
	}
	
	public static void map()
	{
		Map<Integer, Integer> map = new HashMap<>();
		System.out.println("Vous allez entrer combien de nombres?");
		Scanner src=new Scanner(System.in);
		int nb=src.nextInt();
		System.out.println("Inserez les nombres dans la carte");
		for(int i=1; i<=nb; i++)
		{
			System.out.print("Nombre "+i+" ");
			int valeur=src.nextInt();
			map.put(i,valeur);
		}
		System.out.println("Avant le tri de la carte");
		map.forEach((k,v)->System.out.println(k+": "+v));
		System.out.println("Apres le tri de la carte");
		List<Entry<Integer, Integer>> tri = new ArrayList<>(map.entrySet());
		tri.sort(Entry.comparingByValue());
		tri.forEach(System.out::println);
	}
	
	public static void commun()
	{
		System.out.println("Quelles sont les tailles des tableaux?");
		Scanner src=new Scanner(System.in);
		System.out.print("Taille 1: ");
		int size1=src.nextInt();
		int tab1[]=new int[size1];
		System.out.print("Taille 2: ");
		int size2=src.nextInt();
		int tab2[]=new int[size2];
		System.out.println("Inserez les valeurs du premier tableau");
		for(int i=0;i<size1;i++)
		{
			System.out.print("Valeur "+(i+1)+" ");
			int value=src.nextInt();
			tab1[i]=value;
		}
		System.out.println("Inserez les valeurs du deuxieme tableau");
		for(int i=0;i<size2;i++)
		{
			System.out.print("valeur "+(i+1)+" ");
			int value=src.nextInt();
			tab2[i]=value;
		}
		System.out.println("Voici les deux tableaux");
		System.out.println("Tableau 1");
		for(int i=0; i<tab1.length;i++)
		{
			System.out.print(tab1[i]+" ");
		}
		System.out.println("\n"+"Tableau 2");
		for(int i=0; i<tab2.length;i++)
		{
			System.out.print(tab2[i]+" ");
		}
		ArrayList common = new ArrayList();
		for(int i=0; i<tab1.length; i++)
		{
			for (int j=0; j<tab2.length; j++)
			{
				if(tab1[i]==tab2[j])
				{
					if(!common.contains(tab1[i]))
						common.add(tab1[i]);							
				}
			}
		}
		if(common.isEmpty())
			System.out.println("\n"+"Les tableaux n'ont rien en commun");
		else
		System.out.print("\n"+"Les elements communs des deux tableaux sont: "+common);
	}
	
	public static void swap()
	{
		Scanner src=new Scanner(System.in);
		System.out.println("Entrez le premier nombre");
		int x=src.nextInt();
		System.out.println("Entrez le deuxieme nombre");
		int y=src.nextInt();
		System.out.println("Avant le swaping: nb1="+x+ " et nb2="+y);
		x = x + y; 
	    y = x - y; 
	    x = x- y;
		System.out.println("Apres le swaping: nb1="+x+ " et nb2="+y);
	}
	
	public static void fibonacci()
	{
		System.out.println("Jusqu'a combien de termes voulez vous afficher la suite?");
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		int [] U= new int[n];
		System.out.println("Les "+n+" premiers termes de la suite sont");
		for(int i=0; i<n;i++)
		{
			if(i==0)
				U[i]=0;
			if(i==1)
				U[i]=1;
			if(i>1)
				U[i]=U[i-1]+U[i-2];
			System.out.println("U("+i+") ="+U[i]);
		}
	}
	
	public static void somme_chiffre()
	{
		int num;
		System.out.println("Entrez un nombre");
		Scanner src= new Scanner(System.in);
		num=src.nextInt();
		int somme=0;
		System.out.print("La somme des chiffres de "+num+ " est ");
		while(Math.log(num)>0)
		{
			int reste=num%10;
			num/=10;
			somme+=reste;
		}
		if(num==1)
			somme+=1;
		System.out.print(somme);
	}
	
	public static void nombre_premier()
	{
		System.out.println("Entrez le nombre");
		
		int nb;
		Scanner num=new Scanner(System.in);
		nb=num.nextInt();
		
		boolean premier=false;
		if(nb==1)
			premier=false;
		else if(nb%2==0 && nb!=2)
			premier=false;
		
		else if((nb%2)!=0)
		{
			int tab[]=new int [nb-2];
			for(int i=0; i<tab.length-2;i++)
			{
				tab[i]=i+2;
				if((nb%tab[i])==0)
				{
					i=tab.length-1;
					premier=false;
				}
				else
					premier=true;
			}
		}
		else if(nb==2)
			premier=true;
		
		if(premier)
			System.out.println(+nb+ " est un nombre premier");
		else
			System.out.println(+nb+ " n'est pas un nombre premier");
	}
	
	public static void armstrong()
	{
		int num;
		System.out.println("Entrez le nombre");
		Scanner src= new Scanner(System.in);
		num=src.nextInt();
		int nombre=num;
		int somme=0;
		int qte=0;
		while(Math.log(num)>0)
		{
			int reste=num%10;
			num/=10;
			qte++;
		}
		if(num==1)
			qte++;
		num=nombre;
		while(Math.log(num)>0)
		{
			int reste=num%10;
			num/=10;
			somme+=Math.pow(reste, qte);
		}
		if(num==1)
			somme+=1;
		if(somme==nombre || (nombre<10 && nombre>0))
			System.out.println(nombre+" est un nombre d'Armstrong");
		else
			System.out.println(nombre+" n'est pas un nombre d'Armstrong");
	}
	
	public static void bin_to_dec()
	{	
		boolean not_good=true;
	    while(not_good)
	    {
	    	System.out.println("Entrez le nombre binaire");
			Scanner src=new Scanner(System.in);
			String binary=src.next();
			char tab[]=binary.toCharArray(); 
	        for(int i=0; i<tab.length;i++)
	        {
	            if( tab[i]!=48 && tab[i]!=49)
	            {
	            	System.out.println("Mauvaise entree ");
	                not_good=true;
	                break;
	            }
	            else
	            {
	            	not_good=false;
	            	if(!not_good)
	            	{
	            		int somme=0,puissance=0;
		    	    	for(int j=tab.length-1; j>=0; j--)
		        		{
		        			int nb = 0;
		        			if((int)tab[j]==49)
		        				nb=1;
		        			if ((int)tab[j]==48)
		        				nb=0;
		        			somme= (int) (somme+nb*Math.pow(2, puissance));
		        			puissance++;
		        		}
		    	    	System.out.println(binary+" (2) = "+somme+" (10)");
		    	    	break;
	            	}
	         }
	      }
	    }
	}
	
}
















