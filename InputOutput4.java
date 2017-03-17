import java.util.Scanner;
public class InputOutput4 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String nama ;
	char jeniskelamin ;
	int tinggibadan ;
	boolean menikah ;

	System.out.print ("masukkan nama: ");
	nama = input.nextLine();

	System.out.print ("jenis kelamin: ");
	jeniskelamin = input.next().charAt(0);

	System.out.print ("masukan tinggi badan: ");
	tinggibadan = input.nextInt();

	System.out.print ("masukkan status menikah: ");
	menikah = input.nextBoolean();
	}
}