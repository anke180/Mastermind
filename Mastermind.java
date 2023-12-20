import java.util.Random;
import java.util.Scanner;
public static void main(String[] args)
{
	//Random kleuren
	String[] kleuren = {"rood","groen","geel","blauw","paars","oranje"};
	
	//String codeMaker
	String[] codeMaker = new String[4];
	
	//Random
	Random rnd = new Random();
	
	//de code voor de codemaker
	for(int codeMakerCode = 0; codeMakerCode < 4; codeMakerCode++)
	{
	    codeMaker[codeMakerCode] = kleuren[rnd.nextInt(kleuren.length)];
	}
	
	//String codeKraker
	String[] codeKraker = new String [4];
	
	//Scanner
	Scanner sc = new Scanner(System.in);
	
	//Poging
	int poging = 1;
	
	//de berekening is hetzelfde, de waarde is anders
	do
	{
	    System.out.println("Dit is poging " + poging + " van de 10");
	    int kleur = 1;
	    //code voor de codeKraker
	    for(int codeKrakerCode = 0; codeKrakerCode < 4; codeKrakerCode++)
	    {
		 System.out.println("Kleur " + kleur);
		 codeKraker[codeKrakerCode] = sc.next();
		 kleur++;
	    }
	    
	    //Controle kleur1
	    if (codeKraker[0].equals(codeMaker[0]))
	    {
		System.out.println("1. Zwarte pion");
	    }else if (codeKraker[0].equals(codeMaker[1]) || codeKraker[0].equals(codeMaker[2]) || codeKraker[0].equals(codeMaker[3]))
	    {
		System.out.println("1. Witte pion");
	    }else
	    {
		System.out.println("1. Kleur is niet goed");
	    }
	    
	    //Controle kleur2
	    if (codeKraker[1].equals(codeMaker[1]))
	    {
		System.out.println("2. Zwarte pion");
	    }else if (codeKraker[1].equals(codeMaker[0]) || codeKraker[1].equals(codeMaker[2]) || codeKraker[1].equals(codeMaker[3]))
	    {
		System.out.println("2. Witte pion");
	    }else
	    {
		System.out.println("2. Kleur is niet goed");
	    }
	    
	    //Controle kleur3
	    if (codeKraker[2].equals(codeMaker[2]))
	    {
		System.out.println("3. Zwarte pion");
	    }else if (codeKraker[2].equals(codeMaker[1]) || codeKraker[2].equals(codeMaker[1]) || codeKraker[2].equals(codeMaker[3]))
	    {
		System.out.println("3. Witte pion");
	    }else
	    {
		System.out.println("3. Kleur is niet goed");
	    }
	    
	    //Controle kleur4
	    if (codeKraker[3].equals(codeMaker[3]))
	    {
		System.out.println("4. Zwarte pion");
	    }else if (codeKraker[3].equals(codeMaker[0]) || codeKraker[3].equals(codeMaker[1]) || codeKraker[3].equals(codeMaker[2]))
	    {
		System.out.println("4. Witte pion");
	    }else
	    {
		System.out.println("4. Kleur is niet goed");
	    }
	    
	   
	    //Controle 4 kleuren
	    if (codeMaker[0].equals(codeKraker[0])&&codeMaker[1].equals(codeKraker[1])&&codeMaker[2].equals(codeKraker[2])&&codeMaker[3].equals(codeKraker[3]))
	    {
		System.out.println("Gefeliciteerd! Je hebt de code gekraakt in: " + poging + " pogingen! :)");
		break;
	    }
	    
	    
	    //Stoppen na 10 pogingen
	    if (poging == 10)
	    {
		System.out.println("Helaas, het is je niet gelukt om de code te kraken. Volgende keer beter! :(");
		System.out.println("Dit was de code die je had moeten raden:");
		System.out.println(codeMaker[0]);
		System.out.println(codeMaker[1]);
		System.out.println(codeMaker[2]);
		System.out.println(codeMaker[3]);
		break;
	    }
	    
	    //Poging ++
	    poging++;
	
	}
	while(poging <= 10);
	
	
	sc.close();    
	
}