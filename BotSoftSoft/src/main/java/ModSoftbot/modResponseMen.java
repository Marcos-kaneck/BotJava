/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModSoftbot;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


/**
 *
 * @author Marcola_Dev
 */
public class modResponseMen extends modBotFindMen{
    
    static String quebra = " " + Keys.SHIFT + Keys.ENTER + Keys.SHIFT;
    private String Verificar;
    private String MenInicitial = ("Bem Vindo Ao Atendimento da Empresa HiperHaus Oque Você precisa?⬇️"
                + quebra + "1 Hiperhaus"
                + quebra + "2 Pagina Web - HiperHaus");
    private WebElement mensageUser;

    public String getVerificar() {
        return Verificar;
    }

    public void setVerificar(String Verificar) {
        this.Verificar = Verificar;
    }

    public WebElement getMensageUser() {
        return mensageUser;
    }

    public void setMensageUser(WebElement mensageUser) {
        this.mensageUser = mensageUser;
    }
    
    public void sendMessage() throws InterruptedException{
        
        driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys( MenInicitial, Keys.ENTER);
        
        mensageUser = driver.findElement(By.cssSelector("#main > div._2gzeB > div > div._5kRIK > div.n5hs2j7m.oq31bsqd.gx1rr48f.qh5tioqs > div:nth-child(21) > div > div > div.ItfyB._3nbHh > div._27K43 > div.copyable-text > div > span._11JPr.selectable-text.copyable-text > span"));
        Verificar = mensageUser.getText();
        
        Thread.sleep(Duration.ofSeconds(20));
        
        switch(Verificar){
            
            case "1" ->{
                modResponseEmpresaBot resp = null;                
                resp.responseEmpresaMod();
            }
            //site web
            case "2" ->{
                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("", Keys.ENTER);
            }
            default ->{
                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("Valor Invalido", Keys.ENTER);
            }
        }
    }
}
