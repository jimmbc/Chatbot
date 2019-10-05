import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Invenhollbot extends TelegramLongPollingBot {
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());

        SendMessage message = new SendMessage();
        String command=update.getMessage().getText();
        if (command.equals("/saludame")){
            System.out.println(update.getMessage().getFrom().getFirstName());
            message.setText("Hola "+update.getMessage().getFrom().getFirstName()+ " me alegra poder ayudarte");
        }
        message.setChatId(update.getMessage().getChatId());
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public String getBotUsername() {
        return "Inventholl_bot";
    }

    public String getBotToken() {
        return "989540399:AAGQ9FW1mjwiJP1BbpnUL52hd7Zp2bmbmQs";
    }
}
