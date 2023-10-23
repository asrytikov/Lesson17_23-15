package p1;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("client.dt"))){
            Client client = new Client("Ivan", 1, 100.50);
            objectOutputStream.writeObject(client);
        }catch (IOException exception){
        }

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Client("Masha", 2, 100));
        clients.add(new Client("Alex", 3, 200));

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("clients.dt"))) {
            objectOutputStream.writeObject(clients);
        }catch(IOException ex){}

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("client.dt"))) {
            Client client = (Client)objectInputStream.readObject();
            System.out.printf("Data client: %s %.2f \n", client.getName(), client.getCount());
        }catch (IOException exception){
        }catch (ClassNotFoundException ex){}


    }
}
