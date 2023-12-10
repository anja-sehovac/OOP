import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage {}

@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission {
    int value();
}

class User {
    String username;

    User(String username) {
        this.username = username;
    }
}

@UserPermission(1)
class Admin extends User {
    Admin(String username) {
        super(username);
    }
}

class MessagingSystem {
    @CanSendMessage
    @RequiresPermission("admin")
    public void sendMessage(User user, String message) {
        if (user instanceof Admin) {
            System.out.println("Message sent by Admin: " + user.username + " - Message: " + message);
        } else {
            System.out.println("User " + user.username + " is restricted from sending messages.");
        }
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Alice");
        Admin adminUser = new Admin("Bob");

        System.out.println("Demonstrating sendMessage with regular user:");
        messagingSystem.sendMessage(regularUser, "Hello, there!");

        System.out.println("\nDemonstrating sendMessage with admin user:");
        messagingSystem.sendMessage(adminUser, "Important message!");
    }
}
