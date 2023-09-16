package invoice;

public class Invoice {


	public static void main(String[] args) {
	String regno="C026-01-0910/2022";
	String date="28/04/2020";
	String fullName="Ngari Peter Ndung'u";
	String contactNumber="0100100100";
	//item quantity
	int pencil=4;
	int duster=10;
	int pens=9;
	int crayon=10;
	//item description
	String item1="Pencil";
	String item2="Duster";
	String item3="Pens";
	String item4="Crayon";
	//unit price
	int unit1=20;
	int unit2=50;
	int unit3=30;
	int unit4=80;
	//amount
	double pencil1=pencil*unit1;
	String formattedVariable1= String.format("%.2f", pencil1);
	double duster2=duster*unit2;
	String formattedVariable2= String.format("%.2f", duster2);
	double pens3=pens*unit3;
	String formattedVariable3= String.format("%.2f", pens3);
	double crayon4=crayon*unit4;
	String formattedVariable4= String.format("%.2f", crayon4);
	double subTotal=pencil1+duster2+pens3+crayon4;
	String formattedVariable5=String.format("%.2f", subTotal);
	double vat=0.16*(float)subTotal;
	String formattedVariable6=String.format("%.2f", vat);
	double totalAmount=vat+subTotal;
	String formattedVariable7=String.format("%.2f",totalAmount);
	System.out.println("*************************Adamson Computers Ltd***************************");
	System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City  *  Tel. No:123-4567");
	System.out.println("                 VAT REG. TIN 098-765-4321-0000");
	System.out.println("                          SALES INVOICE");
	System.out.println("");
	System.out.println("");
    System.out.print("Sold to:"+regno);
    System.out.println("                              Date:"+date);
    System.out.print("Address:"+fullName);
    System.out.println("                            Contact Number:"+contactNumber);
    System.out.println("");
    System.out.println("");
    System.out.println("===========================================================================================");
    System.out.println("Qty     |        Item Description       |        Unit Price      |Amount");
    System.out.println("===========================================================================================");
    System.out.print(pencil);
    System.out.print("       |        ");
    System.out.print(item1);
    System.out.print("                 |        ");
    System.out.print(unit1);	
    System.out.print("              |");
    System.out.println(formattedVariable1);
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.print(duster);
    System.out.print("      |        ");
    System.out.print(item2);
    System.out.print("                 |        ");
    System.out.print(unit2);	
    System.out.print("              |");
    System.out.println(formattedVariable2);
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.print(pens);
    System.out.print("       |        ");
    System.out.print(item3);
    System.out.print("                   |        ");
    System.out.print(unit3);	
    System.out.print("              |");
    System.out.println(formattedVariable3);
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.print(crayon);
    System.out.print("      |        ");
    System.out.print(item4);
    System.out.print("                 |        ");
    System.out.print(unit4);	
    System.out.print("              |");
    System.out.println(formattedVariable4);
    System.out.println("===========================================================================================");
    System.out.print("                                                |Sub Total       |");
    System.out.println(formattedVariable5);
    System.out.println("                                                ===========================================");
    System.out.println("                                                |VAT(16%)        |"+formattedVariable6);
    System.out.println("                                                ===========================================");
    System.out.println("                                                |Total Amount    |"+formattedVariable7);
    System.out.println("                                                ===========================================");
	}

}
