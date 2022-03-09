package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String internetSubeButonu ="Ýnternet þubesi";
double dolarDun = 8.15;
int vade = 36;
double dolarBugun =8.15;
boolean dustuMu=false;

System.out.println(internetSubeButonu);

if(dolarBugun<dolarDun) {System.out.println("Dolar düþtü resmi");}

else if(dolarBugun>dolarDun) {System.out.println("Dolar yükseldi resmi");}

else {System.out.println("Dolar eþittir resmi");} 

String[] krediler = {
"hýzlý kredi",
"mutlu emekli kredisi",
"konut kredisi",
"çiftçi kredisi",
"msb kredisi",
"meb kredisi"
		
};
//foreach döngüsü
for(String kredi : krediler)
{System.out.println(kredi);}
//sade for kullanýmý
for(int i =0; i<krediler.length;i++) 
{System.out.println(krediler[i]);}

{
	
	}



	}}


