import java.util.Scanner;

public class movietheatrebookingSystemmsi{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Regstered people:");
        int audience=sc.nextInt();
        for(int person=1;person<=audience;person++){
            System.out.println("Ticket booking for person: "+person);
            System.out.print("Slect Theatre Type(1=Premium,2=VIP):");
            int seatType=sc.nextInt();
            int maxSeats=0;
            int ticketPrice=0;
            int totalpurchased=0;
            int totalcancelled=0;
            double totalPayment=0.0;
            if(seatType==1){
                maxSeats=30;
                ticketPrice=500;
            }else if(seatType==2){
               maxSeats=11;
                ticketPrice=650;
            }
            System.out.println("Enter number of tickets:");
            int tickets=sc.nextInt();
            if(tickets>10){
                System.out.println("Exceeds maximum Limit,Retry AGIAN");
                person--;
                continue;

            }
            for (int ticket=1;ticket<=tickets;tickets++){
                System.out.println("Enter Seat Number ");
                int seatNumber=sc.nextInt();
                if (seatNumber>=1){
                if(seatNumber<=maxSeats){
                    totalpurchased++;
                }else{
                     totalcancelled++;
                }
            }else{
                    totalcancelled++;

                }

            }
            totalPayment=totalpurchased*ticketPrice;
            System.out.println("Total Tickets Purchased:"+totalpurchased);
            System.out.println("Total tickets Cancelled"+totalcancelled);
            System.out.println("Total Payment");
        }
        

    }
}
