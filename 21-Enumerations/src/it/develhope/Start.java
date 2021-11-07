package it.develhope;

public class Start {

    public static void main(String ...args){

        User lorenzo = new User(UserTypeEnum.ADMIN, "Lorenzo", "De Francesco", "lory1990");
        User giulio = new User(UserTypeEnum.ADMIN, "Giulio", "Verdi", "giu875");
        User mario = new User(UserTypeEnum.EDITOR, "Mario", "Rossi", "mario2020");
        User elena = new User(UserTypeEnum.LOGGED, "Elena", "Bianchi", "ele859");

        System.out.println("-------------------------------");
        printUserType(lorenzo);
        printUserType(mario);
        printUserType(elena);
        System.out.println("-------------------------------");

        System.out.println("Lorenzo " + lorenzo.type.isAdmin());
        System.out.println("Giulio " + giulio.type.isAdmin());
        System.out.println("Mario " + mario.type.isAdmin());
        System.out.println("Elena " + elena.type.isAdmin());

        System.out.println("-------------------------------");

        System.out.println("Are lorenzo and giulio equals type? " + (lorenzo.type == giulio.type));

        UserTypeEnum[] values = UserTypeEnum.values();
        UserTypeEnum[] valuesII = UserTypeEnum.values();

        UserTypeEnum adminValue =  UserTypeEnum.valueOf("ADMIN");
        System.out.println("-------------------------------");
    }

    public static void printUserType(User user){
        System.out.println("UserName " + user.getCompleteName());
        System.out.println("User permission are " + user.type);
        switch(user.type){
            case ADMIN:
                System.out.println("The user is admin");
                break;
            case EDITOR:
                System.out.println("The user is editor");
                break;
            case LOGGED:
                System.out.println("The user is registered");
                break;
            case GUEST:
                System.out.println("The user is guest");
                break;
            default:
                System.out.println("The user is NOT DEFINED");
                break;
        }
    }
}
