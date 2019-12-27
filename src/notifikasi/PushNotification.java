package notifikasi;

public class PushNotification implements InterfaceNotifikasi{

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
    
}
