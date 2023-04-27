/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModSoftbot;

import ThreadSoft.findThread;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Marcola_Dev
 */
public class modBotFindMen {

    static ChromeOptions chromeOptions = new ChromeOptions();
    static WebDriver driver = new ChromeDriver(chromeOptions);
    
    private int lastMenssageCount;
    private List<WebElement> messageElement;
    private WebElement latestMessageElement;
    private int messageCount;
    private String lastestMessage;
    private String messageInputUs;
    private WebElement messageInput;
    private modResponseMen men;

    public int getLastMenssageCount() {
        return lastMenssageCount;
    }

    public void setLastMenssageCount(int lastMenssageCount) {
        this.lastMenssageCount = lastMenssageCount;
    }

    public List<WebElement> getMessageElement() {
        return messageElement;
    }

    public void setMessageElement(List<WebElement> messageElement) {
        this.messageElement = messageElement;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public WebElement getLatestMessageElement() {
        return latestMessageElement;
    }

    public void setLatestMessageElement(WebElement latestMessageElement) {
        this.latestMessageElement = latestMessageElement;
    }

    public String getLastestMessage() {
        return lastestMessage;
    }

    public void setLastestMessage(String lastestMessage) {
        this.lastestMessage = lastestMessage;
    }

    public String getMessageInputUs() {
        return messageInputUs;
    }

    public void setMessageInputUs(String MessageInputUs) {
        this.messageInputUs = MessageInputUs;
    }

    public WebElement getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(WebElement messageInput) {
        this.messageInput = messageInput;
    }

    public String findMessage() throws InterruptedException {

        driver.get("https://web.whatsapp.com/");
        Thread.sleep(Duration.ofSeconds(20));

        this.lastMenssageCount = 0;
        while (true) {

            this.messageElement = driver.findElements(By.cssSelector("#pane-side > div > div > div"));
            this.messageCount = this.messageElement.size();

            if (this.messageCount > lastMenssageCount) {

                this.latestMessageElement = this.messageElement.get(this.messageCount - 1);
                this.lastestMessage = this.latestMessageElement.getText();

                do {
                    this.messageInput = driver.findElement(By.cssSelector("#pane-side > div > div > div > div:nth-child(1) > div > div > div > div._8nE1Y > div._2KKXC > div.Dvjym > span:nth-child(1) > div > span"));
                    this.messageInputUs = this.messageInput.getText();

                    if (this.messageInputUs != null) {
                        men.sendMessage();
                    }
                } while (this.messageInputUs == null);
            }
        }       
    }

    public void startThreads() {

       
        Thread thread1 = new Thread(new findThread());
        Thread thread2 = new Thread(new findThread());

        // iniciar as threads
        thread1.start();
        thread2.start();

    }
}
