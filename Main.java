package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String internetSubeButonu ="�nternet �ubesi";
double dolarDun = 8.15;
int vade = 36;
double dolarBugun =8.15;
boolean dustuMu=false;

System.out.println(internetSubeButonu);

if(dolarBugun<dolarDun) {System.out.println("Dolar d��t� resmi");}

else if(dolarBugun>dolarDun) {System.out.println("Dolar y�kseldi resmi");}

else {System.out.println("Dolar e�ittir resmi");} 

String[] krediler = {
"h�zl� kredi",
"mutlu emekli kredisi",
"konut kredisi",
"�ift�i kredisi",
"msb kredisi",
"meb kredisi"
		
};
//foreach d�ng�s�
for(String kredi : krediler)
{System.out.println(kredi);}
//sade for kullan�m�
for(int i =0; i<krediler.length;i++) 
{System.out.println(krediler[i]);}

{
	
	}



	}}


