import java.util.ArrayList;


public class Main {

    public static String createName() {
        System.out.print("Digite o nome do usuário: ");
        String name = Reader.readString();
        return name;
    }

    public static String createLogin() {
        System.out.print("Digite o login do usuário: ");
        String login = Reader.readString();
        return login;
    }
    public static String createPassword() {
        System.out.print("Digite a senha: ");
        String password = Reader.readString();
        return password;
    }
    

    public static void main(String[] args) {
        
        ArrayList <User> users = new ArrayList<>();
        UserMaster userMaster = new UserMaster("Master", "master", "master123");

        users.add(new User(createName(), createLogin(), createPassword())); 
        users.add(new User(createName(), createLogin(), createPassword()));
        System.out.println(userMaster.getName());
  
        // Criação do user utilizando arraylist e funções pra isso além da criação do UserMaster para futuramente validar login 
        // e menu de acordo com as autorizações de cada user

        userMaster.changeAllData(userMaster, users.get(0));
        System.out.println(users.get(0).getName());
        

    }
}