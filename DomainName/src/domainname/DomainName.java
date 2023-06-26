/*
 //Fill in the missing code!
 */




import java.util.Scanner;
public class DomainName {
private String companyName;
   

    public DomainName(String companyName) {
        this.companyName = companyName;
       
    }
        
    @Override
    public String toString() {
        return "http://www." + companyName + ".com";
    }

    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the domain name:");
        String companyName = scanner.next();
        DomainName WebName = new DomainName(companyName);
        System.out.println(WebName);
    }
    
}
