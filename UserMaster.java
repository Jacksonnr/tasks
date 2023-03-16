public class UserMaster extends User {

    // Criação do UserMaster, e como administrador ele vai ter permissões adicionais
    // que o User não possui,
    // como alteração de cadastro do User, e poder excluir Tasks urgentes.

    public UserMaster(String name, String login, String password) {
        super(name, login, password);
        // TODO Auto-generated constructor stub
    }

    public void authentication(UserMaster userMaster) {
        String login, password;
        do {
            System.out.print("Informe o login: ");
            login = Reader.readString();
            System.out.print("Informe a senha: ");
            password = Reader.readString();
            if (!login.equals(userMaster.getLogin()) || !password.equals(userMaster.getPassword())) {
                System.out.println("Dados informados inválidos, tente novamente.");
            }
        } while (!login.equals(userMaster.getLogin()) || !password.equals(userMaster.getPassword()));
        System.out.println("Autenticação realizada com sucesso!");

    }

    public void changeAllData(UserMaster UserMaster, User user) {
        authentication(UserMaster);
        System.out.print("Digite o novo login: ");
        String newLogin = Reader.readString();
        user.setLogin(newLogin);
        System.out.print("Digite o novo nome: ");
        String newName = Reader.readString();
        user.setName(newName);
        System.out.print("Digite a nova senha: ");
        String newPassword = Reader.readString();
        user.setPassword(newPassword);

    }

    public void changeLogin(UserMaster userMaster, User user) {
        authentication(userMaster);
        System.out.print("Digite o novo login: ");
        String newLogin = Reader.readString();
        user.setLogin(newLogin);
    }

    public void changeName(UserMaster userMaster, User user) {
        authentication(userMaster);
        System.out.print("Digite o novo nome: ");
        String newName = Reader.readString();
        user.setName(newName);
    }

    public void changePassword(UserMaster userMaster, User user) {
        authentication(userMaster);
        System.out.print("Digite o novo login: ");
        String newPassword = Reader.readString();
        user.setPassword(newPassword);
    }


}
