package arquivo_log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Errolog {

    private static final String LOG_FILE = "jogo_log.txt";
    private static final Logger logger = Logger.getLogger(Errolog.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler(LOG_FILE, true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);

            if (abrirJogo()) {
                logEvent("Usuário iniciou o jogo");
                
                logEvent("Usuário fechou o jogo");
            } else {
                logger.severe("Falha ao abrir o jogo: arquivo não encontrado.");
            }
        } catch (IOException e) {
            logger.severe("Erro ao criar o arquivo de log: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static boolean abrirJogo() {
        File jogoFile = new File("jogo.txt");
        if (jogoFile.exists()) {
            return true;
        } else {
            return false;
        }
      
    }

    private static void logEvent(String event) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String logMensagem = timestamp + " - " + event;
            escritor.write(logMensagem);
            escritor.newLine();
            logger.info(logMensagem);

        } catch (IOException e) {
            logger.severe("Erro ao escrever no arquivo de log: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

