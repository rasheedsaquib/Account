package bankaccount;

import java.util.Random;

public class Banking {
		public static void main(String[] args) {
			long min=100000000000000l;
			long max=422347203685477l;
			Account a=new Account();
			SavingAc s= new SavingAc();
			Person p=new Person();
			Random r= new Random();
			CurrentAcc c1=new CurrentAcc();
			
			
			
			
			long accNum1 = r.nextLong(min,max);
			a.setAccNum(accNum1);
			p.setName("smith");
			p.setAge(25);
			a.setBalance(2000);
			a.setAccHolder(p.getName());
			System.out.println("Account holder name: "+a.getAccHolder());
			System.out.println("Account No: "+a.getAccNum());
			System.out.println("balance : "+a.getBalance());
			a.deposit(2000);
			s.setC(a.getBalance());
			c1.setBal(a.getBalance());
			System.out.println(c1.getBal());
			c1.withdraw(15000);
			System.out.println("\n");
			

			
			
			
			long accNum=r.nextLong(min,max);
			a.setAccNum(accNum);
			p.setName("kathy");
			p.setAge(21);
			a.setBalance(3000);
			a.setAccHolder(p.getName());
			System.out.println("Account holder name: "+a.getAccHolder());
			System.out.println("Account No: "+a.getAccNum());
			System.out.println("balance : "+a.getBalance());
			a.withDraw(2000);
			s.setC(a.getBalance());
			c1.setBal(a.getBalance());
			c1.withdraw(4000);
			System.out.println("\n");
			
			
			
			
			
			
			
			

		}

	}
