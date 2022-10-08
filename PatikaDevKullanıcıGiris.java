
import java.util.Scanner;


public class PatikaDevKullanıcıGiris {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String username,password;
      
        
        System.out.print("Please Enter the Username :");
        username=scan.nextLine();
        System.out.print("Please Enter the Password :");
        password=scan.nextLine();
        
        if(username.equals("Patika")&& password.equals("Java123")){
            System.out.println("Giriş Başarılı Hoş Geldiniz.");
        }
        else{
            System.out.println("Giriş Başarısız.");
            System.out.println("Yeni sifre belirtmek isterseniz \"yes\"  istemezseniz \" no\"  secin  ");
            String sifresıfırlama=scan.nextLine();
        
        if( sifresıfırlama.equals("no")){
            System.out.println(" giris sonlandirildi ");}
        
        else if (sifresıfırlama.equals("yes")) {
            System.out.print("Yeni sifrenizi yazin :");
            String newPassword=scan.nextLine();
        
            if( newPassword.equals("Java123")|| newPassword.equals(password)){
                System.out.println(" Hatali giris tekrar dene ");
            }
            else{
                System.out.println(" sifrenizi basariyla yenilendi ");
                password=newPassword;

            }
            
        }
        else{
            System.out.println(" hatali secim sectiniz ");

        }
        
        }
    }
}
