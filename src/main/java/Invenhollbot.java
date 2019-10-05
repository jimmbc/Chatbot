import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Invenhollbot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());
    }

    public String getBotUsername() {
        return "Inventholl_bot";
    }

    public String getBotToken() {
        return "989540399:AAGQ9FW1mjwiJP1BbpnUL52hd7Zp2bmbmQs";
    }
}
