/*
 * Задание 3.* Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей,
кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством,
указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    public void testLogoutNonAdminUsers() {
        User adminUser = new User("admin", true);
        User regularUser1 = new User("user1", false);
        User regularUser2 = new User("user2", false);
        UserRepository userRepository = new UserRepository();

        userRepository.addUser(adminUser);
        userRepository.addUser(regularUser1);
        userRepository.addUser(regularUser2);

        // Убедимся, что все пользователи залогинены
        assertTrue(adminUser.isLoggedIn());
        assertTrue(regularUser1.isLoggedIn());
        assertTrue(regularUser2.isLoggedIn());

        // Вызываем метод для разлогинивания всех пользователей, кроме администратора
        userRepository.logoutNonAdminUsers();

        // Убедимся, что администратор остался залогиненным
        assertTrue(adminUser.isLoggedIn());

        // Убедимся, что обычные пользователи разлогинены
        assertFalse(regularUser1.isLoggedIn());
        assertFalse(regularUser2.isLoggedIn());
    }
}
