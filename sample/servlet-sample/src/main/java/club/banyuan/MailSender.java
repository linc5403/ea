package club.banyuan;


import java.util.logging.Logger;

public class MailSender {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private String mailAddr;

    public MailSender(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public void sendMail(String recv) {
        logger.info("send mail to " + recv + "!!!");
    }
}
