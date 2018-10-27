
public class Test {

	public static void main(String[] args) {
		BankAccount x= new BankAccount("yosi","000001", 3000, true, -3000);
		
		x.deposit(-3000);
		System.out.println(x.getBalance());
		x.withdrawal(6000);
		System.out.println(x.getBalance());}

}
