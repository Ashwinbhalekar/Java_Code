/*Q4. Create an interface for a simple messaging system and implement it in classes representing
different messaging services.
a. Define the MessagingService interface with methods for sending and receiving messages.
b. Create three classes (EmailService, SMSService, and ChatService) that implement the
MessagingService interface. Each class provides its own implementation of the send and
receives methods.
c. In the Main class, create instances of the above classes, representing different messaging
services. Demonstrate how to send and receive messages using these services.*/
package InterfacePractice;
interface messagingServices{
    void sendMessage(String message);
    void receiveMessage();
} 
class EmailService implements messagingServices{
    @Override
     public void sendMessage(String message){
        System.out.println("Email has been Sent...");
    }
     @Override
     public void receiveMessage(){
         System.out.println("Email received...");
     }
}
class SMSService implements messagingServices{
    @Override
    public void sendMessage(String message){ 
        System.out.println("SMS has been sent..");
    }
    @Override
    public void receiveMessage(){
        System.out.println("Recevied SMS...");
    }
}
class ChatService implements messagingServices{
    @Override
    public void sendMessage(String message){
        System.out.println("Message sent..");
    }
    @Override
    public void receiveMessage(){
        System.out.println("Message Sent...");
    }
}

public interface SimpleMsgSystem {
    public static void main(String[] arg){
        messagingServices ms;
        ms = new EmailService();
        ms.sendMessage(" ");
        ms.receiveMessage();
        ms = new SMSService();
        ms.sendMessage(" ");
        ms.receiveMessage();
        ms = new ChatService();
        ms.sendMessage(" ");
        ms.receiveMessage();
    }
}
